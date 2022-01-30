package Class_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_imp_exp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\M_SALEEM1\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    String URL = "https://www.amazon.com/";
	    driver.get(URL);
	    System.out.println("The page title is: "+driver.getTitle());
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	    //Implicit wait: Waits specified time before throwing a exception for a problem.
	    //Problem can be any stage of the script(begin,middle,end)
	    //1 line implicit wait code works for all problem in the code
	    //Place Implicit wait in the beginning.
	    
	    //Following is explicit wait
	    //Code will wait until certain condition becomes true.
	    //We have to import webdriver wait class.
	    //We have to write codes for explicit wait for each element separately. We can reuse the object of the wait calss.
	    WebElement element =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    WebDriverWait wt = new WebDriverWait(driver, 10);
	    wt.until(ExpectedConditions.elementToBeClickable(element));
	    element.sendKeys("yoyo");
	    element.submit();
	    
	    wt.until(ExpectedConditions.elementToBeSelected(element));
	    
	}   //intentionally change the xpath and fail the test and watch the effect of wait.
}
























