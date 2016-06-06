package com.songyl.webmvc.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.songyl.webmvc.entity.UserInfo;

/**
 * @author Administrator
 * 返回页面数据：Model
 *
 */
@Controller
public class UserController {

    @RequestMapping("/ajaxUserId.do")
    public void userId(String userNum, HttpServletResponse response) {

	try {
	    //响应
	    response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
	    PrintWriter out = response.getWriter();
	    if ("".equals(userNum)) {
		out.println("帐号不能为空！");
	    } else {
		System.out.println("帐号:" + userNum);
		if ("songyl".equals(userNum)) {
		    out.println("输入有误！重新输入！");
		} else {
		    out.print("帐号可以使用！");
		}
	    }
	    out.flush();
	    out.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    @RequestMapping("/ajaxUserInfo.do")
    public @ResponseBody UserInfo userAjax(Integer userId, HttpServletResponse response) {
	System.out.println(userId);
	UserInfo user = new UserInfo();

	user.setUserId(userId);
	user.setUserName("宋");
	user.setAge(18);
	return user;

    }

}
