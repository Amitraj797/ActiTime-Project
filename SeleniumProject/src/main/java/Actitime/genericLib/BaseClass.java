package Actitime.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Actitime.elementryRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver listenerdriver;
	public DataUtility du = new DataUtility();
	public CommonUtility cu = new CommonUtility();

//	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() {
//		if (browser.equals("chrome")) {
//			ChromeOptions opt = new ChromeOptions();
//			opt.addArguments("--remote-allow-origins=*");
//			driver = new ChromeDriver(opt);
//
//		} else if (browser.equals("edge")) {
//			EdgeOptions opt = new EdgeOptions();
//			opt.addArguments("--remote-allow-origins=*");
//			driver = new EdgeDriver(opt);
// 
//		}
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		listenerdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
//    @Parameters({"url","username","password"})
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException {
		driver.get(du.getDataFromPropertiesFile("url"));
		LoginPage lp=new LoginPage(driver);
		lp.loginApp(du.getDataFromPropertiesFile("username"),du.getDataFromPropertiesFile("password"));

	}

	@AfterMethod(alwaysRun = true)
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}

}
