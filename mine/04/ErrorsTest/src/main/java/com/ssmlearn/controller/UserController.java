package com.ssmlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssmlearn.domain.User;
import com.ssmlearn.validator.UserValidator;

@Controller
public class UserController {

	@RequestMapping(value="/registerForm",method = RequestMethod.GET)
	public String registerForm(Model model ) {
		User user = new User();
		model.addAttribute("user", user);
		return "registerForm";
	}
	@InitBinder
	public void initBinder(DataBinder binder)
	{
		binder.setValidator(new UserValidator());
	}
	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public String register(@Validated User user ,Errors errors) {
		if(errors.hasFieldErrors()) {
			return "registerForm";
		}
		return "submit";
	}
}
