package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastinginintoRemotWebDriver {

	public static void main(String[] args) throws IOException {
		
		 RemoteWebDriver driver = new ChromeDriver();  //TO store the reference store RemotWebDriver class
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		
		driver.get("https://www.amazon.com/");
		

	    File src = driver.getScreenshotAs(OutputType.FILE); // To take the screenshot of webpage
	    
	    File dest = new File("./screenshots/Amazon.jpg");// To Specify the location,name and extension
	    
	    Files.copy(src, dest);// To copy and past the screenshot in the specified folder.

	}

}
