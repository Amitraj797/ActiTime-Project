package Actitime.testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import Actitime.elementryRepository.GeneralSettingsPage;
import Actitime.elementryRepository.TimeTrackPage;
import Actitime.genericLib.BaseClass;

public class ActitimeDropdownTest extends BaseClass{
	
	@Test
	public void dropDown() throws IOException{		
		/*driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		driver.findElement(By.id("popup_menu_item_6")).click();
		WebElement dropdown=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		cu.getSelectByVisibleText(dropdown, "Product Line");
		String text=driver.findElement(By.id("FormModifiedTextCell")).getText();
		System.out.println(text);*/
		
		TimeTrackPage tt=new TimeTrackPage(driver);
//		Click on Settings
		tt.clickSettings();
//		click on General Settings
		tt.clickGeneralSetting();
		GeneralSettingsPage gsp=new GeneralSettingsPage(driver);
//		handle Usergroup DropDown
		cu.getSelectByVisibleText(gsp.getUserGroupsDD(), "Location");
//		get Msg
		System.out.println(gsp.getgetModificationMsg());
	}

}

