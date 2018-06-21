package com.ssmlearn.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssmlearn.domain.User;

@Controller
public class UserController {

	@RequestMapping(value = "/radiobuttonForm", method = RequestMethod.GET)
	public String registerForm(Model model) {
		User user = new User();
		user.setSex("男");
		model.addAttribute("user", user);
		return "radiobuttonForm";
	}

	@RequestMapping(value = "/radiobuttonsForm", method = RequestMethod.GET)
	public String registerForm2(Model model) {
		User user = new User();
		user.setSex("男");
		List<String> sexList = new ArrayList<String>();
		sexList.add("男");
		sexList.add("女");
		model.addAttribute("user", user);
		model.addAttribute("sexList", sexList);
		return "radiobuttonsForm";
	}

	@RequestMapping(value = "/radiobuttonsForm2", method = RequestMethod.GET)
	public String registerForm3(Model model) {
		User user = new User();
		user.setSex("1");
		Map<String, String> sexMap = new HashMap<String, String>();
		sexMap.put("1", "男");
		sexMap.put("2", "女");
		model.addAttribute("user", user);
		model.addAttribute("sexMap", sexMap);
		return "radiobuttonsForm2";
	}

}