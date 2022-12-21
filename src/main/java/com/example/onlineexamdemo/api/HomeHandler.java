package com.example.onlineexamdemo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @author: sunyujie
 * @time: 2022/12/21 16:59
 * @version: 1.0
 */
@Controller
public class HomeHandler {
    @RequestMapping("home")
    public ModelAndView homeInfo(HttpServletResponse response){
        System.out.print("首页加载");
        ModelAndView model = new ModelAndView();
        model.setViewName("admin/home.jsp");

        return model;
    }
}
