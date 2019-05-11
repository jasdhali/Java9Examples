package com.java.practice.nestedclasses;

public class LocalInnerClassDemo {
	private int length = 3;
	
	public void calculate() {
		final int width = 10;
		class Inner {
			public void getArea() {
				System.out.println( length * width );
			}
		}
		Inner inner = new Inner();
		inner.getArea();
	}
	
	public static void main(String[] args) {
		LocalInnerClassDemo innerClassDemo = 
				new LocalInnerClassDemo();
		innerClassDemo.calculate();
	}

}
