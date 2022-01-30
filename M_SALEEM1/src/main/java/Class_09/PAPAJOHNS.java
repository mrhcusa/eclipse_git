package Class_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PAPAJOHNS {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\Sel_Class_1_2_3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    String URL = "https://www.papajohns.com/";
	    driver.get(URL);
	    System.out.println("The page title is: "+driver.getTitle());
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	    
	    WebElement create=driver.findElement(By.xpath("//a[contains(text(),'Start Your Order')]"));
	    create.click();
	    Thread.sleep(9000);
	    //COUNTRY
	    WebElement country=driver.findElement(By.xpath("//select[@id='locations-country']"));
	    Select select=new Select(country);
	    select.selectByVisibleText("CANADA"); 
	    Thread.sleep(3000);
	    //Residence
	    WebElement a_type=driver.findElement(By.xpath("//select[@id='locations-addresstype']"));
	    Select select1=new Select(a_type);
	    select1.selectByVisibleText("Residence");
	    Thread.sleep(3000);
	    //street
	    WebElement street=driver.findElement(By.xpath("//input[@id='autocomplete']"));
	    street.sendKeys("123 ABC Street");
	    Thread.sleep(3000);
	    //House type
	    WebElement ht=driver.findElement(By.xpath("//select[@id='locations-aptstefloor']"));
	    Select select2=new Select(ht);
	    select2.selectByVisibleText("Floor");
	    //floor number
	    WebElement fl_no=driver.findElement(By.xpath("//input[@id='locations-aptstefloornumber']"));
	    fl_no.sendKeys("99");
	    //zip
	    WebElement zip=driver.findElement(By.xpath("//input[@id='locations-postalcode']"));
	    zip.sendKeys("ON M5A 1Z7");
	    //submit
	    WebElement submit=driver.findElement(By.xpath("//*[@id=\"locations-form\"]/div[9]/input"));
	    submit.click();
	    driver.quit();
	    	    
}
}	
