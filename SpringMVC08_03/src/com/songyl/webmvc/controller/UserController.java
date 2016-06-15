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
 * ����ҳ�����ݣ�Model
 *
 */
@Controller
public class UserController {

    /**
     * @�������� TODO
     * @param userNum
     * @param response 
     *  
     */
    @RequestMapping("/ajaxUserId")
    public void userId(String userNum, HttpServletResponse response) {

	try {
	    //��Ӧ
	    response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
	    PrintWriter out = response.getWriter();
	    if ("".equals(userNum)) {
		out.println("�ʺŲ���Ϊ�գ�");
	    } else {
		System.out.println("�ʺ�:" + userNum);
		if ("songyl".equals(userNum)) {
		    out.println("���������������룡");
		} else {
		    out.print("�ʺſ���ʹ�ã�");
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

	UserInfo userInfo = listService.selectOne(userId);

	return userInfo;

    }

}
