package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("email");
		Thread.sleep(1000);
		
		WebElement passTextBox = driver.findElement(By.id("pass"));
		passTextBox.sendKeys("password");
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();

	}

}
