package com.shiki.zongyue.controller;


import com.shiki.zongyue.pojo.Bookshelf;
import com.shiki.zongyue.pojo.Fiction;
import com.shiki.zongyue.pojo.User;
import com.shiki.zongyue.service.BookshelfService;
import com.shiki.zongyue.service.FictionService;
import com.shiki.zongyue.service.UserService;
import com.shiki.zongyue.util.NicknameCreate;
import com.shiki.zongyue.util.PasswordEnctyption;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private BookshelfService bookshelfService;
    @Autowired
    private FictionService fictionService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String userRegister() {
        return "fore/user/userRegister";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.DELETE)
    public String userLogout(HttpSession httpSession) {
        httpSession.removeAttribute("user");
        return "redirect:/";
    }

    @RequestMapping("/register_result")
    public String userRegisterResult() {
        return "fore/user/userRegisterResult";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String userHome() {
        return "fore/user/userHome";
    }

    @RequestMapping(value = "/setting", method = {RequestMethod.GET, RequestMethod.PUT})
    public String userSetting() {
        return "fore/user/userSetting";
    }

    @RequestMapping("/paying")
    public String userPaying() {
        return "fore/user/userPaying";
    }


    @RequestMapping(value = "/check_name_ajax", method = RequestMethod.GET)
    @ResponseBody
    public Map usernameCheckAjax(@RequestParam("username") String username) {
        User user = userService.registerCheck(username);
        Map<String, String> map = new HashMap<>();
        if (null == user) {
            map.put("message", "账号可以使用");
            map.put("state", "success");
            return map;
        }
        map.put("message", "账号已被注册");
        map.put("state", "false");
        return map;
    }

    @RequestMapping(value = "/register_ajax", method = RequestMethod.POST)
    @ResponseBody
    public Map userRegisterAjax(@RequestParam("username") String username, @RequestParam("password") String password) {

        User user = new User();
        user.setUser_login_name(username.trim());
        user.setUser_password(password.trim());
        user.setUser_nickname(NicknameCreate.nickname());
        userService.add(user);
        Map<String, String> map = new HashMap<>();
        map.put("state", "success");
        return map;
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Map login(@RequestParam("username") String username,
                     @RequestParam("password") String password, HttpSession httpSession) {
        /*Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Map<String, String> map = new HashMap<>();
        try {
            subject.login(token);
            Session session = subject.getSession();
            session.setAttribute("subject", subject);
            map.put("message", "登陆成功");
            map.put("state", "success");
            return map;
        } catch (AuthenticationException e) {
            map.put("message", "账号或者密码错误");
            map.put("state", "fail");
            return map;
        }*/
        Map<String, String> map = new HashMap<>();
        User user = userService.loginCheck(username.trim(), password.trim());
        if (null != user) {
            httpSession.setAttribute("user", user);
            map.put("message", "登陆成功");
            map.put("state", "success");
        } else {
            map.put("message", "账号或者密码错误");
            map.put("state", "fail");
        }
        return map;

    }

    @RequestMapping(value = "/nickname_ajax", method = RequestMethod.PUT)
    @ResponseBody
    public Map setNicknameAjax(HttpSession httpSession, @RequestParam("nickname") String nickname) {
        User user = (User) httpSession.getAttribute("user");
        user.setUser_nickname(nickname.trim());
        userService.update(user);
        Map<String, String> map = new HashMap<>();
        map.put("message", "用户名修改成功");
        map.put("state", "success");
        return map;
    }

    @RequestMapping(value = "/information_ajax", method = RequestMethod.PUT)
    @ResponseBody
    public Map userInformationUpdateAjax(User user, HttpSession httpSession) {
        System.out.println(user);
        //获取当前用户的id
        User my = (User) httpSession.getAttribute("user");
        //修改user信息
        user.setUser_id(my.getUser_id());
        user.setUser_nickname(my.getUser_nickname());
        userService.update(user);
        httpSession.removeAttribute("user");
        httpSession.setAttribute("user", user);
        Map<String, String> map = new HashMap<>();
        map.put("state", "success");
        map.put("message", "修改成功");
        return map;
    }


    @RequestMapping(value = "/paying_ajax", method = RequestMethod.PUT)
    @ResponseBody
    public Map userPayingAjax(@RequestParam("user_id") int uid, @RequestParam("user_recommend_ticket") int num, HttpSession httpSession) {
        User user = userService.get(uid);
        user.setUser_recommend_ticket(user.getUser_recommend_ticket() + num);
        userService.update(user);
        User my = (User) httpSession.getAttribute("user");
        if (user.getUser_id().equals(my.getUser_id())) {
            httpSession.removeAttribute("user");
            httpSession.setAttribute("user", user);
        }
        Map<String, String> map = new HashMap<>();
        map.put("state", "success");
        return map;
    }

    @RequestMapping(value = "/fiction_recommend", method = RequestMethod.PUT)
    @ResponseBody
    public Map updateFictionRecommend(@RequestParam("fid") int fid, @RequestParam("num") int num, HttpSession httpSession) {
        Fiction fiction = fictionService.get(fid);
        User user = (User) httpSession.getAttribute("user");
        User my = userService.get(user.getUser_id());
        Map<String, String> map = new HashMap<>();
        if (my.getUser_recommend_ticket() >= num && num != 0) {
            my.setUser_recommend_ticket(my.getUser_recommend_ticket() - num);
            fiction.setFiction_recommend(fiction.getFiction_recommend() + num);
            userService.update(my);
            fictionService.update(fiction);
            httpSession.removeAttribute("user");
            httpSession.setAttribute("user", my);
            map.put("state", "success");
            return map;
        }
        map.put("state", "fail");
        return map;
    }

    @RequestMapping("/bookshelf")
    public String bookshelf(HttpSession httpSession, Model model) {
        User user = (User) httpSession.getAttribute("user");
        List<Bookshelf> bookshelfList = bookshelfService.getMyBookshelf(user.getUser_id());
        model.addAttribute("bookshelfs", bookshelfList);
        return "fore/user/userBookshelf";
    }
}
