package Class_11_TestNG_Framework;

import org.testng.annotations.Test;
import Common.Utility;
import PageObjectModel.FBhome;
import org.testng.annotations.DataProvider;

public class Provider extends Utility  {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  FBhome fbh=new FBhome(driver);
	  fbh.email(n);
	  fbh.password(s);
	  fbh.login();
	  Thread.sleep(5000);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "apple", "abc123" },
      new Object[] { "banana", "bcd234" },
      new Object [] {"orange","cca123"},
    };
  }
}


