package Actitime.elementryRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomer {
	
	public CreateNewCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css=".inputFieldWithPlaceholder.newNameField.inputNameField")
	private WebElement customerName;
	@FindBy(xpath="//div[@class='customerInfoDiv']/div[2]/div[2]/div/div/div/textarea")
	private WebElement description;
	@FindBy(css="[class='components_button withPlusIcon']")
	private WebElement createCustomerButton;

	public WebElement getCustomerName()
	{
		return customerName;
	}
	
	public WebElement getDescription()
	{
		return description;
	}
	
	public WebElement getCreateCustomerButton()
	{
		return createCustomerButton;
	}
	
	public void enterCustomerName(String customername)
	{
		getCustomerName().sendKeys(customername);
	}
	
	public void enterDescription(String description)
	{
		getDescription().sendKeys(description);
	}
	
	public void clickCreateCustomerButton()
	{
		getCreateCustomerButton().click();
	}
}
