package com.java.practice.nestedclasses;

public class AnnonymusInnerClassDemo {

	interface SaleTodayOnly {
		int dollarsOff();
	}

	public int admission(int basePrice) {
		SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {

			@Override
			public int dollarsOff() {
				return 3;
			}
		};
		basePrice++;
		basePrice--;
		basePrice++;
		return basePrice - saleTodayOnly.dollarsOff();
	}

	public static void main(String[] args) {
		AnnonymusInnerClassDemo classDemo = new AnnonymusInnerClassDemo();
		System.out.println( classDemo.admission(10) );
	}
}