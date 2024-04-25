package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();// To Launch Browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.jsp");
		
	// To find username textbox and store in a veriable
		WebElement usnTB = driver.findElement(By.name("username"));
		 usnTB.sendKeys("admin");// To pass the inputs to username textbox
		 
		// To find password textbox and store in a veriable
		 WebElement passTB = driver.findElement(By.name("pwd"));
		 passTB.sendKeys("manager");// To pass the inputs to password textbox
		 	
	}

}
