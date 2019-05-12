package com.java.practice.interfaceexamples;

public interface Engine {
	public default String getColor() {
		return "RED";
	}
	
	int getNumCylinders();
}
