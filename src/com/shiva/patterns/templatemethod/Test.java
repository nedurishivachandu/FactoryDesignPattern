package com.shiva.patterns.templatemethod;

public class Test {
	public static void main(String[] args) {
		DataRenderer renderer = new XMLDataRenderer();
		renderer.render();
		
		DataRenderer renderer1 = new CSVDataRenderer();
		renderer1.render();
	}

}
