package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.jsp");
		
	// To find username textbox and store in a veriable
		WebElement usnTB = driver.findElement(By.name("username"));
		 
		Dimension size = usnTB.getSize();
		int Height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("Height is:"+Height+" "+"width is:"+width);
	}

}
