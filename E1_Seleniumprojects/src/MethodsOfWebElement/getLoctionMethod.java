package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLoctionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();//To launch chrome driver 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.jsp");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));//to find the login button 
		Point point = loginButton.getLocation();// to get location of login button
		int x_axis = point.getX();// to get the x axis point of login  button 
		int y_axis = point.getY();// to get the y axis point of login  button
		
		System.out.println(" x_axis is:"+ x_axis+" "+" y_axis is:"+ y_axis);// to print the value of x and y in the console
	}

}
