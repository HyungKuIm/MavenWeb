package com.oraclejava.model;

public class Pagination {
	private int pageNo; // 페이지 번호(1,2...10)
	
	private int amount = 5; // 한 페이지당 데이터 수(5, 10)
	
	private int totalPages;  // 총페이지 수(10)

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	
	
	
}
