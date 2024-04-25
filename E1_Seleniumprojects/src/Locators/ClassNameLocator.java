package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/SELENIUMDATA/WebElements/txtbox.html");
		Thread.sleep(2000);
		
		WebElement passTextBox = driver.findElement(By.className("pass-textbox"));
		passTextBox.sendKeys("Admin");
	}

}
