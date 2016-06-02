package com.songyl.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * spring注解
 * 相当于)在WEB-INF创建springmvc配置文件，
 * 命名为：[servlet-name]-servlet.xml
 *
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(String username, String userpsw, String gender, Model model) {
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);

	return "index";
    }
}
