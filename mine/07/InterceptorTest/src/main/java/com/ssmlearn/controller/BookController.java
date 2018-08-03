package com.ssmlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssmlearn.domain.Book;

/**
 * @author fatcat
 * @date 2018年8月2日
 *	处理图书请求控制器
 */
@Controller
public class BookController {


	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/main")
	 public String main(Model model){
		// 模拟数据库获得所有图书集合
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("java.jpg","疯狂Java讲义（附光盘）","李刚 编著",74.2));
		bookList.add(new Book("ee.jpg","轻量级Java EE企业应用实战","李刚 编著",59.2));
		bookList.add(new Book("android.jpg","疯狂Android讲义（附光盘）","李刚 编著",60.6));
		bookList.add(new Book("ajax.jpg","疯狂Ajax讲义（附光盘）","李刚 编著",66.6));
		// 将图书集合添加到model当中
		model.addAttribute("book_list", bookList);
		// 跳转到main页面
		return "main";
	}
	
}
