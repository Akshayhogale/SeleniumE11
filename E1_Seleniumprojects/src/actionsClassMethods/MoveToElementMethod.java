package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MoveToElementMethod {

	public static void main(String[] args) {
		
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Driver.get("https://www.flipkart.com/");
		
		 WebElement homeAndFurniture = Driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		
		Actions act = new Actions(Driver);
		act.moveToElement(homeAndFurniture).perform();
		
		
		
	}

}
