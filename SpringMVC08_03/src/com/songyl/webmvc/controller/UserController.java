package com.songyl.webmvc.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.songyl.webmvc.entity.UserInfo;
import com.songyl.webmvc.service.ListService;

/**
 * @author Administrator
 * 返回页面数据：Model
 *
 */
@Controller
public class UserController {

    /**
     * @方法描述 TODO
     * @param userNum
     * @param response 
     *  
     */
    @RequestMapping("/ajaxUserId")
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

    @RequestMapping("/ajaxUserInfo")
    public @ResponseBody UserInfo userAjax(HttpServletRequest request, Model model, String userId,
	    HttpServletResponse response) {
	ListService listService = new ListService();

	UserInfo user = listService.selectOne(userId);

	return user;

    }

}
