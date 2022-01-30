package Class_11_TestNG_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test          //5
  public void f() {System.out.println("#5 @test");
  }
  @BeforeMethod  //4
  public void beforeMethod() {System.out.println("#4 @BeforeMethod");
  }

  @AfterMethod   //6
  public void afterMethod() {System.out.println("#6 @AfterMethod");
  }

  @BeforeClass  //3
  public void beforeClass() {System.out.println("#3 @BeforeClass");
  }

  @AfterClass  //7
  public void afterClass() {System.out.println("#7 @AfterClass");
  }

  @BeforeTest  //2
  public void beforeTest() {System.out.println("#2 @BeforeTest");
  }

  @AfterTest  //8
  public void afterTest() {System.out.println("#8 @AfterTest");
  }

  @BeforeSuite //1
  public void beforeSuite() {System.out.println("#1 @BeforeSuit");
  }

  @AfterSuite  //9
  public void afterSuite() {System.out.println("#9 @AfterSuite");
  }

}
