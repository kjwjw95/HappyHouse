package com.ssafy.happyhouse.model.dto;

import java.util.Arrays;

public class CSPageBean {
	
	/** 
	 * 0 : 아파트 매매
	 * 1 : 아파트 전월세
	 * 2 : 다세대 매매
	 * 3 : 다세대 전월세  
	 * */
	private boolean[] searchType;
	
	private String  big;
	private String  middle;
	private String  small;
	private String  dong;

	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getBig() {
		return big;
	}
	public void setBig(String big) {
		this.big = big;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getSmall() {
		return small;
	}
	public void setSmall(String small) {
		this.small = small;
	}
	public boolean[] getSearchType() {
		return searchType;
	}
	public void setSearchType(boolean[] searchType) {
		this.searchType = searchType;
	}
	@Override
	public String toString() {
		return "CSPageBean [searchType=" + Arrays.toString(searchType) + ", big=" + big + ", middle=" + middle + ", small=" + small + "]";
	}


}
