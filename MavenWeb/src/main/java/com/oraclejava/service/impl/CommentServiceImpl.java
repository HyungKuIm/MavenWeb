package com.oraclejava.service.impl;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import com.oraclejava.dao.CommentDAO;
import com.oraclejava.model.BlogCmt;
import com.oraclejava.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	private final CommentDAO commentDAO;
	
	public CommentServiceImpl(CommentDAO commentDAO) {
		this.commentDAO = commentDAO;
	}


	@Override
	public BlogCmt add(BlogCmt blogCmt) {

		//패스워드가 입력되었으면 암호화함
		if (blogCmt.getTmpPw() != null) {
			String sha256hex = DigestUtils.sha256Hex(blogCmt.getTmpPw());
			blogCmt.setTmpPw(sha256hex);
		}
		
		int result = commentDAO.insert(blogCmt);
		
		if (result == 0) {
			return null;
		}
		
		return blogCmt;
	}
	
	@Override
	public List<BlogCmt> listByBlogSeq(int blogSeq) {
		return commentDAO.selectListByBlogSeq(blogSeq);
	}

}






