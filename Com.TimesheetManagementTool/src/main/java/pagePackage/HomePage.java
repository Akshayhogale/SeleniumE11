package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Declaration
		@FindBy(xpath="//div[text()='Time-Track']/ancestor :: a/ descendant :: img") private WebElement timeTrackModule;
		@FindBy(xpath="//div[text()='Subtasks']/ following-sibling :: img") private WebElement subtasksModule;
		@FindBy(xpath="//div[text()='Reports']/ following-sibling :: img") private WebElement reportsModule;
		@FindBy(xpath="//div[text()='Users']/ following-sibling :: img") private WebElement usersModule;
		@FindBy(xpath="//div[text()='Work Schedule']/ following-sibling :: img") private WebElement workScheduleModule;
		@FindBy(xpath="//div[text()='Settings']/ following-sibling :: img") private WebElement settingsModule;
		@FindBy(partialLinkText = "Logout") private WebElement logoutLink;
		
		
		// Initialization
		
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}


		//Utilization
		public WebElement getTimeTrackModule() {
			return timeTrackModule;
		}

		public WebElement getSubtasksModule() {
			return subtasksModule;
		}

		public WebElement getReportsModule() {
			return reportsModule;
		}


		public WebElement getUsersModule() {
			return usersModule;
		}


		public WebElement getWorkScheduleModule() {
			return workScheduleModule;
		}


		public WebElement getSettingsModule() {
			return settingsModule;
		}


		public WebElement getLogoutLink() {
			return logoutLink;
		}
	
	
	
}