package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount {
	public WebDriver driver;
	
	@FindBy(id="ap_customer_name") WebElement name;
	@FindBy(id="ap_email") WebElement email;
	@FindBy(id="ap_password") WebElement password;
	@FindBy(id="ap_password_check") WebElement repass;
	@FindBy(id="continue") WebElement cont;
	
	public NewAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void name_() {
		name.sendKeys("Any Person");
	}
	public void email_() {
		email.sendKeys("abc@xyz.com");
	}
	public void password_() {
		password.sendKeys("PUtin@UKraine1");
	}
	public void repass_() {
		repass.sendKeys("PUtin@UKraine1");
	}
	public void cont_() {
		cont.click();
	}
}
