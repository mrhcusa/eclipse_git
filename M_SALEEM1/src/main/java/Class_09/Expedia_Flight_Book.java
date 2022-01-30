package Class_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Expedia_Flight_Book {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver","C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\Sel_Class_1_2_3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    String URL = "https://www.expedia.com/";
	    driver.get(URL);
	    System.out.println("The page title is: "+driver.getTitle());
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	    
	    WebElement create=driver.findElement(By.xpath("//span[text()=\"Flights\"]"));
	    create.click();
	    Thread.sleep(5000);
	    
	    WebElement from=driver.findElement(By.xpath("//button[@data-name=\"d1\"]"));
	    from.click();
	    Thread.sleep(5000); 
	    
	    WebElement d_date=driver.findElement(By.xpath("//button[@aria-label=\"Feb 15, 2022\"]"));
	    d_date.click();
	    Thread.sleep(5000); 
	    
	    WebElement d_cfm=driver.findElement(By.xpath("//button[@data-stid=\"apply-date-picker\"]"));
	    d_cfm.click();
	    Thread.sleep(5000); 

	}

}
