package Actitime.elementryRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypeOfWork {
	
	public TypeOfWork(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Create Type of Work']")
	private WebElement createTypeOfWork;
	
	public WebElement getCreateTypeOfWork()
	{
		return createTypeOfWork;
	}
	
	public void clickCreateTypeOfWork() {
		getCreateTypeOfWork().click();
	}
}
