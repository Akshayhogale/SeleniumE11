package Assigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// To Launch Browser
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("q")).click();
		 driver.findElement(By.xpath("")).click();
//      WebElement search = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
//      search.sendKeys("Laptop");
//      
//      WebElement button=driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]"));
//		button.click();
//		Thread.sleep(2000);
		

		 driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling:: div[@class='_24_Dny']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//div[text()='RAM Capacity'])[1]")).click();
			driver.findElement(By.xpath("//div[text()='8 GB']/preceding-sibling::div[@class='_24_Dny']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[text()='Operating System']")).click();
			driver.findElement(By.xpath("//div[text()='Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[text()='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
			Thread.sleep(2000);
			
			List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			
			List<WebElement> laptopPrices = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
			
			for(int i=0; i<laptops.size();i++)
			{ 
				String op = laptops.get(i).getText();
				
				for(int j=i; j<=i; j++)
				{
					String price = laptopPrices.get(j).getText();
					System.out.println(op+":"+price);
					Thread.sleep(1000);
				}
				System.out.println();
			}

	}

}
