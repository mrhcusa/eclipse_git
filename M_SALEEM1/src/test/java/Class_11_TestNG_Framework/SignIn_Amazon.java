package Class_11_TestNG_Framework;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Common.Utility;
import PageObjectModel.Home;
import PageObjectModel.NewAccount;
import PageObjectModel.SignInPage;
import PageObjectModel.validation;

public class SignIn_Amazon extends Utility { // This file is the runner file of Home.java and SignInPage.java class of Page
								// Object Model

	@Test(priority = 2, dependsOnMethods = "verify")
	public void f() {
		Home home = new Home(driver);
		home.click_sign();

		SignInPage signinpage = new SignInPage(driver);
		// signinpage.username();
		// signinpage.con_tinue();
		signinpage.createAcc();

		NewAccount acc = new NewAccount(driver);
		acc.name_();
		acc.email_();
		acc.password_();
		acc.repass_();
		acc.cont_();
		System.out.println("Priority_2 is executing");
	}

	@Test(priority = 1)
	public void verify() throws IOException {
		Home home = new Home(driver);
		home.click_sign();
		screenshot();
		SignInPage signinpage = new SignInPage(driver);
		signinpage.createAcc();
		NewAccount acc = new NewAccount(driver);
		acc.name_();
		acc.email_();
		acc.password_();
		acc.repass_();
		screenshot();
		acc.cont_();
		screenshot();

		validation vd = new validation(driver);
		String msg_act = vd.text();
		System.out.println(msg_act);
		String msg_expected = "Email address already in use"; // We will get the expected message from requirement
																// document.
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(msg_act, msg_expected);
		System.out.println("This is after assertion. Priority_1");
		soft.assertAll();
	}
}


