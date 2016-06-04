package com.songyl.webmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.songyl.webmvc.entity.UserInfo;

/**
 * @author Administrator
 * springע��
 *
 */
@Controller
//���ȥ��ֻ��Ϊ�˹淶��ע
@RequestMapping("/user")

public class UserController {

    @RequestMapping(value = "/add1")
    public ModelAndView handleRequestInternal(HttpServletRequest request) throws Exception {
	String username = request.getParameter("username");
	String userpsw = request.getParameter("userpsw");
	String gender = request.getParameter("gender");
	System.out.println("#####1.ͨ������HttpServletRequest����ȡ�������");
	System.out.println("�û�����" + username);
	System.out.println("���룺" + userpsw);
	System.out.println("�Ա�" + gender);
	//�������ݺ�ҳ��
	ModelAndView m_v = new ModelAndView("index");
	m_v.addObject("username", username);
	m_v.addObject("gender", gender);

	return m_v;
    }

    @RequestMapping(value = "/add2")
    public String add2(String username, String userpsw, String gender, Model model) {
	System.out.println("#####2.ֱ�����ò���");
	System.out.println("�û�����" + username);
	System.out.println("���룺" + userpsw);
	System.out.println("�Ա�" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);

	return "index";
    }

    @RequestMapping(value = "/add3")
    public String add3(UserInfo userInfo, Model model) {
	System.out.println("#####3.ͨ����װһ��������������ݲ���");
	System.out.println(userInfo);
	model.addAttribute("username", userInfo.getUserName());
	model.addAttribute("gender", userInfo.getGender());
	model.addAttribute("skill", userInfo.getSkill());
	return "index";
    }

}
