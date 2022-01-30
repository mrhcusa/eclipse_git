package Class_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdrop {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\M_SALEEM1\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    String URL = "https://jqueryui.com/droppable/";
	    driver.get(URL);
	    System.out.println("The page title is: "+driver.getTitle());
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	    //move to iframe
	    WebElement frm=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	    driver.switchTo().frame(frm);
	    
	    WebElement e1=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
	    WebElement e2=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    
	    Actions ac=new Actions(driver);
	    ac.dragAndDrop(e1, e2).build().perform();
	    driver.switchTo().parentFrame();
	    
	    WebElement e3=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[3]/a"));
	    ac.moveToElement(e3).click().build().perform();
	    
	    
}
}	
