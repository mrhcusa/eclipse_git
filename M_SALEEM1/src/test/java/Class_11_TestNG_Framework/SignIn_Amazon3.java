package Class_11_TestNG_Framework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import PageObjectModel.Home;
import PageObjectModel.NewAccount;
import PageObjectModel.SignInPage;
import PageObjectModel.validation;
import org.testng.annotations.BeforeMethod;
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

public class SignIn_Amazon3 {  //This file is the runner file of Home.java and SignInPage.java class of Page Object Model
	public WebDriver driver;
  
  @Test(priority=2,dependsOnMethods = "verify")
  public void f() {
	  Home home=new Home(driver);
	  home.click_sign();
	  
	  SignInPage signinpage=new SignInPage(driver);
	  //signinpage.username();
	  //signinpage.con_tinue();
	  signinpage.createAcc();
	  
	  NewAccount acc=new NewAccount(driver);
	  acc.name_();
	  acc.email_();
	  acc.password_();
	  acc.repass_();
	  acc.cont_();	  
	  System.out.println("Priority_2 is executing");
	  }
  
	@Test(priority=1)
  	public void verify() throws IOException {
  	  Home home=new Home(driver);
  	  home.click_sign();
  	  screenshot();
  	  SignInPage signinpage=new SignInPage(driver);
  	  signinpage.createAcc();  	  
  	  NewAccount acc=new NewAccount(driver);
  	  acc.name_();
  	  acc.email_();
  	  acc.password_();
  	  acc.repass_();
  	  screenshot();
  	  acc.cont_();
  	  screenshot();
  	  
  	  validation vd=new validation(driver);
  	  String msg_act=vd.text();
  	  System.out.println(msg_act);
  	  String msg_expected="Email address already in use";  //We will get the expected message from requirement document.
  	  SoftAssert soft=new SoftAssert();
  	  soft.assertEquals(msg_act, msg_expected); 
  	  System.out.println("This is after assertion. Priority_1");
  	  soft.assertAll();
  	} 
  	
  @BeforeMethod
  public void beforeMethod() {
	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\M_SALEEM1\\src\\Drivers\\chromedriver.exe");
	  //driver=new ChromeDriver();
	  /*System.setProperty("webdriver.edge.driver", "C:\\Users\\Md.RafiqulHaider\\PNT_eclipse-workspace\\M_SALEEM1\\src\\Drivers\\msedgedriver.exe");		
	  	driver=new EdgeDriver();*/
	  	browsers("Chrome","https://www.amazon.com/");	 //both are non static methods. 
	  
		/*driver.manage().window().maximize(); 
	    driver.navigate().to("https://www.amazon.com/");	    
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);*/
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
	 	  
  }
  public void browsers(String browser,String url) {
	  String local = System.getProperty("user.dir");
	  System.out.println(local);
	  
	  if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", local+"\\src\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to(url);	    
		  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		  
	  }else if(browser.equalsIgnoreCase("Edge")){
		  System.setProperty("webdriver.edge.driver", local+"\\src\\Drivers\\msedgedriver.exe");		
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to(url);	    
		  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		  
	  }else {
		  System.out.println("Check your Browser drivers.");
	  }

  }
	  public void screenshot() throws IOException {
		Date dt =new Date();
		System.out.println(dt);
		String dt1=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(dt1);
		
		String local = System.getProperty("user.dir");
		File stored = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(stored, new File(local+"\\Pictures\\"+dt1+"capture.jpg"));
	  }

}






