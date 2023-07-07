package Actitime.elementryRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTypeOfWork {
	
	public CreateTypeOfWork(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@id='nameLabel']/../../td[3]/input")
	private WebElement nameTB;
	@FindBy(xpath="//td[@id='ButtonPane']/input[2]")
	private WebElement cancelButton;
	
	public WebElement getNameTB()
	{
		return nameTB;
	}
	
	public WebElement getCancelButton()
	{
		return cancelButton;
	}
	
	public void enterNameTB(String name)
	{
		getNameTB().sendKeys(name);
	}
	
	public void clickCancelButton()
	{
		getCancelButton().click();
	}
}
