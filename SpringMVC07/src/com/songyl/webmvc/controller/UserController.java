package com.songyl.webmvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.songyl.webmvc.entity.UserInfo;

/**
 * @author Administrator
 * 返回页面数据：Model
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/add1")
    public String add1(HttpServletRequest request) throws Exception {
	//1)HttpServletRequest request直接使用
	String username = request.getParameter("username");
	String userpsw = request.getParameter("userpsw");
	String gender = request.getParameter("gender");
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);

	request.setAttribute("username", username);
	request.setAttribute("gender", gender);
	return "index";
    }

    @RequestMapping(value = "/add2")
    public ModelAndView add2(HttpServletRequest request) throws Exception {
	//2)使用ModelAndView
	String username = request.getParameter("username");
	String userpsw = request.getParameter("userpsw");
	String gender = request.getParameter("gender");
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);

	ModelAndView m_v = new ModelAndView("index");
	m_v.addObject("username", username);
	m_v.addObject("gender", gender);

	return m_v;
    }

    @RequestMapping(value = "/add3")
    public String add3(String username, String userpsw, String gender, Model model) {
	//3)使用Model model
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);

	return "index";
    }

    @RequestMapping(value = "/add4")
    public String add4(UserInfo userInfo, Map<String, String> map) {
	//4)使用Map<String, String> map
	System.out.println(userInfo);

	map.put("username", userInfo.getUserName());
	map.put("gender", userInfo.getGender());

	return "index";
    }

}
