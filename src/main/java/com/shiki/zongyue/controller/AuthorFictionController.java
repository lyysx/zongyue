package com.shiki.zongyue.controller;

import com.shiki.zongyue.EnumForState.ChapterState;
import com.shiki.zongyue.pojo.Chapter;
import com.shiki.zongyue.pojo.Fiction;
import com.shiki.zongyue.service.ChapterService;
import com.shiki.zongyue.service.FictionService;
import com.shiki.zongyue.service.GenreService;
import com.shiki.zongyue.util.ImageSaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/12/3
 **/

@Controller
public class AuthorFictionController {

    @Autowired
    private GenreService genreService;

    @Autowired
    private FictionService fictionService;

    @Autowired
    private ChapterService chapterService;




    @RequestMapping(value = "update_fiction_info", method = RequestMethod.PUT)
    @ResponseBody
    public void updateFictionInfo(Fiction fiction,@RequestParam(value = "fImg",required = false) MultipartFile image,HttpSession httpSession) {
        if (!image.isEmpty()) {
            String imageName = fictionService.get(fiction.getFiction_id()).getFiction_image();
            if (imageName == "0") {
                ImageSaver.uploadImageSave(httpSession.getServletContext().getRealPath("img/fictionImage"),
                        fictionService.get(fiction.getFiction_id()).getAuthor_id(), image);
            } else {
                ImageSaver.saveImage(httpSession.getServletContext().getRealPath("img/fictionImage"), image, imageName);
            }
        }
        fictionService.update(fiction);

    }








    @RequestMapping(value = "chapter_save_ajax",method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, String> chapterSaveAjax(Chapter chapter, @RequestParam("chapter_context") String chapter_context) {
        chapter.setChapter_context(chapter_context);
        chapterService.update(chapter);
        Map<String, String> map = new HashMap<>();
        map.put("state", "success");
        return map;
    }

    @RequestMapping(value = "chapter_publish_ajax",method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, String> chapterPublishAjax(Chapter chapter) {
        chapter.setChapter_state(ChapterState.PUBLISHED.getStatus());
        chapterService.update(chapter);
        Map<String, String> map = new HashMap<>();
        map.put("state", "success");
        return map;

    }

    @RequestMapping(value = "chapter_recycle_ajax",method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, String> chapterRecycleAjax(Chapter chapter) {
        chapter.setChapter_state(ChapterState.RECYCLE.getStatus());
        chapterService.update(chapter);
        Map<String, String> map = new HashMap<>();
        map.put("state", "success");
        return map;
    }

    @RequestMapping(value = "chapter_drafts_ajax",method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, String> chapterDraftsAjax(Chapter chapter) {
        chapter.setChapter_state(ChapterState.DRAFT.getStatus());
        chapterService.update(chapter);
        Map<String, String> map = new HashMap<>();
        map.put("state", "success");
        return map;
    }

    @RequestMapping(value = "chapter_delete_ajax",method = RequestMethod.DELETE)
    @ResponseBody
    public Map<String, String> chapterDeleteAjax(@RequestParam("chapter_id") int chapter_id) {
        chapterService.delete(chapter_id);
        Map<String, String> map = new HashMap<>();
        map.put("state", "success");
        return map;
    }
}
