package HandlingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingFrameElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.get("https://www.dream11.com/");
							Thread.sleep(1000);
							
					// To identify the frame by writting xpath
				WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
				
				// To pass the reference of frame element 
				driver.switchTo().frame(frameElement);
				
				// To perform operation on element designed inside frame
		      driver.findElement(By.id("regEmail")).sendKeys("1234567892");
	}

}
