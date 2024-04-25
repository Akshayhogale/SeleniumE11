package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRactmethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//To launch Chrome driver 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.jsp");
		
	    
	   WebElement loginButton = driver.findElement(By.id("loginButton")); //to find the login button 
	   Rectangle rect = loginButton.getRect(); 
	   System.out.println(rect.getHeight());
	   System.out.println(rect.getWidth());
	   System.out.println(rect.getX());
	   System.out.println(rect.getY());

	}

}
