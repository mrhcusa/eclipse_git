package Class_11_TestNG_Framework;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Utility;

public class Listeners extends Utility implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Our test started.");		
	}

	public void onTestSuccess(ITestResult result) {
		this.driver=((Utility)result.getInstance()).driver;
		Date dt = new Date();
		System.out.println(dt);
		String dt1 = dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(dt1);

		String local = System.getProperty("user.dir");
		File stored = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(stored, new File(local + "\\Pictures\\Pass\\" + dt1 + "capture.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public void onTestFailure(ITestResult result) {
		this.driver=((Utility)result.getInstance()).driver;
		Date dt = new Date();
		System.out.println(dt);
		String dt1 = dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(dt1);

		String local = System.getProperty("user.dir");
		File stored = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(stored, new File(local + "\\Pictures\\Fail\\" + dt1 + "capture.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
