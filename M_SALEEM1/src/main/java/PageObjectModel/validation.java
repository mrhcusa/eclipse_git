package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validation {
	public WebDriver driver;
	
	@FindBy(xpath=("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/div/div/h4")) WebElement error;
	
	public validation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public String text() {
		 String msg_act=error.getText();
		return msg_act;		 
		 
	}
	
	}


