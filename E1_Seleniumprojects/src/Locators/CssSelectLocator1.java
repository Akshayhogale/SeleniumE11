package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectLocator1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();// To launch chrome Browser
		driver.manage().window().maximize();// To Maximize the browser window
		driver.get("https://www.instagram.com");// To launch the web application
		Thread.sleep(2000);
		// To find/locate username textbox and pass the inputs
		WebElement usnTB=driver.findElement(By.cssSelector("input[aria-label='ph]"));
		usnTB.sendKeys("qspiders");
		Thread.sleep(2000);
		
		// To find/locate password textBox and pass the inputs
		WebElement passTB=driver.findElement(By.cssSelector("input[type$=' cword']"));
		passTB.sendKeys("Password@123");
		Thread.sleep(2000);
		
		//To click on login Button
		WebElement loginButton = driver.findElement(By.cssSelector("button[type*='bm']"));
		loginButton.click();

	}

}
