package HandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("file:///D:/SELENIUMDATA/WebElements/Dropdown.html");
	    
	    
		   WebElement multiselectdropDown = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectdropDown);
       for (int i=2; i<=4 ; i++) {
    	   sel.selectByIndex(i);
    	   
       }
       
       WebElement firstOption = sel.getFirstSelectedOption();
       System.out.println(firstOption.getText());
		
	}

}
