package com.java.practice.generics;

public class ShippableAbstractCrate<U> implements Shippable<U> {
	@Override
	public void ship(U t) {	}
}