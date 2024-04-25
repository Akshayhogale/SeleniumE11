package Assigments;

import java.io.File; 
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class AssigmentOnActionAndTakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();// To Launch Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);
		 
		driver.findElement(By.id("confirmBtn")).click();
		
		Thread.sleep(1000);
        driver.switchTo().activeElement().click();
		
        Thread.sleep(1000);
        Actions act = new Actions(driver);
	      WebElement coins = driver.findElement(By.id("goldCoins"));
	      act.moveToElement(coins).perform();
	      Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='1 gram'] ")).click();
	    
	    Thread.sleep(1000);
	    WebElement coinD = driver.findElement(By.xpath("//div[@class='mousetrap']"));
	      	      
	    boolean CC = coinD.isDisplayed();
		System.out.println(CC);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/bluestone.png");
        Files.copy(scr, dest);
			 
	}

}
