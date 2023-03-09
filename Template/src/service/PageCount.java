package service;

import java.util.ArrayList;
import java.util.List;

public class PageCount {
	
	private int pageNum = 1;
	private int amount = 10;
	
	public PageCount () {
		this(1,10);
	}
	
	public PageCount(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public int setPageNum(int pageNum) {
		return this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public List<Object> countPage(){
		List<Object> param = new ArrayList<>();
		param.add(1 + ((pageNum -1) * amount));
		param.add(pageNum * amount);
		return param;
	}
	
	
}