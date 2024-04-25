package hadlingPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHanddledAlertpopup {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();  //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(1000);
		
		// To genrate alert popup
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(1000);
		
		//To switch the control to alert popup
		Alert alertPopup = driver.switchTo().alert();
		
		// Tp click on ok button
//      alertPopup.accept();
      
   // Tp click on ok button
      alertPopup.dismiss();
	}

}
