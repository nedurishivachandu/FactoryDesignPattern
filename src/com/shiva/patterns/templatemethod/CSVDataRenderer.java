package com.shiva.patterns.templatemethod;

public class CSVDataRenderer extends DataRenderer {

	public String readData() {
		return "CSV Data";
	}

	
	public String processData(String data) {
		return "Processed "+ data;
	}

}
