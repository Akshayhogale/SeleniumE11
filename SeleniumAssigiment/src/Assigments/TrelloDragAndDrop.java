package Assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloDragAndDrop {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();  //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://trello.com/home");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("collingoves1996@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Favoured#7");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
				
		driver.findElement(By.xpath("//div[text()='E1']")).click();
		//source elements
		WebElement javaSrc = driver.findElement(By.xpath("//a[text()='JAVA']"));
		WebElement ManualSrc = driver.findElement(By.xpath("//a[text()='manual Testing']"));
		WebElement apiSrc = driver.findElement(By.xpath("ApI"));
		WebElement seleniumSrc = driver.findElement(By.xpath("//a[text()='selenium']"));
		
		//Target Element
		
		WebElement mockGivenTarget = driver.findElement(By.xpath("//h2[text()='Mock Given']"));
		WebElement mockGivenTarget1 = driver.findElement(By.xpath("//textarea[text()='Mock Pending']"));
		WebElement mockGivenTarget2 = driver.findElement(By.xpath("//testarea[text()='Mock Scheduled']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(mockGivenTarget1, mockGivenTarget2);
		}

}
