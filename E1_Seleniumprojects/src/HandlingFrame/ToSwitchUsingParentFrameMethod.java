package HandlingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchUsingParentFrameMethod {

	public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
				driver.get("https://www.bluestone.com/");
				Thread.sleep(1000);
				driver.findElement(By.id("confirmBtn")).click();				
			
//				driver.switchTo().activeElement().click();
				Thread.sleep(1000);
				driver.switchTo().frame("fc_widget");
				driver.findElement(By.id("chat-icon")).click();
				
				driver.switchTo().parentFrame();
				driver.findElement(By.id("chat-fc-name")).sendKeys("akshay");
				
	
	}

}
