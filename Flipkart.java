package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Flipkart {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException{
	  Thread.sleep(3000l);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("rahul.rajeev62@gmail.com");
	  driver.findElement(By.xpath("//*[@class=\"_2zrpKA _3v41xv _1dBPDZ\"]")).sendKeys("ftv@9867");
	  driver.findElement(By.xpath("//*[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();
	  Thread.sleep(3000l);
	  driver.findElement(By.name("q")).sendKeys("Samsung");
	  Thread.sleep(3000l);
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebElement t=driver.findElements(By.xpath("//*[@class=\"_1p7h2j\"]")).get(1);
	  t.click();
	  Thread.sleep(3000l);
	  WebElement u=driver.findElements(By.xpath("//*[@class=\"_3wU53n\"]")).get(0);
	  u.click();
	  ArrayList<String> abc=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(abc.get(1));
	  Thread.sleep(3000l);
	  driver.findElement(By.xpath("//*[@class=\"_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c\"]")).click();
	  WebElement w=driver.findElements(By.xpath("//*[@class=\"_3Jk8fm\"]")).get(1);
	  w.click();
	  driver.findElement(By.xpath("//*[@class=\"_2AkmmA _I6-pD _7UHT_c\"]")).click();
	  driver.findElement(By.xpath("//*[@class=\"_2AkmmA _2Q4i61 _7UHT_c\"]")).click();
	  WebElement g=driver.findElements(By.xpath("//*[@class=\"_6ATDKp\"]")).get(1);
	  g.click();
	  driver.findElement(By.xpath("//*[@class=\"_16qL6K _366U7Q\"]")).sendKeys("456789055678");
	  Select y=new Select(driver.findElement(By.xpath("//*[@class=\"_1TQIV6 _1E21Zg _8rlsVy\"]")));
	  y.selectByVisibleText("02");
	  Select p=new Select(driver.findElement(By.xpath("//*[@class=\"_1TQIV6 _1E21Zg\"]")));
	  p.selectByVisibleText("23");
	  driver.findElement(By.xpath("//*[@class=\"_16qL6K _366U7Q\"]")).sendKeys("456");
	  driver.findElement(By.xpath("//*[@class=\"_2AkmmA wbv91z _7UHT_c\"]")).click();
	 }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com");
  }
  

  @AfterTest
  public void afterTest() throws IOException {
	  TakesScreenshot sa=((TakesScreenshot)driver);
	  File ku=sa.getScreenshotAs(OutputType.FILE);
	  File fg=new File("C:\\Users\\837362\\Documents\\src\\Screenshot"+ System.currentTimeMillis()+ ".png");
	  FileUtils.copyFile(ku,fg);
  }

}
 