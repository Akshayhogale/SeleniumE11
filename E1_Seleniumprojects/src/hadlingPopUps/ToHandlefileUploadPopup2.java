package hadlingPopUps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandlefileUploadPopup2 {

	public static void main(String[] args) throws InterruptedException, IOException {
/*   	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		    Thread.sleep(1000);
		 driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\Saurabh Waikule\\Downloads\\Resume 1.pdf");    */
	    
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
		/* WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		    driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\Saurabh Waikule\\Downloads\\Resume 1.pdf");  */
		 
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		    /*   WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		 driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		    WebElement fileUpload = driver.findElement(By.id("myFile"));
	      	  	    Actions act = new Actions(driver);
		    act.click(fileUpload).perform();
		    Thread.sleep(1000);
		    
		    Runtime.getRuntime().exec("./autoItPrograms/fileUpload1.exe");  */
//		 ----------------------------------------------------------------------------------------------------------------------------------------------------------------
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		 driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		    WebElement fileUpload = driver.findElement(By.id("fileInput"));
		    
			    Actions act = new Actions(driver);
			    act.click(fileUpload).perform();  /// To click on choose file button
			    Thread.sleep(1000);
			    
			    // To handle file upload popup by passing the relative path of the file
			    Runtime.getRuntime().exec("./autoItPrograms/fileUpload1.exe");
	}
	

}
