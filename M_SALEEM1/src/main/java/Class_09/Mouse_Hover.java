package Class_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\M_SALEEM1\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    String URL = "https://www.amazon.com/";
	    driver.get(URL);
	    System.out.println("The page title is: "+driver.getTitle());
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	    
	    WebElement e1=driver.findElement(By.xpath("//*[text()=\"Account & Lists\"]"));
	    WebElement e2=driver.findElement(By.xpath("//*[text()=\"AmazonSmile Charity Lists\"]"));
	    
	    Actions ac=new Actions(driver);
	    ac.moveToElement(e1).build().perform();
	    Thread.sleep(3000);
	    
	    //move the mouse to "Amazon Charity List" and click on it. 
	    ac.moveToElement(e2).click().build().perform();
	    
}
}	

