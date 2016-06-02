package com.songyl.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * spring注解
 *
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello.do")
    public String hello(String username, String userpsw, String gender, Model model) {
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);

	return "index";
    }
}
