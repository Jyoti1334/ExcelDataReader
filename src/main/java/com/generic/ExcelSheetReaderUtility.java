package com.generic;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReaderUtility {
	// step 1. create workbook
	private static XSSFWorkbook workbook;
	 
	//step 2. create or get sheet
	private static XSSFSheet excelSheet;
	
	//step 3. create or get row
	private static XSSFRow  row;
	
	//step 4. create or get cell
	private static XSSFCell  cell;
 
	
	public static void loadExcelFile(String strexcelFilePath,String strSheetName){
		try {
			
			FileInputStream excelFile=new FileInputStream(strexcelFilePath);
			workbook=new XSSFWorkbook(excelFile);
			excelSheet = workbook.getSheet(strSheetName);
			
		} catch (Exception exception) {
			System.out.println("While loading excel getting error >>"+exception.getMessage());
		    exception.printStackTrace();
		}
	}
	
	public static String getExcelCellData(int rowNum, int cellNum){
		try {
			cell=excelSheet.getRow(rowNum).getCell(cellNum);
			String strCellData=cell.getStringCellValue();
			return strCellData;
			
			
		} catch (Exception exception) {
			System.out.println("getting error while reading excel data >>"+exception.getMessage());
			exception.printStackTrace();
			return "";
		}
	}
}
