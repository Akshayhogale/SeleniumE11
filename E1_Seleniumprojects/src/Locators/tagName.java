package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//Launch the browser
		driver.manage().window().maximize();//To maximize the browser window
		driver.get("file:///D:/SELENIUMDATA/WebElements/txtbox.html");
//To launch web application
		Thread.sleep(2000);
		
		WebElement textBox = driver.findElement(By.tagName("input"));//Find password TextField on the webpage
		
		textBox.sendKeys("manager");//To pass the inputs to password TextField
		
		//Note:-Inputs are passed to UserName TextField because it is the 1st element designed with input tag
	}

}
