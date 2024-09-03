package com.shiva.patterns.factory;

public class VeggiePizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing Veggie Pizza");
	}

	public void bake() {
		System.out.println("Baking Veggie Pizza");
	}

	public void cut() {
		System.out.println("Cutting Veggie Pizza");
	}

}
