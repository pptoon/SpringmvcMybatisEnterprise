package com.ssmlearn.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssmlearn.domain.User;
@Controller
public class User2Controller {
	private static final Log logger = LogFactory.getLog(User2Controller.class);

	@ModelAttribute
	public void userModel2(String loginName, String password, Model model) {
		logger.info("userModel2");
		User user = new User();
		user.setLoginName(loginName);
		user.setPassword(password);
		model.addAttribute("user", user);
	}

	@RequestMapping(value = "/login2")
	public String login2(ModelMap modelMap) {
		logger.info("login2");
		User user = (User) modelMap.get("user");
		System.out.println(user);
		user.setUsername("测试");
		return "result2";
	}

}
