// MemController 클래스
package com.kh.jdbc.controller;

import com.kh.jdbc.dao.InfoDao;
import com.kh.jdbc.vo.InfoVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/INFO")
public class InfoController {
    @GetMapping("/select")
    public String infoSelect(Model model) {
        InfoDao dao = new InfoDao();
        List<InfoVo> infos = dao.infoSelect();
        model.addAttribute("infoloyees", infos);
        return "thymeleafEx/INFOselect";
    }
}