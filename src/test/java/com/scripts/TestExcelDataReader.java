package com.scripts;

import com.generic.ExcelSheetReaderUtility;

public class TestExcelDataReader {
   
	public static void main(String[] args){
		ExcelSheetReaderUtility.loadExcelFile(System.getProperty("user.dir")+"/src/main/resources/External Resources/excel/Automation__External_Excelsheet.xlsx", "Sheet1");
	    String strTestData="";
	    
	    for (int intRow = 0; intRow < 6; intRow++) {
	    	for (int intColm = 0; intColm < 4; intColm++) {
	    		strTestData=ExcelSheetReaderUtility.getExcelCellData(intRow, intColm);
	    		System.out.println("print test data >>"+strTestData);
				
			}
			
		}
	    
	    System.out.println("==========================================");
	     String strData=ExcelSheetReaderUtility.getExcelCellData(1, 1);
	     System.out.println("UserName ="+strData);
	}
	
}
