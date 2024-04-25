package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();  //TO upcast to webDriver Interface
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
		
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/loginButton.png");
		Files.copy(src, dest);
		
		

	}

}
