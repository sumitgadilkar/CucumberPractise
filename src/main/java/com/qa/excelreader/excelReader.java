package com.qa.excelreader;

import com.qa.base.testBase;

public class excelReader extends testBase {

	 
	
	public static Object[][] testDatReader() throws Exception {
		
		fetchData f = new fetchData("E:/Selenium Projects/CucumberPractise/src/main/java/com/qa/datsheets/testData.xlsx", "Sheet1");		
		
		//"E:/Selenium Projects/CucumberPractise/src/main/java/com/qa/datsheets/testData.xlsx", "Sheet1"
		
		int rowcount = fetchData.getRowCount();
		int colcount = fetchData.getcolumnCount();
		
		Object data[][] = new Object [rowcount][colcount]; //2-D object
		
		
		for(int r=1; r<rowcount; r++) {
			
			for(int c=0; c < colcount; c++ ) {
				
				String cellData = fetchData.getCellDataString(r, c);
				data[r-1][c] = cellData;
				
			}
		}
		 
		return data;
	}
	
	
	
}
