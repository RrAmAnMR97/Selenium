package page;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import tests.FirstPage;
import tests.SecondPage;

public class TestMain extends TestBase {
  @Test
  public void f() throws InterruptedException {
	  FirstPage fp=new FirstPage(driver);
	  SecondPage sp=new SecondPage(driver);
	  fp.Selectcurrency();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  Thread.sleep(2000l);
	  fp.fromto();
	  Thread.sleep(2000l);
	  fp.Dates();
	  fp.search();
	  sp.abc();
  }
}
