package com.shiki.zongyue.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shiki.zongyue.EnumForState.ChapterOrderBy;
import com.shiki.zongyue.EnumForState.ChapterState;
import com.shiki.zongyue.pojo.*;
import com.shiki.zongyue.service.*;
import com.shiki.zongyue.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ForeController {

    @Autowired
    private FictionService fictionService;

    @Autowired
    private GenreService genreService;

    @Autowired
    private ChapterService chapterService;

    @Autowired
    private PromotionsService promotionsService;

    @Autowired
    private PromotionService promotionService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        List<Fiction> fictionsByRecommend = fictionService.topTenFictions();
        List<Genre> genres = genreService.list();
        Promotions promotions = promotionsService.getOnline();
        List<Promotion> promotionList = null;
        if (promotions != null) {
            promotionList = promotionService.list(promotions.getPromotions_id());
        }
        model.addAttribute("banners", promotionList);
        model.addAttribute("fictionsByRecommend", fictionsByRecommend);
        model.addAttribute("genres", genres);
        return "fore/index";
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public String all(Model model) {
        List<Fiction> fictions = fictionService.listAll(false);
        model.addAttribute("fictions", fictions);
        return "fore/all";
    }

    @RequestMapping(value = "rank", method = RequestMethod.GET)
    public String rank(Model model) {
        List<Fiction> fictions = fictionService.listAll(true);
        model.addAttribute("fictions", fictions);
        return "fore/rank";
    }

    @RequestMapping(value = "fiction/{id}", method = RequestMethod.GET)
    public String getFiction(@PathVariable("id") int fiction_id, Model model, HttpSession httpSession) {
        Fiction fiction = fictionService.get(fiction_id);
        List<Chapter> chapters = chapterService.list(fiction_id, ChapterState.PUBLISHED, ChapterOrderBy.CHAPTER_ASC);
        User user = (User) httpSession.getAttribute("user");
        Integer startChapterID;
        if (null == user) {
            startChapterID = chapterService.getStartChapterID(fiction_id, null);
        } else {
            startChapterID = chapterService.getStartChapterID(fiction_id, user.getUser_id());
        }
        model.addAttribute("startChapterID", startChapterID);
        model.addAttribute("fiction", fiction);
        model.addAttribute("chapters", chapters);
        return "fore/fiction/fiction";
    }

    @RequestMapping(value = "genre/{id}", method = RequestMethod.GET)
    public String getGenre(@PathVariable("id") int genre_id, Model model) {
        List<Fiction> fictions = fictionService.listByGenre(genre_id);
        model.addAttribute("fictionByGenre", fictions);
        return "fore/genreFiction";
    }

    @RequestMapping(value = "chapter/{id}", method = RequestMethod.GET)
    public String readChapter(@PathVariable("id") int chapter_id, Model model) {
        Chapter chapter = chapterService.get(chapter_id);
        Fiction fiction = fictionService.get(chapter.getFiction_id());
        Integer nextChapterID = chapterService.getNextChapterID(chapter.getFiction_id(), chapter_id);
        Integer previousChapterID = chapterService.getPreviousChapterID(chapter.getFiction_id(), chapter_id);
        model.addAttribute("next", nextChapterID);
        model.addAttribute("previous", previousChapterID);
        model.addAttribute("chapter", chapter);
        model.addAttribute("fiction", fiction);
        return "fore/fiction/fictionReader";
    }
}
