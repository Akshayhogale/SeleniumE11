package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enter The Browser Name");
		
		try (Scanner sc = new Scanner(System.in)) {
			String browserValue = sc.next();
			
			if(browserValue.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.close();
			}
			else if(browserValue.equalsIgnoreCase("firefox"))
					{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.close();
			}
			else
				System.out.println("Enter a valid browser");
		}
			
			

	}

}
