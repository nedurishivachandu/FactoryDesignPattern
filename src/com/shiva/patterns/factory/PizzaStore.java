package com.shiva.patterns.factory;

public class PizzaStore {
	
	public static Pizza orderPizza(String type) {
	    Pizza p = PizzaFactory.createPizza(type); 
		p.prepare();
		p.bake();
		p.cut();
	
		
		return p;
	}

}
