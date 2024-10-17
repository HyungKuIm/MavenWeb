package com.oraclejava.model;

import java.io.Serializable;
import java.util.Date;

public class BlogCmt implements Serializable {
	
	private int blgCmtSeq;
	private int blogSeq;
	private String cmtBody;
	private String tmpPw;
	private Date insertDt;
	
	
	
	public int getBlgCmtSeq() {
		return blgCmtSeq;
	}
	public void setBlgCmtSeq(int blgCmtSeq) {
		this.blgCmtSeq = blgCmtSeq;
	}
	public int getBlogSeq() {
		return blogSeq;
	}
	public void setBlogSeq(int blogSeq) {
		this.blogSeq = blogSeq;
	}
	public String getCmtBody() {
		return cmtBody;
	}
	public void setCmtBody(String cmtBody) {
		this.cmtBody = cmtBody;
	}
	public String getTmpPw() {
		return tmpPw;
	}
	public void setTmpPw(String tmpPw) {
		this.tmpPw = tmpPw;
	}
	public Date getInsertDt() {
		return insertDt;
	}
	public void setInsertDt(Date insertDt) {
		this.insertDt = insertDt;
	}
	
	
}
