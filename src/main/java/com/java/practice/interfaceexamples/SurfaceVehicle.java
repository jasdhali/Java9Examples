package com.java.practice.interfaceexamples;

public class SurfaceVehicle implements Vehicle, Engine {

	@Override
	public double getWeight() {
		return Double.valueOf(23.34d);
	}

	public static void main(String[] args) {
		SurfaceVehicle surfaceVehicle = new SurfaceVehicle();
		System.out.println(surfaceVehicle.getWeight());
		System.out.println(surfaceVehicle.getColor());
	}

	public String getColor() {
		return "GRAY";
	}

	@Override
	public int getNumCylinders() {
		return 4;
	}

}
