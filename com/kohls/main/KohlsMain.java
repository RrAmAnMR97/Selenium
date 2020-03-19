package com.kohls.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.kohls.pages.KohlsFirstPage;
import com.kohls.pages.KohlsSecondPage;
import com.kohls.pages.KohlsThirdPage;


public class KohlsMain {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  KohlsFirstPage fp=new KohlsFirstPage(driver);
	  KohlsSecondPage sp=new KohlsSecondPage(driver);
	  KohlsThirdPage tp=new KohlsThirdPage(driver);
	  fp.srch();
	  Thread.sleep(3000l);
	  sp.item();
	  Thread.sleep(3000l);
	  tp.sizesel();
  }
@BeforeSuite public void beforesuite() {
	System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://kohls.com");
	driver.manage().window().maximize();
}
@AfterSuite public void aftersuite() {
	
}
}
