package HandlingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppFrame {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click(); // To click on frame option
		
 	driver.findElement(By.xpath("//section[text()='iframes']")).click();  // To click on iframe option
 	// To find the frame and store in a variable
 	WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
 
 	// To switch the control to frame element
 	driver.switchTo().frame(frameElement);
 	
 	// To find the element present inside the frame
 	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Akshay");
 	
 	// To switch the control back to main webpage
 	driver.switchTo().defaultContent();
 	
 	// To click on Nested iframe option on main webpage
 	driver.findElement(By.partialLinkText("Nested iframe")).click();

	}

}
