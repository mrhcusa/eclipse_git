package Class_10;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewBrowserWindow {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\M_SALEEM1\\src\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.navigate().to("https://www.amazon.com");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	      
	      String main_title=driver.getTitle();
	      System.out.println(main_title);

	      //Saving the Kindle book link in an element
	      WebElement kb=driver.findElement(By.xpath("//a[contains(text(),'Kindle Books')]"));	      
	      //using action class to do shift+click on link to open in a new window.
	      Actions ac=new Actions(driver);
	      ac.keyDown(Keys.SHIFT).moveToElement(kb).click().keyUp(Keys.SHIFT).build().perform();
	      
	     /* String new_title=driver.getTitle(); //This code is not printing the new window titles.
	      System.out.println(new_title);*/
	      
	      String pw=driver.getWindowHandle();
	      System.out.println(pw);
	      
	      Set<String> aw =driver.getWindowHandles();
	      System.out.println(aw);
	      
	      Iterator<String> iterator= aw.iterator();
	      
	      while(iterator.hasNext()){
	    	  String cw=iterator.next();
	    	  if(!pw.equalsIgnoreCase(cw)) {
	    		  driver.switchTo().window(cw);	    		  
	    	  }
	      }
	      System.out.println(driver.getTitle());
	      
	      driver.quit();
	}

}
