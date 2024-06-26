package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// To Launch Browser
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.jsp");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		 username.sendKeys("admin");
		 Thread.sleep(2000);
		 
		 WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		 password.sendKeys("manager");
		 Thread.sleep(2000);
		
		WebElement loginButton=driver.findElement(By.xpath("//a[text()='Login']"));
		loginButton.click();
	}

}
