package com.shiva.patterns.factory;

public class CheesePizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing Cheese Pizza");
	}

	public void bake() {
		System.out.println("Baking Cheese Pizza");
	}

	public void cut() {
		System.out.println("Cutting Cheese Pizza");
	}

}
