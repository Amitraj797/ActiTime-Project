package Actitime.testScript;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Actitime.elementryRepository.CreateNewCustomer;
import Actitime.elementryRepository.CreatedCustomerPage;
import Actitime.elementryRepository.TaskPage;
import Actitime.elementryRepository.TimeTrackPage;
import Actitime.genericLib.BaseClass;

public class CreateCustomerTest extends BaseClass {
//		@Parameters({"custname"})
		@Test
		public void customerCreate() throws EncryptedDocumentException, IOException {
		String customername=du.getDataFromExcelSheet("Sheet1", 0, 1);
		int num=cu.getRandomName();
//		String customername	=custname;
		customername=customername+num;
	/*	driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();		
		driver.findElement(By.cssSelector(".inputFieldWithPlaceholder.newNameField.inputNameField")).sendKeys(customername);
		driver.findElement(By.xpath("//div[@class='customerInfoDiv']/div[2]/div[2]/div/div/div/textarea")).sendKeys(du.getDataFromExcelSheet("Sheet1", 1, 1));
        driver.findElement(By.cssSelector("[class='components_button withPlusIcon']")).click();
    	cu.getEWaitByTextToBePresent(driver,By.cssSelector(".titleEditButtonContainer>.title"),customername);
        String expCustomerName=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
        Assert.assertEquals(customername, expCustomerName);
        System.out.println(expCustomerName);*/
	
		
		
		TimeTrackPage tt=new TimeTrackPage(driver);
		tt.clickTaskTab();
		TaskPage tp=new TaskPage(driver);
		tp.clickAddNew();
		tp.clickNewCustomer();
		CreateNewCustomer cnc=new CreateNewCustomer(driver);
		cnc.enterCustomerName(customername);
		cnc.enterDescription(du.getDataFromExcelSheet("Sheet1", 1,1));
		cnc.clickCreateCustomerButton();
		CreatedCustomerPage ccp=new CreatedCustomerPage(driver);
		cu.getEWaitByTextToBePresent(driver,ccp.getCreatednamepath(),customername);
		String expcustomername=ccp.createdCustomerName();
		Assert.assertEquals(customername, expcustomername);
        System.out.println(expcustomername);
		}
		
}
