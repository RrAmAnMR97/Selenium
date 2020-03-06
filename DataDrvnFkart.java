package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataDrvnFkart {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String mail, String passwrd,String brand,String variant,Integer model,String crdt,String month,String year,String cvv) throws InterruptedException {
	  Thread.sleep(3000l);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys(mail);
	  driver.findElement(By.xpath("//*[@class=\"_2zrpKA _3v41xv _1dBPDZ\"]")).sendKeys(passwrd);
	  driver.findElement(By.xpath("//*[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();
	  Thread.sleep(5000l);
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.name("q")).sendKeys(brand);
	  Thread.sleep(3000l);
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  List<WebElement> t=driver.findElements(By.xpath("//*[@class=\"_1GEhLw\"]"));
	  for(int i=0;i<t.size();i++)
	  {
		  System.out.println("..............."+t.get(i).getText());
		  if(t.get(i).getText().equalsIgnoreCase(variant))
		  {
			  driver.findElements(By.xpath("//*[@class=\"_1p7h2j\"]")).get(i-1).click();
		  }
	  }
	  Thread.sleep(3000l);
	  WebElement u=driver.findElements(By.xpath("//*[@class=\"_3wU53n\"]")).get(model);
	  u.click();
	  ArrayList<String> abc=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(abc.get(1));
	  Thread.sleep(3000l);
	  driver.findElement(By.xpath("//*[@class=\"_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c\"]")).click();
	  WebElement w=driver.findElements(By.xpath("//*[@class=\"_3Jk8fm\"]")).get(1);
	  w.click();
	  driver.findElement(By.xpath("//*[@class=\"_2AkmmA _I6-pD _7UHT_c\"]")).click();
	  driver.findElement(By.xpath("//*[@class=\"_2AkmmA _2Q4i61 _7UHT_c\"]")).click();
	  Thread.sleep(3000l);
	//  WebElement g=driver.findElements(By.xpath("//*[@class=\"_6ATDKp\"]")).get(1);
	 // g.click();
	  Thread.sleep(3000l);
	  driver.findElement(By.xpath("//*[@class=\"_16qL6K _366U7Q\"]")).sendKeys(crdt);
	  System.out.println("............."+month);
	  System.out.println("............."+year);
	  Select y=new Select(driver.findElement(By.xpath("//*[@class=\"_1TQIV6 _1E21Zg _8rlsVy\"]")));
	  y.selectByVisibleText(month);
	  Select p=new Select(driver.findElement(By.xpath("//*[@class=\"_1TQIV6 _1E21Zg\"]")));
	  p.selectByVisibleText(year);
	  driver.findElement(By.xpath("//*[@class=\"_16qL6K _366U7Q\"]")).sendKeys(cvv);
	  driver.findElement(By.xpath("//*[@class=\"_2AkmmA wbv91z _7UHT_c\"]")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com");
  }

  @AfterMethod
  public void afterMethod() throws IOException, InterruptedException {
	  TakesScreenshot sa=((TakesScreenshot)driver);
	  File ku=sa.getScreenshotAs(OutputType.FILE);
	  File fg=new File("C:\\Users\\837362\\Documents\\src\\Screenshot"+ System.currentTimeMillis()+ ".png");
	  FileUtils.copyFile(ku,fg);
	  Thread.sleep(3000l);
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
	  ExclRead asd=new ExclRead("C:\\Users\\837362\\Desktop\\FKart.xlsx");
	  int row=asd.aloy(0);
	  Object[][] ku=new Object[row][9];
	  for(int i=0;i<row;i++) {
		  for(int j=0;j<9;j++) {
			  ku[i][j]=asd.guhan(0,i,j);
			  
		  }
    }
	  return ku;
  }
}
