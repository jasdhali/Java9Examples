package com.java.practice.enums;

public class SimpleEnumSwitchTesterExample {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			new SimpleEnumSwitchTesterExample().checkSeason( Season.SPRING );
		} else if (args[0].equals("1")) {
			new SimpleEnumSwitchTesterExample().checkSeason( Season.SUMMER );
		} else {
			new SimpleEnumSwitchTesterExample().checkSeason( Season.FALL );
		}
	}

	private void checkSeason(Season season) {
		switch (season) {
		case WINTER:
			System.out.println("Get out the sled");
			break;
		case SPRING:
			System.out.println("Go to playground everyday");
			break;
		case SUMMER:
			System.out.println("go to pool");
			break;
		default:
			System.out.println("Time for hiking");
			break;
		}
	}
}