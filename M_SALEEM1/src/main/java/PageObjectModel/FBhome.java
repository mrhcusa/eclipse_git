package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBhome {
	public WebDriver driver;
	@FindBy(id="email") WebElement e_mail;
	@FindBy(id="pass") WebElement pass_word;
	@FindBy(name="login") WebElement log_in;
	
	public FBhome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void email(String emails) {
		e_mail.sendKeys(emails);}
	public void password(String pwd) {
		pass_word.sendKeys(pwd);}
	public void login() {
		log_in.click();}	
}

