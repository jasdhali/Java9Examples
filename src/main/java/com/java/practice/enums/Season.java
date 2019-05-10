package com.java.practice.enums;

public enum Season {

	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

	private String expectedVisitors;

	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}

	private void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}

	public static void main(String[] args) {
		for (Season season : Season.values()) {
			System.out.println(season.name() + " - " + season.ordinal());
		}
	}
}
