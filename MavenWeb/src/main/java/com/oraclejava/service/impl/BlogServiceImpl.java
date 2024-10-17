package com.oraclejava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraclejava.dao.BlogDAO;
import com.oraclejava.model.Blog;
import com.oraclejava.model.Pagination;
import com.oraclejava.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	BlogDAO blogDAO;
	
	@Override
	public List<Blog> selectList(Pagination pagination) {
		// 11 => 3, 10 => 2
		int countBlog = this.blogDAO.countBlog();
		int totalPages = (countBlog % pagination.getAmount() == 0) ?
				countBlog / pagination.getAmount() :
				countBlog / pagination.getAmount() + 1;	
		pagination.setTotalPages(totalPages);		
		return blogDAO.selectList(pagination);
	}
	
	@Override
	public int create(Blog blog) {
		int seq = blogDAO.insert(blog);
		return seq;
	}
	
	@Override
	public Blog read(int blogSeq) {
		Blog blog = blogDAO.selectOne(blogSeq);
		return blog;
	}

	@Override
	public boolean edit(Blog blog) {
		int result = blogDAO.update(blog);
		return result > 0;
	}
	
	@Override
	public boolean delete(int blogSeq) {
		return blogDAO.delete(blogSeq) > 0;
	}

}






