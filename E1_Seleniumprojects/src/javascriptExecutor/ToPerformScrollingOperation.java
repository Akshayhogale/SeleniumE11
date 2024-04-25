package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollingOperation {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver = new ChromeDriver();  //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver; // To typecast fromm driver to java script executer
		
		//To perform Scroll Downward Operation
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		// To perform scroll upward Operation
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
		driver.close();
	}

}
