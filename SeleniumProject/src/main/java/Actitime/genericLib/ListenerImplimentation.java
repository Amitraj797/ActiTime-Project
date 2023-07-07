package Actitime.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplimentation implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result)
	{
//		to get the failed test case Name
		String tcName=result.getName();
//		take Screenshot
		TakesScreenshot ts=(TakesScreenshot)BaseClass.listenerdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/"+tcName+".png");
		try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
