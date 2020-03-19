package com.php.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.php.pages.FirstPage;
import com.php.pages.SecondPage;


public class TestMain {
	WebDriver driver;
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
@BeforeSuite public void beforeSuite(){
	System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://phptravels.net");
	driver.manage().window().maximize();
}
@AfterSuite public void aftersuite(){
	
}
}
