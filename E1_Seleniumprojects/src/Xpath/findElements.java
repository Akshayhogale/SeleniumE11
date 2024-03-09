package Xpath;

import java.util.List;
  import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();// To Launch Browser
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		 WebElement activeEle = driver.switchTo().activeElement();
		 activeEle.sendKeys("bikes");
		 Thread.sleep(2000);
		 
		 List<WebElement> bikeOptions =driver.findElements(By.linkText("//div[@class='wM6W7d']"));
		 
		
//		 for(int i=0; i<bikeOptions.size();i++)
//		 {
//			 String ops=bikeOptions.get(i).getText();
//			 System.out.println(ops);
//			 Thread.sleep(1000);
//		 }
	
		 for (WebElement we:bikeOptions)
		 {
			 String ops=we.getText();
			 System.out.println(ops);
			 Thread.sleep(1000);
			 
		 }
	}

}
