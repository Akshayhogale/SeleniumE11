package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://wwww.facebook.com/");
		Thread.sleep(2000);
		 String title  = driver.getTitle();
		
		System.out.println(title);
		
	}

}
