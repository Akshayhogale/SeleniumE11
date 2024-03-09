package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To set the path of driver executable file.
				System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
				
				new FirefoxDriver(); //To Launch Firefox Browser

	}

}
