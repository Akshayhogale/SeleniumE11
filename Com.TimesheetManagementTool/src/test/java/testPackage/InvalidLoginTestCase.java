package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomListener.class)
public class InvalidLoginTestCase extends BaseTest{

	@Test
	public  void invalidLogin() throws IOException, EncryptedDocumentException, InterruptedException {
	 
	 Flib flib = new Flib();
	 
	 LoginPage lp = new LoginPage(driver);
	 
	 int rc = flib.getRowCount(EXCEL_PATH, "invalidcreads");
	 
	 for(int i=1; i<=rc; i++)
	 {
		 lp.invalidLoginMethod(flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 0), flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 1));
	 }
	}

}