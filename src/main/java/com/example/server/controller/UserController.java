package com.example.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author y.cao
 * @date 2021/8/25 16:17
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @RequestMapping("/login")
    public void login() {
        return;
    }
}
