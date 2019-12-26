package com.shiki.zongyue.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shiki.zongyue.EnumForState.ChapterOrderBy;
import com.shiki.zongyue.EnumForState.ChapterState;
import com.shiki.zongyue.EnumForState.FictionState;
import com.shiki.zongyue.pojo.*;
import com.shiki.zongyue.service.*;
import com.shiki.zongyue.util.FictionStateMap;
import com.shiki.zongyue.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private FictionService fictionService;
    @Autowired
    private PromotionsService promotionsService;
    @Autowired
    private ChapterService chapterService;
    @Autowired
    private PromotionService promotionService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String adminHome() {
        return "admin/adminHome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String adminLoginPage() {
        return "admin/adminLogin";
    }

    @RequestMapping(value = "/fiction/list", method = RequestMethod.GET)
    public String adminFiction() {
        return "admin/adminFiction";
    }



    @RequestMapping(value = "/fiction/list/new",method = RequestMethod.GET)
    public String newFiction(Model model, Page page, HttpSession httpSession) {
        Map<String,FictionState> stateMap = FictionStateMap.getStateMap();
        Admin admin = (Admin) httpSession.getAttribute("admin");
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Fiction> fictionList = fictionService.list(admin.getAdmin_genre(), FictionState.NOT_SHELVES);
        int total = (int) new PageInfo<>(fictionList).getTotal();
        page.setTotal(total);
        model.addAttribute("page", page);
        model.addAttribute("fictionList", fictionList);
        return "admin/loadJsp/newFictions";
    }
    @RequestMapping(value = "/fiction/list/shelves",method = RequestMethod.GET)
    public String shelvesFiction(Model model, Page page, HttpSession httpSession) {
        Admin admin = (Admin) httpSession.getAttribute("admin");
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Fiction> fictionList = fictionService.list(admin.getAdmin_genre(), FictionState.ON_SHELVES);
        int total = (int) new PageInfo<>(fictionList).getTotal();
        page.setTotal(total);
        model.addAttribute("page", page);
        model.addAttribute("fictionList", fictionList);
        return "admin/loadJsp/shelvesFictions";
    }

    @RequestMapping(value = "/chapter/{chapter_id}", method = RequestMethod.GET)
    public String chapterReader(@PathVariable("chapter_id") int chapter_id, Model model) {
        Chapter chapter = chapterService.get(chapter_id);
        Fiction fiction = fictionService.get(chapter.getFiction_id());
        Integer nextChapterID = chapterService.getNextChapterID(chapter.getFiction_id(), chapter_id);
        Integer previousChapterID = chapterService.getPreviousChapterID(chapter.getFiction_id(), chapter_id);
        model.addAttribute("next", nextChapterID);
        model.addAttribute("previous", previousChapterID);
        model.addAttribute("chapter", chapter);
        model.addAttribute("fiction", fiction);
        return "admin/chapterReader";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String adminLogin(@RequestParam("admin_name") String admin_name, @RequestParam("admin_password") String admin_password, HttpSession httpSession, Model model) {
        Admin admin = adminService.get(admin_name, admin_password);
//        System.out.println(admin);
        if (null == admin) {
            model.addAttribute("msg", "账号密码错误");
            return "admin/adminLogin";
        }
        httpSession.setAttribute("admin", admin);
        return "redirect:home";
    }

    @RequestMapping(value = "/fiction/{fiction_id}", method = RequestMethod.GET)
    public String adminFictionDetail(@PathVariable("fiction_id") int fiction_id, Model model) {

        Fiction fiction = fictionService.get(fiction_id);
        Integer startChapterID = chapterService.getFirstChapterID(fiction_id);
        model.addAttribute("startChapterID", startChapterID);
        model.addAttribute("fiction", fiction);
        return "admin/adminFictionDetail";
    }

    /*, produces = "text/plain;charset=utf-8"*/
    @RequestMapping(value = "/fiction/state", method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, String> updateFictionStateAjax(@RequestParam("fiction_state") int fiction_state, @RequestParam("fiction_id") int fiction_id) {
        Fiction fiction = new Fiction();
        fiction.setFiction_id(fiction_id);
        fiction.setFiction_state(fiction_state);
        fictionService.update(fiction);
        Map<String, String> map = new HashMap<>();
        switch (fiction_state) {
            case 1:
                map.put("message", "未上架");
            case 2:
                map.put("message", "已上架");
            case 3:
                map.put("message", "已签约");
        }
        /*AtomicReference<String> result = new AtomicReference<>("未上架");
        switch (fiction_state) {
            case 1:
                result.set("已上架");
                break;
            case 2:
                result.set("已签约");
                break;
        }*/
        return map;
    }

    @RequestMapping(value = "/fiction/catalog/{fiction_id}", method = RequestMethod.GET)
    public String chapterListCatalog(Model model, @PathVariable("fiction_id") int fiction_id) {
        List<Chapter> chapterList = chapterService.list(fiction_id, ChapterState.PUBLISHED, ChapterOrderBy.CHAPTER_ASC);
        model.addAttribute("chapterList", chapterList);
        return "admin/adminChapterList";

    }

    @RequestMapping(value = "/banner/list", method = RequestMethod.GET)
    public String bannerList(Model model) {
        List<Promotions> promotionsList = promotionsService.list();
        model.addAttribute("promotionsList", promotionsList);
        return "admin/adminBanner";
    }

    @RequestMapping(value = "/banner/add", method = RequestMethod.GET)
    public String jumpToAddBanner() {
        return "admin/adminAddBanner";
    }

    @RequestMapping(value = "/banner/add", method = RequestMethod.POST)
    public String addBanner(Promotions promotions) {
        promotionsService.add(promotions);
        return "redirect:/admin/banner/list";
    }

    @RequestMapping(value = "/banner/{id}", method = RequestMethod.GET)
    public String bannerDetail(Model model, @PathVariable("id") int id) {
        Promotions promotions = promotionsService.get(id);
        List<Promotion> promotionList = promotionService.list(id);
        model.addAttribute("promotions", promotions);
        model.addAttribute("promotionList", promotionList);
        return "admin/BannerDetail";
    }

    @RequestMapping(value = "/banner/{id}", method = RequestMethod.PUT)
    public String modifyBanner(@PathVariable("id") int id, Promotions promotions, @RequestParam(value = "online", required = false) Integer online) {
        if (online != null) {
            //online是tinyint 0为下线 1为上线
            promotions.setOnline(online.byteValue());
            //清除其他Promotions的online
            Promotions promotionsOnline = promotionsService.getOnline();
            //存在
            if (promotionsOnline != null) {
                promotionsOnline.setOnline((byte) 0);
                promotionsService.update(promotionsOnline);
            }
        }
        promotions.setPromotions_id(id);
        promotionsService.update(promotions);
        return "redirect:/admin/banner";
    }

    @RequestMapping(value = "/banner/item/{id}", method = RequestMethod.POST)
    public String addItem(Promotion promotion, @PathVariable("id") int id, @RequestParam(value = "image", required = false) MultipartFile multipartFile) {
        if (multipartFile != null) {

        }
        promotion.setPromotions_id(id);
        promotionService.add(promotion);
        return "redirect:/admin/banner/" + id;
    }

    @RequestMapping(value = "/banner/item/{id}", method = RequestMethod.PUT)
    public String updateItem(@PathVariable("id") int promotions_id, Promotion promotion) {
//        promotion.setPromotions_id(promotions_id);
//        System.out.println(promotion);
        promotionService.update(promotion);
        return "redirect:/admin/banner/" + promotions_id;
    }

    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Promotion getItem(@PathVariable("id") int promotion_id) {
        return promotionService.get(promotion_id);
    }


}
