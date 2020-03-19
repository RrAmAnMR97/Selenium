package com.offers.main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.offers.pages.PHPFirst;
import com.offers.resources.ReadExcelPHP;



public class OffersMain {
	WebDriver driver;
  @Test(dataProvider="dp")
  public void f(String name,Integer num,String message) throws InterruptedException {
	  PHPFirst fp=new PHPFirst(driver);
	  fp.currncy();
	  Thread.sleep(2000l);
	  fp.summ();
	  fp.details(name,num,message);
	  fp.go();
  }
  @BeforeSuite public void beforesuite() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://phptravels.net/offers");
		driver.manage().window().maximize();
	}
	@AfterSuite public void aftersuite() throws IOException{
		 TakesScreenshot sa=((TakesScreenshot)driver);
		  File ku=sa.getScreenshotAs(OutputType.FILE);
		  File fg=new File("C:\\Users\\837362\\Documents\\src\\Screenshot"+ System.currentTimeMillis()+ ".png");
		  FileUtils.copyFile(ku,fg);
	}
 @DataProvider
  public Object[][] dp() throws IOException {
	 ReadExcelPHP asd=new ReadExcelPHP("C:\\Users\\837362\\Desktop\\PHPData.xlsx");
	  int row=asd.df(0);
	  Object[][] ku=new Object[row][3];
	  for(int i=0;i<row;i++) {
		  for(int j=0;j<3;j++) {
			  ku[i][j]=asd.av(0,i,j);
			  
		  }
    }
	  return ku;
  }
}

