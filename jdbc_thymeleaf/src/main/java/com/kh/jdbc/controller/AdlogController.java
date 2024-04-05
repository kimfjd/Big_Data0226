package com.kh.jdbc.controller;



import com.kh.jdbc.dao.AdlogDao;
import com.kh.jdbc.vo.AdlogVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ADMIN_INFO")
public class AdlogController {
    @GetMapping("/select")
    public String adminSelect(Model model) {
        AdlogDao adlogDao = new AdlogDao();
        List<AdlogVo> admins = adlogDao.adminSelect();
        model.addAttribute("adminloyees", admins);
        return "thymeleafEx/adminSelect";
    }

    @GetMapping("/insert")
    public String adinsert(Model model){
        model.addAttribute("adinsert", new AdlogVo());
        return "thymeleafEx/admininsert";
    }

    @PostMapping("/insert")
    public String adinsertDB(@ModelAttribute("adinsert") AdlogVo vo){
        AdlogDao dao=new AdlogDao();
        dao.adInsert(vo);
        return "thymeleafEx/admininfo";
    }
    @GetMapping("/delete")
    public String addelete(Model model){
        model.addAttribute("addeletes",new AdlogVo());
        return "thymeleafEx/addelete";
    }

    @PostMapping("/delete")
    public String addeleteDB(@ModelAttribute("addeletes")AdlogVo vo){
        AdlogDao dao=new AdlogDao();
        dao.addelete(vo);
        return "thymeleafEx/admininfo";
    }


//    @GetMapping("/adlog")
//    public String adlogView(Model model) {
//        model.addAttribute("adlogloyees", new AdlogVo());
//        return "thymeleafEx/ADMIN_INFOadlog";
//    }

//    @PostMapping("/adlog")
//    public String adlogSubmit(@RequestParam("username") String id, @RequestParam("password") String password) {
//        adlogDao dao = new adlogDao();
//
//
//}

    }