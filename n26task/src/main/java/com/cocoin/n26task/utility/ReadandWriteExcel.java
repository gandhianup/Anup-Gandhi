package com.cocoin.n26task.utility;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWriteExcel {

	public static XSSFSheet sheet;
	public static XSSFWorkbook workbook;
	public static XSSFCell cell;
	
	public static String getCellData(String sheetName, int RowNum, int ColNum) throws IOException {
		
		loadExcel("/ExcelData.xlsx");
		
		try{
		sheet = workbook.getSheet(sheetName);
		cell = sheet.getRow(RowNum).getCell(ColNum);
		String CellData = cell.getStringCellValue();
		return CellData;
		}catch (Exception e){
		return"";
		}
	}
	
	public static void excelClose() throws IOException{
		workbook.close();
	}
	
	private static void loadExcel(String filePath) throws IOException {

		FileInputStream ExcelFile = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(ExcelFile);
	}
}
