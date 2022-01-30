package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage { // SignIn_Amazon TestNG class is the runner class of this POM class
	public WebDriver driver;
	// @FindBy(id="ap_email") WebElement user;
	// @FindBy(id="continue") WebElement cont; //We are not clicking continue button
	// anymore. We will click on "Create new account."
	@FindBy(id = "createAccountSubmit") WebElement create;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * public void username() { user.sendKeys("abc@xyz.com"); }
	 */
	/*
	 * public void con_tinue() { cont.click(); }
	 */
	public void createAcc() {
		create.click();
	}

}
