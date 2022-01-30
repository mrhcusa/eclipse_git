package COMPANY.M_SALEEM1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowserworking {

	static WebDriver driver;  //we are using static becasue we candirectly call it without any object.
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\M_SALEEM1\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String url="https://www.ebay.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		
		String id=driver.getWindowHandle();
		System.out.println(id);
		
		String a=driver.getCurrentUrl();
		System.out.println(a);
		
		driver.quit();
		
	}

}
