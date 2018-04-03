package com.na.design.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 主页调配
 *
 * @author xuliang@asiainfo.com
 * <p>@createTime 2018-04-03 13:48</p>
 **/
@Controller
public class HomeController {
    private transient static final Log log = LogFactory.getLog(HomeController.class);
    @GetMapping("/")
    public ModelAndView home() {
        log.info("主页跳转");
        return new ModelAndView("index");
    }
}
