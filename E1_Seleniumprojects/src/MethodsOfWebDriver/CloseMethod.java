package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//To Launch Chrome Browser
		Thread.sleep(5000);//To stop the execution for 5 sec
		driver.close();//To close the Browser Window
	}

}
