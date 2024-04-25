package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValueMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.jsp");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));//To find login button and store in a veriable
		String cssValue =loginButton.getCssValue("background");// to get the css value used for background
		System.out.println(cssValue );// to print the received value used in the console
		
		String color =loginButton.getCssValue("color"); //to get the color( value) of login button
		System.out.println(color);// to print the  value  in the console
	}
}
