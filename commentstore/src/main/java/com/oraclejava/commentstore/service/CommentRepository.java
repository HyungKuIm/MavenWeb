package com.oraclejava.commentstore.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.oraclejava.model.Comment;

public interface CommentRepository
	extends CrudRepository<Comment, String>{
	
	@Query("select c from Comment c order by creationDate desc")
	List<Comment> findAll();
}
