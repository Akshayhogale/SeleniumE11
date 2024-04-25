package Sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();// To Launch Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));// TO declare implicit wait
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));// TO declare explicit wait
		
		driver.get("https://www.shoppersstack.com/");// to launch web application
		
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
	
	         wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='check']"))));
			driver.findElement(By.xpath("//button[@id='check']")).click();
//		
//		WebElement checkButton = driver.findElement(By.xpath("//button[@id='Check']"));
//		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
//		checkButton.click();

	
	}
}
