package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToGetTheRowCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/testData.xlsx"); // provide the path of excel
		Workbook wb = WorkbookFactory.create(fis); // To make the file ready to read
		       Sheet sheet = wb.getSheet("invalidcreads"); // To get into the sheet
        int rc = sheet.getLastRowNum();	 // To get the no. of rows
        
        System.out.println(rc);
	}

}
