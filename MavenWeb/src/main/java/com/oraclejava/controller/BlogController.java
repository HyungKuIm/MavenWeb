package com.oraclejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oraclejava.model.Blog;
import com.oraclejava.service.BlogService;

@Controller
public class BlogController {
	@Autowired
	BlogService blogService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model) {
		List<Blog> blogList = blogService.selectList();
		model.addAttribute("blogList", blogList);
		return "blog/list";
	}
}
