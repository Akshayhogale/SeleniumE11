package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();  //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui");
		
		// To typecast into javascripExecutor
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(1000);
		
		WebElement disabledTextBox = driver.findElement(By.id("name"));
		
		 // To  pass input to disabled Element
		JavascriptExecutor js = (JavascriptExecutor)driver;
  		js.executeScript("document.getElementById('name').value='admin'");
		
//		js.executeScript("arguments[0].value=' '",disabledTextBox);
		
		Thread.sleep(1000);
		
		//To clear content from a disabled textbox 
		js.executeScript("document.getElementById('name').value=' '");
			
				
				
				
		
		

	}

}
