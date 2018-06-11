package com.ssmlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssmlearn.domain.Book;

@Controller
@RequestMapping("/json")
public class BookController {
	@RequestMapping(value = "/testRequestBody")
	@ResponseBody
	public Object getJson() {
		List<Book> list = new ArrayList<Book>();
		list.add(new Book(1, "Spring MVC企业应用实战", "王昭君"));
		list.add(new Book(2, "轻量级JavaEE企业应用实战", "安琪拉"));
		return list;
	}
}
