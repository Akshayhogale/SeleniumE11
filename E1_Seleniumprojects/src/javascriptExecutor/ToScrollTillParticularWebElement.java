package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillParticularWebElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();  //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		
		WebElement scrollTarget = driver.findElement(By.xpath("//h2[text()='News']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;// To typecast fromm driver to java script executer
		
		js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);

		Thread.sleep(1000);
		driver.close();
	}

}
