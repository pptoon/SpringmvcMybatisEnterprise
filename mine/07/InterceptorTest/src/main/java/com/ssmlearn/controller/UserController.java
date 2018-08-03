package com.ssmlearn.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssmlearn.domain.User;

/**
 * @author fatcat
 * @date 2018年8月2日 处理用户请求控制器
 */
@Controller
public class UserController {
	/**
	 * 模拟用户存储
	 */
	static HashMap<String, User> userMap = new HashMap<String, User>();

	static {
		userMap.put("fatcat", new User("fatcat", "123456"));
	}

	/**
	 * 处理/login请求
	 */
	@RequestMapping(value = "/login")
	public ModelAndView login(String loginname, String password, ModelAndView mv, HttpSession session) {
		if (loginname == null || password == null) {
			mv.addObject("message", "登录名或密码不能为空，请重新输入!");
			mv.setViewName("loginForm");
			return mv;
		}
		if (!userMap.containsKey(loginname)) {
			mv.addObject("message", "用户不存在!");
			mv.setViewName("loginForm");
			return mv;
		}
		User user = userMap.get(loginname);
		if (!user.getPassword().equals(password)) {
			mv.addObject("message", "密码错误!");
			mv.setViewName("loginForm");
			return mv;
		}
		user.setUsername("管理员");
		// 登录成功，将user对象设置到HttpSession作用范围域
		session.setAttribute("user", user);
		// 转发到main请求
		mv.setViewName("redirect:main");
		return mv;
	}

}
