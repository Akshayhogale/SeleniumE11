package HandlingFrame;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class IdentifyGoogleMap {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.get("https://www.google.com/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@class='gb_d']")).click(); 
        
		driver.switchTo().frame("app");
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(1000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/google.png");
        Files.copy(scr, dest);
		
		
	
		
	}

}
