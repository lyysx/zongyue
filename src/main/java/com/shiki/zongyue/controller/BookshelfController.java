package com.shiki.zongyue.controller;

import com.shiki.zongyue.pojo.Bookshelf;
import com.shiki.zongyue.pojo.BookshelfKey;
import com.shiki.zongyue.pojo.User;
import com.shiki.zongyue.service.BookshelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/11/9
 **/
@Controller
@RequestMapping("")
public class BookshelfController {

    @Autowired
    private BookshelfService bookshelfService;

    @RequestMapping("join_bookshelf_ajax")
    @ResponseBody
    public String joinBookshelf(Bookshelf bookshelf) {
        bookshelfService.add(bookshelf);
        return "true";
    }

    @RequestMapping("check_bookshelf_ajax")
    @ResponseBody
    public String checkBookshelfAjax(BookshelfKey bookshelfKey) {
        Bookshelf bookshelf = bookshelfService.get(bookshelfKey);
        if (null == bookshelf) {
            return "false";
        }
        return "true";

    }

    @RequestMapping("bookshelf")
    public String bookshelf(HttpSession httpSession, Model model) {
        User user = (User) httpSession.getAttribute("user");
        List<Bookshelf> bookshelfList = bookshelfService.getMyBookshelf(user.getUser_id());
        model.addAttribute("bookshelfs", bookshelfList);
        return "fore/user/userBookshelf";
    }


}
