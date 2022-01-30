package Class_10;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KB_actionClass {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\Sel_Class_1_2_3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    String URL = "https://demoqa.com/text-box";
	    driver.get(URL);
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	    //These two line codes are for cerfiricate error.
	    driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
	    Thread.sleep(5000);
	    // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        
        //Create object of the Actions class
        Actions actions=new Actions(driver);
        
        //select all=crtl+a
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        //copy=crtl+c
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB).build().perform();
       
        //go to the parmanent address
        WebElement pa=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        actions.moveToElement(pa).click().build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        
	   
	    
	    
}
}	
