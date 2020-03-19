package com.bmw.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.bmw.pages.BMWFirst;
import com.bmw.pages.BMWSecond;


public class TestMain{
	WebDriver driver;
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
@BeforeSuite public void beforesuite() {
	System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.bmw.in/en/");
	driver.manage().window().maximize();
}
@AfterSuite public void aftersuite() {
	
}
}
