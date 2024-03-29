package HandlingDropdown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesUsingHasSet {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("file:///D:/SELENIUMDATA/WebElements/DropdownMultiple.html");
	    
	    WebElement multiSelectDD = driver.findElement(By.id("menu"));
	    
	     Select sel = new Select(multiSelectDD);// To create the object of select

	     // To remove the Duplicates
	      HashSet<String> Hs = new HashSet <String>();// To create the object of TreeSet
	     
	     List<WebElement> options = sel.getOptions();// To get the list of all the options
	     
	     for(int i=0 ;i<options.size();i++)
	     {
	    	 String textToInsert = options.get(i).getText();
	    	 Hs.add(textToInsert);
	     }
	    
	     System.out.println(Hs);// To get array list output
	     for (String t:Hs)
	     {
	    	 System.out.println(t);// To get separate out put


	}
	}
}


