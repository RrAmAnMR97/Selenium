package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class mekMytrip {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException  {
	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Chenn");
	  Thread.sleep(6000l);
	  driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("Vijayw");
	  Thread.sleep(6000l);;
	  driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[4]/div/p[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
	  
	  
	  List <WebElement> aty = driver.findElements(By.xpath("//*[@class=\"mltfr-btn fli_primary_btn text-uppercase \"]"));

	  if(aty.size()!=0)
	  {
		 
	  Iterator<WebElement> it=aty.iterator();
	  WebElement yut=it.next();
	  Actions act = new Actions(driver);
	  Action seria = act
				 .moveToElement(yut)
				 .click()
				 .build();
		 seria.perform(); 
	  List <WebElement> yio=driver.findElements(By.xpath("//*[@class=\"faresRightSection\"]//*[@class=\"btn fli_primary_btn text-uppercase\"]"));
	  yio.get(0).click();
	  }
	  
	  else
	  {
		
		  List <WebElement> yio=driver.findElements(By.xpath("//*[@class='pull-left make_relative']//*[@class=\" fli_primary_btn text-uppercase \"]"));
		  Iterator<WebElement> it=yio.iterator();
		  WebElement yut=it.next();
		  Actions act = new Actions(driver);
		  Action seria = act
					 .moveToElement(yut)
					 .click()
					 .build();
			 seria.perform(); 

	  }
	  ArrayList<String> abc=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(abc.get(1));
	  
	  
	  Thread.sleep(3000l);
	  
		WebElement hgf= driver.findElement(By.xpath("//*[@class='block radio']//input[@value='no']"));
		Thread.sleep(3000l);
		hgf.click();
		Thread.sleep(6000l);
		driver.findElement(By.xpath("//*[@id=\"review-continue\"]")).click();
		Thread.sleep(3000l);
		WebElement axc=driver.findElement(By.xpath("//*[@id=\"wrapper_ADULT\"]/a"));
		Actions a=new Actions(driver);
		Thread.sleep(3000l);
		Action sd=a
				.moveToElement(axc)
				.click()
				.build();
		sd.perform();
		Thread.sleep(4000l);
		driver.findElement(By.xpath("//*[@class=\"tvlrFormField make_relative FIRST_NAME\"]//*[@type=\"text\"]")).sendKeys("Adam");
        driver.findElement(By.xpath("//*[@class=\"tvlrFormField make_relative LAST_NAME\"]//*[@type=\"text\"]")).sendKeys("G L");
        driver.findElement(By.xpath("//*[@class=\"chooseGender-info GENDER \"]//label[1]")).click();
        Thread.sleep(2000l);
        driver.findElement(By.xpath("//*[@class=\"tvlrFormField make_relative MOBILE_NUMBER\"]//input[@type='text']")).sendKeys("9074645556");
        driver.findElement(By.xpath("//*[@class=\"tvlrFormField make_relative EMAIL\"]//input[@type='text']")).sendKeys("guhan.23@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/form/div[7]/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"ancillary-secondary\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"CC\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"PAYMENT_cardNumber\"]")).sendKeys("6789543465756456");
        driver.findElement(By.xpath("//*[@id=\"PAYMENT_nameOnCard\"]")).sendKeys("Adam G L");
        driver.findElement(By.xpath("//*[@id=\"PAYMENT_expiryMonth\"]")).click();
        Select s=new Select(driver.findElement(By.xpath("//*[@id=\"PAYMENT_expiryMonth\"]")));
        s.selectByVisibleText("03");
        Select r=new Select(driver.findElement(By.xpath("//*[@id=\"PAYMENT_expiryYear\"]")));
        r.selectByVisibleText("2023");
        driver.findElement(By.xpath("//*[@id=\"PAYMENT_cvv\"]")).sendKeys("456");
        Select t=new Select(driver.findElement(By.xpath("//*[@id=\"PAYMENT_billingCountry\"]")));
        t.selectByVisibleText("India");
        driver.findElement(By.xpath("//*[@id=\"PAYMENT_billingAddress\"]")).sendKeys("Name,Door No,Building Name,Street,District,State,Pin");
        driver.findElement(By.xpath("//*[@id=\"PAYMENT_billingCity\"]")).sendKeys("Delhi");
        driver.findElement(By.xpath("//*[@id=\"PAYMENT_billingPin\"]")).sendKeys("110016");
        driver.findElement(By.xpath("//*[@id=\"PAYMENT_billingState\"]")).sendKeys("New Delhi");
       driver.findElement(By.xpath("//*[@id=\"widgetPayBtn\"]/span")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.makemytrip.com");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  TakesScreenshot gu=((TakesScreenshot)driver);
	  File ji=gu.getScreenshotAs(OutputType.FILE);
	  File ku=new File("C:\\Users\\837362\\Documents\\src\\Screenshot"+ System.currentTimeMillis()+ ".png");
	  FileUtils.copyFile(ji,ku);
	  
  }

}
