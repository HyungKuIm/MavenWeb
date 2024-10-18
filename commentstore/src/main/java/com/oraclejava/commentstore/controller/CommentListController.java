package com.oraclejava.commentstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oraclejava.commentstore.service.CommentService;
import com.oraclejava.model.Comment;

@RestController
public class CommentListController {
	
	@Autowired
	private CommentService service;
	
	@RequestMapping(value = "/comments")
	public List<Comment> getComments() {
		List<Comment> r = service.list();
		return r;
	}
}





