package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringWedDriver {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();  //TO upcast to webDriver Interface
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);// To crete the object of EventFiringWebDriver 
		
               File src = efwd.getScreenshotAs(OutputType.FILE); // To take the screenshot of webpage
	    
	    File dest = new File("./screenshots/instagram.jpg");// To Specify the location,name and extension
	    
	    Files.copy(src, dest);// To copy and past the screenshot in the specified folder.



	}

}
