package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		
	 driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		driver.findElement(By.partialLinkText("Double Click")).click();
		
		
		 WebElement yesButton = driver.findElement(By.id("btn20"));
		 WebElement noButton = driver.findElement(By.id("btn23"));
		 WebElement ratingButton = driver.findElement(By.id("btn26"));
		
		Actions act = new Actions(driver);   // To create the object of Actions class.
		
		act.doubleClick(yesButton).perform();// To perform double click operation on 'yes' button
		act.doubleClick(noButton).perform();// To perform double click operation on 'no' button
		act.doubleClick(ratingButton).perform();//To perform double click operation on 'rating' button
	}

}
