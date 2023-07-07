package Actitime.elementryRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(css=".title.ellipsis")
	private WebElement addNew;
	@FindBy(className="createNewCustomer")
	private WebElement newCustomer;
	
	public WebElement getAddNew()
	{
		return addNew;
	}
	
	public WebElement getNewCustomer()
	{
		return newCustomer;
	}
	
	public void clickAddNew()
	{
		getAddNew().click();
	}
	public void clickNewCustomer()
	{
		getNewCustomer().click();
	}
}
