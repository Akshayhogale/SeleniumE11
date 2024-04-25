package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenwebElement {

	public static void main(String[] args)  {
	
			ChromeDriver driver = new ChromeDriver();  //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("	https://www.facebook.com/r.php?r=101");
		
		WebElement hiddenElement = driver.findElement(By.xpath("//input[@name='custom_gender']"));
//		hiddenElement.sendKeys("qspiders");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='qspiders'",hiddenElement);
		
	}

}
