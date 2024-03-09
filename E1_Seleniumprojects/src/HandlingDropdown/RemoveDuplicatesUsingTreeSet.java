package HandlingDropdown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesUsingTreeSet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("file:///D:/SELENIUMDATA/WebElements/DropdownMultiple.html");
	    
	    WebElement multiSelectDD = driver.findElement(By.id("menu"));
	    
	     Select sel = new Select(multiSelectDD);// To create the object of select

	     // To remove the Duplicates
	     TreeSet<String> ts = new TreeSet <String>();// To create the object of TreeSet
	     
	     List<WebElement> options = sel.getOptions();// To get the list of all the options
	     
	     for(WebElement we: options)
	     {
	    	 String textToInsert = we.getText();
	    	 ts.add(textToInsert);
	     }
	     System.out.println(ts);// To get array list output
	     for (String text:ts)
	     {
	    	 System.out.println(text);// To get separate out put
	     }
	     
	}

}
