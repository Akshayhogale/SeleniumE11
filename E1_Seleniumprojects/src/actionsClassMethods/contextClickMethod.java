package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClickMethod {

	public static void main(String[] args) {
		
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act = new Actions(Driver);                                              // To create the object of actions class
		
		 WebElement button = Driver.findElement(By.xpath("//section[text()='Button']"));
		 act.click(button).perform();                                                   // To perform single click operation using click method of Actions class
		 
		 WebElement righClickLink= Driver.findElement(By.partialLinkText("Right Click"));
		  act.click(righClickLink).perform();                                           // To perform single click operation using click method Action class
		 
		 WebElement button1 = Driver.findElement(By.xpath("//button[@id='btn30']"));
		 act.contextClick(button1).perform();                                          // To perform right click operation on webElement 
		 WebElement button10 = Driver.findElement(By.xpath("//div[text()='Yes']"));
		 act.click(button10).perform();                                                // To perform single click operation using click method Action class  
		 
		 WebElement button20= Driver.findElement(By.xpath("//button[@id='btn31']"));
		 act.contextClick(button20).perform();                                           // To perform right click operation on webElement
		 WebElement button2option = Driver.findElement(By.xpath("//div[text()='No']"));
		 act.click(button2option).perform();                                                  // To perform single click operation using click method of Action class
		 
		 WebElement button30 = Driver.findElement(By.xpath("//button[@id='btn32']"));
		 act.contextClick(button30).perform();                                            // To perform right click operation on webElement
		 WebElement button3option = Driver.findElement(By.xpath("//div[text()='5']"));
		 act.click(button3option).perform();                                                   // To perform single click operation using click method of Action class
   }
}
