package com.oraclejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oraclejava.model.Blog;
import com.oraclejava.service.BlogService;

@Controller
public class BlogController {
	@Autowired
	BlogService blogService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String getCreate(Model model) {
		model.addAttribute("blog", new Blog());
		return "blog/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String postCreate(Blog blog) {
		int blogSeq = blogService.create(blog);
		return "redirect:/read/" + blogSeq;
	}
	
	@GetMapping("/read/{blogSeq}")
	public String getRead(@PathVariable("blogSeq") int blogSeq,
			Model model) {
		Blog blog = blogService.read(blogSeq);
		blog.setBlogBdy(blog.getBlogBdy()
				.replace("\r\n", "<br/>")
				.replace("\n", "<br/>"));
		model.addAttribute("blog", blog);
		return "blog/read";
	}
	
	// 수정
	@GetMapping("/edit/{blogSeq}")
	public String getEdit(@PathVariable("blogSeq") int blogSeq,
			Model model) {
		Blog blog = blogService.read(blogSeq);
		model.addAttribute("blog", blog);
		return "blog/edit";
	}
	
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model) {
		List<Blog> blogList = blogService.selectList();
		model.addAttribute("blogList", blogList);
		return "blog/list";
	}
	
	
}







