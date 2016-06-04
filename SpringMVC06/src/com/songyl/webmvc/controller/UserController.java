package com.songyl.webmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.songyl.webmvc.entity.UserInfo;

/**
 * @author Administrator
 * spring注解
 *
 */
@Controller
//随便去，只是为了规范标注
@RequestMapping("/user")

public class UserController {

    @RequestMapping(value = "/add1")
    public ModelAndView handleRequestInternal(HttpServletRequest request) throws Exception {
	String username = request.getParameter("username");
	String userpsw = request.getParameter("userpsw");
	String gender = request.getParameter("gender");
	System.out.println("#####1.通过设置HttpServletRequest来获取请求参数");
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);
	//返回数据和页面
	ModelAndView m_v = new ModelAndView("index");
	m_v.addObject("username", username);
	m_v.addObject("gender", gender);

	return m_v;
    }

    @RequestMapping(value = "/add2")
    public String add2(String username, String userpsw, String gender, Model model) {
	System.out.println("#####2.直接设置参数");
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);

	return "index";
    }

    @RequestMapping(value = "/add3")
    public String add3(UserInfo userInfo, Model model) {
	System.out.println("#####3.通过封装一个类的属性来传递参数");
	System.out.println(userInfo);
	model.addAttribute("username", userInfo.getUserName());
	model.addAttribute("gender", userInfo.getGender());
	model.addAttribute("skill", userInfo.getSkill());
	return "index";
    }

}
