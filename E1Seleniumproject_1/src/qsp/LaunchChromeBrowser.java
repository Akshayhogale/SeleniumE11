package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To set the path of driver executable file.
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				new ChromeDriver(); //Launch Chrome Browser

	}

}
