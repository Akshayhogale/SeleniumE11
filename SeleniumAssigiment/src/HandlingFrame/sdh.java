package Practies;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class asjl {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.zomato.com/india");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,10000)");
	
	 driver.findElement(By.xpath("//a[@class=\"sc-elhb8j-17 iDzUMo\"and@href=\"https://in.linkedin.com/company/zomato\"]")).click();
	  
	    TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/linkdin.png");
		Files.copy(src, dest);
		Thread.sleep(10000);
		driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//a[@class=\"sc-elhb8j-17 iDzUMo\"and@href=\"https://www.instagram.com/zomato/\"]")).click();
	Thread.sleep(5000);
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//a[@class=\"sc-elhb8j-17 iDzUMo\"and@href=\"https://twitter.com/zomato\"]")).click();
	Thread.sleep(5000);
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//a[@class=\"sc-elhb8j-17 iDzUMo\"and@href=\"https://www.youtube.com/zomato\"]")).click();
	Thread.sleep(5000);
	driver.switchTo().parentFrame();
		
	driver.findElement(By.xpath("//a[@class=\"sc-elhb8j-17 iDzUMo\"and@href=\"https://www.facebook.com/zomato\"]")).click();
	Thread.sleep(5000);
	driver.switchTo().parentFrame();
	
	String parentWindow=driver.getWindowHandle();
	System.out.println(parentWindow);
   String  parentTitle=driver.getTitle();
   	
	Set<String >allWindows =driver.getWindowHandles();
	for (String Wh : allWindows)
	{
	  String title=driver.switchTo().window(Wh).getTitle();
	  if(!title.equals(parentTitle))
	  {
		 driver.close();
	  }
	}
	}

}
