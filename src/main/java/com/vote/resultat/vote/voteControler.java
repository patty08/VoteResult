package com.vote.resultat.vote;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

@Controller
public class voteControler {

    final static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    private ResultatService resultatService;
/*
    @RequestMapping(name = "/" , method = RequestMethod.GET)
    ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("resultat");
        modelAndView.addObject("resultat", resultatService.findAll());
        return modelAndView;
    }
*/

    @RequestMapping(value = "/")
    String home(Model model) {
        model.addAttribute("now", LocalDateTime.now().getDayOfWeek());
        return "index";
    }

    @RequestMapping(value = "/qsdqs")
    String index(HttpServletRequest httpServletRequest, ModelMap modelMap) {
        modelMap.addAttribute(httpServletRequest.getContextPath());
        return "index";
    }

    @RequestMapping(name = "resultat", method = RequestMethod.GET)
    public String getVote(ModelMap modelMap){
        String avoteResult = resultatService.getResult();
        modelMap.addAttribute("result", avoteResult);
        return "result";
    }
}

