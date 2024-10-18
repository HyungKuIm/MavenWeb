package com.oraclejava.commentstore.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oraclejava.model.Comment;

public interface CommentRepository
	extends CrudRepository<Comment, String>{
	
	List<Comment> findAll();
}
