package com.example.server.controller;

import com.example.server.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author y.cao
 * @date 2021/8/25 10:41
 */
@Controller
public class IndexController {

    @Autowired
    private TestService testService;

    @RequestMapping("/index")
    public String index() {
        testService.select();
        return "hello";
    }
}
