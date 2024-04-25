package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class CreateNewClientAndProduct extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
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
