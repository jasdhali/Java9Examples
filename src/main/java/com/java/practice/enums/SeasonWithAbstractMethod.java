package com.java.practice.enums;

public enum SeasonWithAbstractMethod {

	WINTER {
		@Override
		public void printHours() {
			System.out.println("9 am - 3 pm");
		}
	},
	SPRING {
		@Override
		public void printHours() {
			System.out.println("9 am - 5 pm");
		}

	},
	SUMMER {
		@Override
		public void printHours() {
			System.out.println("9 am - 7 pm");
		}

	},
	FALL {
		@Override
		public void printHours() {
			System.out.println("9 am - 5 pm");
		}

	};

	/*
	 * private String expectedVisitors;
	 * 
	 * private SeasonWithAbstractMethod(String expectedVisitors) {
	 * this.expectedVisitors = expectedVisitors; }
	 * 
	 * private void printExpectedVisitors() { System.out.println(expectedVisitors);
	 * }
	 */

	public static void main(String[] args) {
		for (SeasonWithAbstractMethod season : SeasonWithAbstractMethod.values()) {
			System.out.println(season.name() + " - " + season.ordinal());
		}
	}

	public abstract void printHours();
}
