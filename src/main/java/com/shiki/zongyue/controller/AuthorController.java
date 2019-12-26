package com.shiki.zongyue.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shiki.zongyue.EnumForState.ChapterOrderBy;
import com.shiki.zongyue.EnumForState.ChapterState;
import com.shiki.zongyue.pojo.Author;
import com.shiki.zongyue.pojo.Chapter;
import com.shiki.zongyue.pojo.Fiction;
import com.shiki.zongyue.pojo.Genre;
import com.shiki.zongyue.service.AuthorService;
import com.shiki.zongyue.service.ChapterService;
import com.shiki.zongyue.service.FictionService;
import com.shiki.zongyue.service.GenreService;
import com.shiki.zongyue.util.ImageSaver;
import com.shiki.zongyue.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/author")
public class AuthorController {


    @Autowired
    private AuthorService authorService;
    @Autowired
    private FictionService fictionService;
    @Autowired
    private ChapterService chapterService;
    @Autowired
    private GenreService genreService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String authorLoginPage() {
        return "author/authorLogin";
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String authorHome() {
        return "author/authorHome";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String authorLogin(@RequestParam("author_login_name") String author_login_name, @RequestParam("author_password") String author_password,
                              HttpSession httpSession, Model model) {
        Author author = authorService.get(author_login_name, author_password);
        if (null != author) {
            httpSession.setAttribute("author", author);
            return "redirect:/author/home";
        }
        model.addAttribute("infoMsg", "账号密码错误");
        return "author/authorLogin";
    }


    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String authorRegisterPage() {
        return "author/authorRegisterPage";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String authorRegister(Author author) {
        String name = author.getAuthor_login_name();
        author.setAuthor_login_name(HtmlUtils.htmlEscape(name));
        if (authorService.isExitLoginName(author.getAuthor_login_name())) {
            authorService.add(author);
            return "author/authorRegisterResult";
        }
        return "redirect:/author/register";

    }

    @RequestMapping(value = "/fiction/add",method = RequestMethod.GET)
    public String authorCreateFiction(Model model) {
        List<Genre> genreList = genreService.list();
        model.addAttribute("genreList", genreList);
        model.addAttribute("fiction", new Fiction());
        return "author/fiction/createFiction";
    }

    @RequestMapping(value = "/fiction/add",method = RequestMethod.POST)
    public String authorCreatedFiction(Fiction fiction, HttpSession httpSession,
                                       @RequestParam(value = "uploadImage",required = false) MultipartFile multipartFile){
        Author author = (Author) httpSession.getAttribute("author");
        if (!multipartFile.isEmpty()) {
            String imageName = ImageSaver.uploadImageSave(httpSession.getServletContext().getRealPath("img/fictionImage"),
                    author.getAuthor_id(), multipartFile);
            fiction.setFiction_image(imageName);
        }
        fiction.setAuthor_id(author.getAuthor_id());

        fictionService.add(fiction);
        return "author/fiction/createFictionResult";
    }

    @RequestMapping(value = "/fiction/list",method = RequestMethod.GET)
    public String authorMyFiction(HttpSession httpSession, Model model, Page page) {
        Author author = (Author) httpSession.getAttribute("author");
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Fiction> fictionList = fictionService.listByAuthor(author.getAuthor_id());
        int total = (int) new PageInfo<>(fictionList).getTotal();
        page.setTotal(total);
        model.addAttribute("fictionList", fictionList);
        return "author/fiction/myFiction";
    }

    @RequestMapping(value = "/fiction/setting/{id}",method = RequestMethod.GET)
    public String authorFictionSetting(Model model, @PathVariable("id") int fiction_id) {
        Fiction fiction = fictionService.get(fiction_id);
        List<Genre> genreList = genreService.list();
        model.addAttribute("fiction", fiction);
        model.addAttribute("genres", genreList);
        return "author/fiction/loadJsp/settingJsp";
    }

    @RequestMapping(value = "/login_out",method = RequestMethod.DELETE)
    public String authorLoginOut(HttpSession httpSession) {
        httpSession.removeAttribute("author");
        return "redirect:/author/register";
    }


    @RequestMapping(value = "/fiction/{id}",method = RequestMethod.GET)
    public String authorFictionDetail(@PathVariable("id") int fiction_id, Model model){
        Fiction fiction = fictionService.get(fiction_id);
        model.addAttribute("fiction", fiction);
        return "author/fiction/authorFictionDetail";
    }




    @RequestMapping(value = "/chapter/list/draft/{id}",method = RequestMethod.GET)
    public String chapterDraftsLeft(Model model, @PathVariable("id") int fiction_id) {
        List<Chapter> chapters = chapterService.list(fiction_id, ChapterState.DRAFT, ChapterOrderBy.TIME_DESC);
        model.addAttribute("chapters", chapters);
        return "author/fiction/loadJsp/draftsLeft";
    }

    @RequestMapping(value = "/chapter/list/published/{id}",method = RequestMethod.GET)
    public String chapterPublishedLeft(Model model, @PathVariable("id") int fiction_id) {
        List<Chapter> chapters = chapterService.list(fiction_id, ChapterState.PUBLISHED, ChapterOrderBy.TIME_DESC);
        model.addAttribute("chapters", chapters);
        return "author/fiction/loadJsp/publishedLeft";
    }

    @RequestMapping(value = "/chapter/list/recycle/{id}",method = RequestMethod.GET)
    public String chapterRecycleBinLeft(Model model, @PathVariable("id") int fiction_id) {
        List<Chapter> chapters = chapterService.list(fiction_id, ChapterState.RECYCLE, ChapterOrderBy.TIME_DESC);
        model.addAttribute("chapters", chapters);
        return "author/fiction/loadJsp/recycleLeft";
    }



    @RequestMapping(value = "/chapter/detail/{id}",method = RequestMethod.GET)
    public String chapterDetailRight(Model model, @PathVariable("id") int chapter_id) {
        Chapter chapter = chapterService.get(chapter_id);
        model.addAttribute("chapter", chapter);
        return "author/fiction/loadJsp/draftsRight";
    }

    @RequestMapping(value = "/chapter/published/{id}",method = RequestMethod.GET)
    public String chapterPublishedRight(Model model, @PathVariable("id") int chapter_id) {
        Chapter chapter = chapterService.get(chapter_id);
        model.addAttribute("chapter", chapter);
        return "author/fiction/loadJsp/publishedRight";
    }

    @RequestMapping(value = "/chapter/recycle/{id}",method = RequestMethod.GET)
    public String chapterRecycleRight(Model model, @PathVariable("id") int chapter_id) {
        Chapter chapter = chapterService.get(chapter_id);
        model.addAttribute("chapter", chapter);
        return "author/fiction/loadJsp/recycleRight";
    }


    @RequestMapping(value = "/chapter/empty",method = RequestMethod.GET)
    public String refreshContent() {
        return "author/fiction/loadJsp/noContent";
    }




    @RequestMapping(value = "/chapter",method = RequestMethod.POST)
    @ResponseBody
    public Map fictionChapterCreate(@RequestParam("fiction_id") int fiction_id) {
        chapterService.add(fiction_id);
        Map<String, String> map = new HashMap<>();
        map.put("state", "success");
        return map;
    }


    @RequestMapping(value = "/login_name_ajax",method = RequestMethod.GET)
    @ResponseBody
    public Map authorLoginNameAjax(@RequestParam("author_login_name") String author_login_name) {
        Map<String, String> map = new HashMap<>();
        if (authorService.isExitLoginName(author_login_name)) {
            map.put("state", "success");
        } else {
            map.put("state", "fail");
        }
        return map;
    }

    @RequestMapping(value = "/name_ajax",method = RequestMethod.GET)
    @ResponseBody
    public Map authorNameAjax(@RequestParam("author_name") String author_name) {
        Map<String, String> map = new HashMap<>();
        if (authorService.isExitname(author_name)) {
            map.put("state", "success");
        } else {
            map.put("state", "fail");
        }
        return map;
    }
    @RequestMapping(value = "/name_ajax",method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, String> authorNameUpdate(@RequestParam("author_name") String author_name, HttpSession httpSession) {
        Author author = (Author) httpSession.getAttribute("author");
        author.setAuthor_name(author_name);
        authorService.update(author);
        Map<String, String> map = new HashMap<>();
        map.put("state", "success");
        return map;
    }




}
