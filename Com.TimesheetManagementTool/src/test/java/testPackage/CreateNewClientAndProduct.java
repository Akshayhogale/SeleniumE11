package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskPage;
@Listeners(CustomListener.class)
public class CreateNewClientAndProduct extends BaseTest {

	@Test
	public void CreateNewClientAndProductTC() throws IOException, EncryptedDocumentException, InterruptedException {
				
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		String username = flib.readPropertyData(PROP_PATH, "username");
		String pwd = flib.readPropertyData(PROP_PATH, "password");
		lp.validLoginMethod(username, pwd);
		
		HomePage hp= new HomePage(driver);
		hp.getSubtasksModule().click();
		
		TaskPage tp = new TaskPage(driver);
		tp.createClientMethod(flib.readExcelData(EXCEL_PATH,"taskpagedetails", 1, 0));
		
		tp.createProjectMethod(flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 0), flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 1));
		
		Thread.sleep(2000);
		tp.deleteAllclientsAndProducts();
	}
}
