package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizontal {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();  //TO launch the browser
//		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
JavascriptExecutor js = (JavascriptExecutor)driver;// To typecast fromm driver to java script executer
		
		//To perform Scroll Right Operation
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(1000);
		
		// To perform scrollleft Operation
		js.executeScript("window.scrollBy(-150,0)");
		Thread.sleep(1000);
		
		driver.close();
	}

}
