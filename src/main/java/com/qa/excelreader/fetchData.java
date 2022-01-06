package com.qa.excelreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qa.base.testBase;

public class fetchData extends testBase {

	File f;
	FileInputStream fp;
	XSSFWorkbook workbook;
	static XSSFSheet sheet;

	
	public fetchData(String path, String sheetname) {
		
			
		try {
			
			workbook = new XSSFWorkbook(path);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		sheet = workbook.getSheet(sheetname);
	}
	public static int getRowCount() throws Exception{
		int rowc = 0;
		
		try {
			
		 rowc = sheet.getPhysicalNumberOfRows();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		return rowc;
	}


	public static String getCellDataString(int rowNum, int colNum) {

		
		String celData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
		
		return celData;
	}

	
	
	public static int getcolumnCount() {
		
		int colCount=0;
		
		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return colCount;
		
	}
}

/*
 * 
 * int row = sh.getLastRowNum();
	int cols = sh.getRow(0).getLastCellNum();


	for(int r=0;r<=row;r++) {

		//get rows then read cells from below for loop
		XSSFRow ro = sh.getRow(r);

		for(int c=0;c<cols;c++) {

			XSSFCell cell = ro.getCell(c);
			cell.getStringCellValue();
 */





