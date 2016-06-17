package com.songyl.webmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {
    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
	    throws Exception {
	String username = request.getParameter("username");
	String userpsw = request.getParameter("userpsw");
	String gender = request.getParameter("gender");
	System.out.println("用户名：" + username);
	System.out.println("密码：" + userpsw);
	System.out.println("性别：" + gender);

	//返回数据和页面
	ModelAndView m_v = new ModelAndView("index");
	m_v.addObject("username", username);
	m_v.addObject("gender", gender);

	return m_v;

    }

}
