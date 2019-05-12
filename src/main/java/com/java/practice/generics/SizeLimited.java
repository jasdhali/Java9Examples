package com.java.practice.generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SizeLimited<T,U> {
	private T contents;
	private U sizeLimit;
	public SizeLimited(T contents, U sizeLimit) {
		super();
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	};
	
	public static void main(String[] args) {
		Date dateCurr = new Date();
		List<String> listStr = new ArrayList<>();
		SizeLimited<Date , List<String>> sl = 
				new SizeLimited< >(dateCurr, listStr);
	}
}
