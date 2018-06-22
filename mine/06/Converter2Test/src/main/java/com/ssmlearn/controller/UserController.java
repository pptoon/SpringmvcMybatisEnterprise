package com.ssmlearn.controller;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssmlearn.converter.DateEditor;
import com.ssmlearn.domain.User;

@Controller
public class UserController {
	private static final Log logger = LogFactory.getLog(UserController.class);

	@RequestMapping(value = "/{formName}")
	public String loginForm(@PathVariable String formName) {
		return formName;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new DateEditor());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute User user, Model model) {
		logger.info(user);
		model.addAttribute("user", user);
		return "success";
	}
}
