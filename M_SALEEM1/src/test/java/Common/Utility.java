package Common;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Utility {
	public WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void beforeMethod(String browser, String url) throws InterruptedException {
		String local = System.getProperty("user.dir");
		System.out.println(local);

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", local + "\\src\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url);
			Thread.sleep(5000);
			//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", local + "\\src\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url);
			Thread.sleep(5000);
			//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		} else {
			System.out.println("Check your Browser drivers.");
		}
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	public void screenshot() throws IOException {
		Date dt = new Date();
		System.out.println(dt);
		String dt1 = dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(dt1);

		String local = System.getProperty("user.dir");
		File stored = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(stored, new File(local + "\\Pictures\\" + dt1 + "capture.jpg"));
	}

}
