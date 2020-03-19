package com.cruises.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.cruises.pages.CruisesFirst;


public class CruisesMain {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  CruisesFirst fp=new CruisesFirst(driver);
	  fp.whale();
  }
@BeforeSuite public void beforesuite() {
	System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.royalcaribbean.com/alaska-cruises");
	driver.manage().window().maximize();
}
@AfterSuite public void aftersuite() {
	
}
}
