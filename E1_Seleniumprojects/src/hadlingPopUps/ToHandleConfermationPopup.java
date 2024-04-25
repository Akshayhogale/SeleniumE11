package hadlingPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToHandleConfermationPopup {

	public static void main(String[] args) throws InterruptedException {              

        WebDriver  driver=new ChromeDriver(); //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(1000);
	
	Alert confirmationAlert = driver.switchTo().alert();
	Thread.sleep(1000);
        confirmationAlert.accept();
	}

}
