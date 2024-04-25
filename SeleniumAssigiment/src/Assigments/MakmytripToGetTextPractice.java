package Assigments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakmytripToGetTextPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver(); //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
		
		List<WebElement> dateList = driver.findElements(By.className("DayPicker"));
		Thread.sleep(1000);
		
		int count=dateList.size();
		for (int i = 0; i < count; i++) 
		{
			String text = driver.findElement(By.className("DayPicker")).getText();
			System.out.println("text is"+text);
			if (text.equalsIgnoreCase("30"))
			{
				driver.findElements(By.className("DayPicker")).get(i).click();
			}
		}
	}
}
