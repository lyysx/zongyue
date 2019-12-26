package com.shiki.zongyue.controller;


import com.shiki.zongyue.pojo.Fiction;
import com.shiki.zongyue.pojo.Genre;
import com.shiki.zongyue.service.FictionService;
import com.shiki.zongyue.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FictionController {
    @Autowired
    private FictionService fictionService;

    @Autowired
    private GenreService genreService;





    @RequestMapping(value = "modify_fiction_info")
//    @ResponseBody
    public String modifyFictionInfo(Fiction fiction) {
        System.out.println(fiction);
        return "redirect:author_fiction_detail?fiction_id="+ fiction.getFiction_id();
    }
}
