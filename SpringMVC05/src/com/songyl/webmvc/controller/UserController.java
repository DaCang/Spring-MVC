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
//随便去，只是为了规范标注
@RequestMapping("/user")

public class UserController {
    @RequestMapping(value = "/list")
    public String list(String username, String userpsw, String gender, Model model) {
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);
	System.out.println("++++++查询成功#######");
	return "UserInfo/user_list";
    }

    @RequestMapping(value = "/add")
    public String add(String username, String userpsw, String gender, Model model) {
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);
	System.out.println("++++++添加成功#######");
	return "UserInfo/user_add";
    }

    @RequestMapping(value = "/update")
    public String update(String username, String userpsw, String gender, Model model) {
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);
	System.out.println("++++++修改成功#######");
	return "UserInfo/user_update";
    }

}
