package com.oraclejava.commentstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraclejava.model.Comment;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository repository;
	
	@Override
	public List<Comment> list() {
		return repository.findAll();
	}
	
	@Override
	public String put(Comment comment) {
		repository.save(comment);
		return comment.getId();
	}

}
