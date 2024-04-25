package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();//To launch the browser
		
		driver.navigate().to("https://www.flipkart.com/");//To launch the web application
		
		Thread.sleep(3000);
		
		driver.navigate().back();//To navigate back
		
		Thread.sleep(1000);
		
		driver.navigate().forward();//To navigate forward
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();//To navigate the web page
	}

}
