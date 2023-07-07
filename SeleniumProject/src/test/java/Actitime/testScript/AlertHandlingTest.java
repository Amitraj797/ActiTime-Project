package Actitime.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Actitime.elementryRepository.CreateTypeOfWork;
import Actitime.elementryRepository.TimeTrackPage;
import Actitime.elementryRepository.TypeOfWork;
import Actitime.genericLib.BaseClass;

public class AlertHandlingTest extends BaseClass{
		@Test
		public void handleAlert() throws EncryptedDocumentException, IOException {
	/*	driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings ")).click();
		driver.findElement(By.linkText("Types of Work")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.xpath("//span[@id='nameLabel']/../../td[3]/input")).sendKeys(du.getDataFromExcelSheet("Sheet2", 0, 1));
		driver.findElement(By.xpath("//td[@id='ButtonPane']/input[2]")).click();
		String text=cu.getMsgFromAlert(driver);
		System.out.println(text);
		cu.getCloseAlert(driver); */
		
			TimeTrackPage tp=new TimeTrackPage(driver);
			tp.clickSettings();
			tp.clickTypeOfWork();
			TypeOfWork tw=new TypeOfWork(driver);
			tw.clickCreateTypeOfWork();
			CreateTypeOfWork ctw=new CreateTypeOfWork(driver);
			ctw.enterNameTB(du.getDataFromExcelSheet("Sheet2", 0, 1));
			ctw.clickCancelButton();
			String text=cu.getMsgFromAlert(driver);
			System.out.println(text);
			cu.getCloseAlert(driver);
	}


}
	
