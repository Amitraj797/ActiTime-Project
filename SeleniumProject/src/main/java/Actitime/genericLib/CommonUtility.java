package Actitime.genericLib;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {
	public int getRandomName(){
		Random r=new Random();
		int num=r.nextInt();
		return num;
	}
public String getMsgFromAlert(WebDriver driver) {
	Alert alt=driver.switchTo().alert();
	String msg=alt.getText();
	return msg;
}

public void getCloseAlert(WebDriver driver) {
	Alert alt=driver.switchTo().alert();
	alt.dismiss();
	
}
public void getIWaitByTextToBePresent(WebDriver driver,int seconds) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
}

public void getEWaitByTextToBePresent(WebDriver driver,WebElement path, String text) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElement(path, text));
}

public void getmoveToElement(WebDriver driver,WebElement path) {
	Actions act=new Actions(driver);
	act.moveToElement(path).perform();
}

public void getdoubleclick(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();
}

public void getSelectByVisibleText(WebElement dropdown,String text) {
	Select s=new Select(dropdown);
	s.selectByVisibleText(text);
	
}

public List<WebElement> getOptions(WebElement dropdown) {
	Select s=new Select(dropdown);
	List<WebElement> alloptions=s.getOptions();
	return alloptions;
}
public void getDragandDrop(WebDriver driver, WebElement element1, WebElement element2) {
	Actions act=new Actions(driver);
	act.dragAndDrop(element1, element2).perform();
	
}

public void getEWaitByVisibilityOfElementLocated(WebDriver driver,By path) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(path));
}

public void getEWaitByTitleContains(WebDriver driver,String title) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains(title));
}

public void getScrollByAmount(WebDriver driver,int x,int y) {
	Actions act=new Actions(driver);
	act.scrollByAmount(x,y).perform();
}

public String getCssValue(WebDriver driver,By element,String name) {
	WebElement text=driver.findElement(element);
	String value=text.getCssValue(name);
	return value;
}

}
