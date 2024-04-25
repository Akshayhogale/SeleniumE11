package HandlingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingindexOfFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.get("https://www.dream11.com/");
				
	driver.switchTo().frame(0);	
		driver.findElement(By.id("regEmail")).sendKeys("1234567892");
		

	}

}
