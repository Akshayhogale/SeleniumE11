package hadlingPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleNotificationPopup {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver  driver=new ChromeDriver(co); //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAiAlcyuBhBnEiwAOGZ2Sy7FE7BJr28zC1Mt0u92QU1mK8etUxVSHbB1kyRUu1gII2-JFkmjFhoC4r4QAvD_BwE");
	}

}
