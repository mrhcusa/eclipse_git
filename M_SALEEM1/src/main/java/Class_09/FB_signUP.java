package Class_09;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_signUP {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\Sel_Class_1_2_3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    String URL = "https://facebook.com/";
	    driver.get(URL);
	    System.out.println("The page title is: "+driver.getTitle());
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	    
	    WebElement create=driver.findElement(By.linkText("Create new account"));
	    create.click();
	    Thread.sleep(9000);
	    
		 
	    
	    WebElement fname=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	    fname.sendKeys("AAA");
	    
	    WebElement lname=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
	    lname.sendKeys("BBB");
	    
	    WebElement mobile=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
	    mobile.sendKeys("347-222-3333");

	    WebElement pw=driver.findElement(By.xpath("//input[@id='password_step_input']"));
	    pw.sendKeys("A1B2C3abc@123");
	    
	    WebElement month=driver.findElement(By.cssSelector("#month"));
	    Select select=new Select(month);
	    select.selectByVisibleText("Dec");
	    
	    WebElement day=driver.findElement(By.cssSelector("#day"));
	    Select select1=new Select(day);
	    select1.selectByVisibleText("15");
	    
	    WebElement year=driver.findElement(By.cssSelector("#year"));
	    Select select2=new Select(year);
	    select2.selectByVisibleText("1990");
	    
	    WebElement gender=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
	    gender.click();
	    
	    WebElement signup=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[10]/button[1]"));
	    signup.click();
}
}	