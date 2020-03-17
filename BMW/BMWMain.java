package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.BMWFirst;
import page.BMWSecond;

public class BMWMain extends BMWBase{
  @Test
  public void f() throws InterruptedException {
	  BMWSecond sp=new BMWSecond(driver);
	  sp.drp(0,36);
  }
  @Test
  public void test() {
	  BMWSecond sp=new BMWSecond(driver);
	  sp.drp(1,92);
  }
  @Test
  public void test1() {
	  BMWSecond sp=new BMWSecond(driver);
	  sp.drp(2,148);
  }
  @Test
  public void test2() {
	  BMWSecond sp=new BMWSecond(driver);
	  sp.drp(3,204);
  }
  @BeforeMethod public void beforemethod() throws InterruptedException {
	  BMWFirst fp=new BMWFirst(driver);
	  fp.mdls();
  }
}
