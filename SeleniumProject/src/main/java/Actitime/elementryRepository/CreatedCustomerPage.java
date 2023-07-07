package Actitime.elementryRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatedCustomerPage {
	
	public CreatedCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(css=".titleEditButtonContainer>.title")
	private WebElement createdcustomername;
	@FindBy(css=".titleEditButtonContainer>.title")
	private WebElement creatednamepath;
	
	public WebElement getCreatedcustomername()
	{
		return createdcustomername;
	}
	
	public String createdCustomerName()
	{
		return getCreatedcustomername().getText();
		
	}
	
	public WebElement getCreatednamepath()
	{
		return creatednamepath;
	}
}
