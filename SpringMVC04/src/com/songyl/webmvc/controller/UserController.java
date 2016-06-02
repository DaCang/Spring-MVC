package com.songyl.webmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author Administrator
 * spring注解
 * 控制器
 *
 */
@Controller
public class UserController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse reponse)
	    throws Exception {
	System.out.println("+++++访问到了#######");
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
