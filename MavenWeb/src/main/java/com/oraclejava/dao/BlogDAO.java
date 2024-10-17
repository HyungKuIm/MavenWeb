package com.oraclejava.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oraclejava.model.Blog;
import com.oraclejava.model.Pagination;

@Repository
public class BlogDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<Blog> selectList(Pagination pagination) {
		return sqlSession.selectList("BLOG.selectListPaging", pagination);
	}
	
	public Blog selectOne(int blogSeq) {
		return sqlSession.selectOne("BLOG.selectOne", blogSeq);
	}
	
	public int countBlog() {
		return sqlSession.selectOne("BLOG.countBlog");
	}
	
	public int insert(Blog blog) {
		int result = sqlSession.insert("BLOG.insert", blog);
		if (result > 0) {
			return blog.getBlogSeq();
		}
		return -1;
	}
	
	public int update(Blog blog) {
		return sqlSession.update("BLOG.update", blog);
	}
	
	public int delete(int blogSeq) {
		return sqlSession.delete("BLOG.delete", blogSeq);
	}
	
}






