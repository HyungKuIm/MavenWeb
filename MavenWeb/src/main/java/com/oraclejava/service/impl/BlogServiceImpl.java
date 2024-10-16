package com.oraclejava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraclejava.dao.BlogDAO;
import com.oraclejava.model.Blog;
import com.oraclejava.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	BlogDAO blogDAO;
	
	@Override
	public List<Blog> selectList() {
		return blogDAO.selectList();
	}

}
