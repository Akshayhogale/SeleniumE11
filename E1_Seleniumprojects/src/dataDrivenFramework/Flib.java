package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {   
	
// This class use to store all the generic reusable methods
	// All the methods are non static methods
	
	// This method is use to read the data from Excel file
	public String readExcelData(String excelPath,String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); // TO provide the path of excel file
		Workbook wb = WorkbookFactory.create(fis); // To make the file ready to read
		Sheet sheet = wb.getSheet("validcreds");// To get into desired sheet
		Row row = sheet.getRow(1);// To get into desired row
		Cell cell = row.getCell(0);// To get into desired cell
		String data = cell.getStringCellValue();// To read the data from the cell
		
		return data;
		
	}
	// This method is used to get the no. of rows from a particular sheet
	public int getRowCount(String excelpath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath); // To provide the path of excel file
		Workbook wb = WorkbookFactory.create(fis);// To make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);// To get into the desired sheet
		int rc = sheet.getLastRowNum();// To get the no. of rows from a sheet
		return rc;
		}
	public void writeExcelData(String excelpath, String sheetName,int rowNo,int cellNo,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);// To provide the path of excel file
		Workbook wb = WorkbookFactory.create(fis);// To make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);// To get into the desired sheet
		Row row = sheet.getRow(0);// To get into the desired row 
		Cell cell = row.getCell(0);// To get into the desired cell
		cell.setCellValue(data);// To pass the string data to the desired cell
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		
	}
}
//Flib:- file labrary