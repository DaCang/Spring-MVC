package com.songyl.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * springע��
 * �൱��)��WEB-INF����springmvc�����ļ���
 * ����Ϊ��[servlet-name]-servlet.xml
 *
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(String username, String userpsw, String gender, Model model) {
	System.out.println("�û�����" + username);
	System.out.println("���룺" + userpsw);
	System.out.println("�Ա�" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);

	return "index";
    }
}
