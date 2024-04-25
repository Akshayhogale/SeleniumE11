package Loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapchat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();// To Launch Browser
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.snapchat.com/");
		Thread.sleep(2000);
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@class=\"HomePageCTAButtons_loginToChatCTA__4pytZ\"]"));
		loginButton.click();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		 username.sendKeys("Ak1235");
		 Thread.sleep(2000);
		 
		WebElement nextButton=driver.findElement(By.xpath("//button[type=\"submit\""));
		nextButton.click();
	}

}
