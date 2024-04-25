package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class ByExplicitTypecasting {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();  //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.co.in/");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;        // To Perform typec-asting
		 File src = ts.getScreenshotAs(OutputType.FILE);     // To take the screenshot of the webpage
		 
		 File dest = new File("./screenshots/google.png");   // To  specify the location, name and extension of 
		 
		 Files.copy(src,dest);                        // To save the screenshot into screenshots folder.

		 // file.copy(scr,dest)
		 
		 FileHandler.copy(src, dest);
	}

}
