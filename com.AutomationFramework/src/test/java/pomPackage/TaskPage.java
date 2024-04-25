package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {

	@FindBy(xpath = "//a[text()='Products & Clients']") private WebElement productsAndClientsLink;
	@FindBy(xpath = "//input[@value='Create New Client']") private WebElement createNewClientButton;
	@FindBy(name = "name") private WebElement clientNameTB;
	@FindBy(name="createCustomerSubmit") private WebElement createCustomerButton;
	@FindBy(xpath = "//input[contains(@value,' Cancel')]") private WebElement createClientCancelButton;
	@FindBy(xpath = "//input[@value='Create New Product']") private WebElement createNewProductButton;
	@FindBy(name="customerId") private WebElement selectCustomerDropdown;
	@FindBy(name="name") private WebElement projectNameTB;
	@FindBy(name="createProjectSubmit") private WebElement createProjectButton;
	@FindBy(xpath = "//input[contains(@value,' Cancel')]") private WebElement createProductCancelButton;
	@FindBy(linkText = "All") private WebElement allClientsAndProductsLink;
	@FindBy(xpath = "//input[@value='Delete Selected']") private WebElement deleteSelectedButton;
	@FindBy(xpath = "//input[@value='Archive Selected']") private WebElement archiveSelectedButton;
	@FindBy(id = "deleteButton") private WebElement deleteThisClientPopup;
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public WebElement getProductsAndClientsLink() {
		return productsAndClientsLink;
	}


	public WebElement getCreateNewClientButton() {
		return createNewClientButton;
	}


	public WebElement getClientNameTB() {
		return clientNameTB;
	}


	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}


	public WebElement getCreateClientCancelButton() {
		return createClientCancelButton;
	}


	public WebElement getCreateNewProductButton() {
		return createNewProductButton;
	}


	public WebElement getSelectCustomerDropdown() {
		return selectCustomerDropdown;
	}


	public WebElement getProductNameTB() {
		return projectNameTB;
	}


	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}


	public WebElement getCreateProductCancelButton() {
		return createProductCancelButton;
	}


	public WebElement getAllClientsAndProductsLink() {
		return allClientsAndProductsLink;
	}


	public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}


	public WebElement getArchiveSelectedButton() {
		return archiveSelectedButton;
	}


	public WebElement getDeleteThisClientPopup() {
		return deleteThisClientPopup;
	}


	public void createClientMethod(String clientName) throws InterruptedException
	{
		Thread.sleep(1000);
		productsAndClientsLink.click();
		createNewClientButton.click();
		clientNameTB.sendKeys(clientName);
		createCustomerButton.click();
	}
	
	public void createProjectMethod(String customerName, String productName) throws InterruptedException
	{
		Thread.sleep(1000);
		productsAndClientsLink.click();
		createNewProductButton.click();
		
		Select sel = new Select(selectCustomerDropdown);
		sel.selectByVisibleText(customerName);
		
		projectNameTB.sendKeys(productName);
		createProjectButton.click();
		
	}
	
	public void deleteAllclientsAndProducts() throws InterruptedException
	{
		Thread.sleep(1000);
		productsAndClientsLink.click();
		allClientsAndProductsLink.click();
		deleteSelectedButton.click();
		deleteThisClientPopup.click();
		
	}
}