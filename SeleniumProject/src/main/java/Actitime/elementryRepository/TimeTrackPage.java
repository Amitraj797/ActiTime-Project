package Actitime.elementryRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage {
	
	public TimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="popup_menu_button_settings")
	private WebElement settings;
	@FindBy(xpath="//div[text()='Manage system settings & configure actiTIME']/..")
	private WebElement generalSettings;
	@FindBy(linkText="Types of Work")
	private WebElement typeOfWork;
	@FindBy(id="container_tasks")
	private WebElement taskTab;
	
	public WebElement getSettings() {
		return settings;
	}
	
	public WebElement getGeneralSettings() {
		return generalSettings;
	}
	
	public WebElement getTypeOfWork()
	{
		return typeOfWork;
	}
	
	public WebElement gettaskTab()
	{
		return taskTab;
	}
	
	public void clickSettings()
	{
		getSettings().click();
	}

	public void clickGeneralSetting() {
		getGeneralSettings().click();
	}
	
	public void clickTypeOfWork()
	{
		getTypeOfWork().click();
	}
	
	public void clickTaskTab()
	{
		gettaskTab().click();
	}
}
