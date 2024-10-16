package com.oraclejava.model;

import java.io.Serializable;
import java.util.Date;

public class Blog implements Serializable {
	
	private int blogSeq;
	private String title;
	private String blogBdy;
	private Date insertDt;
	
	public int getBlogSeq() {
		return blogSeq;
	}
	public void setBlogSeq(int blogSeq) {
		this.blogSeq = blogSeq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBlogBdy() {
		return blogBdy;
	}
	public void setBlogBdy(String blogBdy) {
		this.blogBdy = blogBdy;
	}
	public Date getInsertDt() {
		return insertDt;
	}
	public void setInsertDt(Date insertDt) {
		this.insertDt = insertDt;
	}

}
