package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {    //SignIn_Amazon TestNG class is the runner class of this POM class
	public WebDriver driver;  //Global variable
	//Step#1. Getting the locators of the required elements.
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement signin;
	
	//Step#2. We are declaring a user defined constructor// We can use same format for a all the classes. Only we have to change the name of the constructor as per class name.
	public Home(WebDriver driver) {    //Local variable
		this.driver=driver;          //This k/w is connecting local and global variable when both have same name.
		PageFactory.initElements(driver, this);  //Page factory is initializing all the elements with driver.
	}
	//Step#3. Now we have to click on the signin button. We will make a method and inside it we will click. When we will call this method, it will perform the click.
	public void click_sign() {
		signin.click();
	}
	
	
}



  
