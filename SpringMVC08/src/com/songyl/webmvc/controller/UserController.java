package com.songyl.webmvc.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.songyl.webmvc.entity.UserInfo;

/**
 * @author Administrator
 * ����ҳ�����ݣ�Model
 *
 */
@Controller
public class UserController {

    @RequestMapping("/ajaxUserId.do")
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

    @RequestMapping("/ajaxUserInfo.do")
    public @ResponseBody UserInfo userAjax(Integer userId, HttpServletResponse response) {
	System.out.println(userId);
	UserInfo user = new UserInfo();

	user.setUserId(userId);
	user.setUserName("��");
	user.setAge(18);
	return user;

    }

}
