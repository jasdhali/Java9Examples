package com.java.practice.generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleBoundExample {

	public static void main(String[] args) {
		// Unbound example
		List<?> list = new ArrayList<>();

		// Upper bond example

		List<? extends Exception> listException = new ArrayList<IOException>();
		
		// All below are valid
		//listException.add(new FileNotFoundException("Just example"));
		
		// Lower bound example
		List<? super Exception> listExceptionLower = new ArrayList<Exception>();

		//
		List<? extends Number> listInt = new ArrayList<Integer>();
		List<? extends Number> listDouble = new ArrayList<Double>();
		
		
	}
	
	private void methodToDemoGenerics() {
		List<?> list1 = 
	}

}

class A {}
class B extends A {}
class C extends B {}