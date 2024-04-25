package hadlingPopUps;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
/*	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    driver.get("https://omayo.blogspot.com/");
		    Thread.sleep(1000);
	    
	    driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\Saurabh Waikule\\Downloads\\Resume 1.pdf");   */
	    
//	    ------------------------------------------------------------------------------------------------------------------------------------
		/*	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	    Thread.sleep(1000);
	    
	    WebElement upload= driver.findElement(By.id("fileInput"));//.sendKeys("C:\\Users\\Saurabh Waikule\\Downloads\\Resume 1.pdf");
	        upload.sendKeys("C:\\Users\\Saurabh Waikule\\Downloads\\Resume 1.pdf"); */
	        
	        
 //--------------------------------------------------------------------------------------------------------------------------------------------------------
			WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));  
		driver.get("https://omayo.blogspot.com/");
		    WebElement fileUpload = driver.findElement(By.id("uploadfile"));
		    Actions act = new Actions(driver);
		    act.click(fileUpload).perform();
		    Thread.sleep(1000);
		    
		    Runtime.getRuntime().exec("./autoItPrograms/fileUpload.exe");

	}

}
