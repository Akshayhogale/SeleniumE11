package hadlingPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver(); //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='March 2024']/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()='25']")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
