package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Executing Test 3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This block executes before each Test");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("This block executes after each Test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This block executes before all Test cases");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This block executes after all Test cases");
  }

}
