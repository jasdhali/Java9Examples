package com.java.practice.interfaceexamples;

public interface Vehicle {

	public default String getColor() {
		return "RED";
	}
	
	double getWeight();
}

enum Colors {
	BLACK, WHITE, RED
}
