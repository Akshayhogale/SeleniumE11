package MethodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandWindowHandles {

	public static void main(String[] args) {
             WebDriver driver =	new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
              driver.get("https://omayo.blogspot.com/");
              
              
              String parentwindow = driver.getWindowHandle();  // To get the address of parent window
              System.out.println(parentwindow);  // To print the parent window address in the console
               String parentTitle = driver.getTitle();  // To get the title oa parent window
               
               driver.findElement(By.partialLinkText("Open a popup window")).click();  // To open a new window
             Set<String> allWindws = driver.getWindowHandles();  // To get the address of all the windows
             
             // To iterate and switch the control to the windows one by one
             for (String wh: allWindws)
             {
            	String title = driver.switchTo().window(wh).getTitle(); // To get the title of each window
            	
            	 if (!title.equals(parentTitle))   // To compare the titles with parent window title
            	 {
					driver.close();   // Ton close the child window
				}
			}
      	}

}
