package com.shiva.patterns.templatemethod;

public class XMLDataRenderer extends DataRenderer {

	public String readData() {
		return "XML Data";
	}

	
	public String processData(String data) {
		return "Processed "+ data;
	}

}
