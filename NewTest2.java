package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
	//  Thread.sleep(2000l);
	  WebElement month=driver.findElement(By.xpath("//*[@class='datepicker-days']/table/thead/tr//*[@class='datepicker-switch']"));
	  //Thread.sleep(2000l);
	  while(!month.getText().contains("May"))
	  {
		  driver.findElement(By.xpath("//*[@class='datepicker-days']/table/thead/tr//*[@class='next']")).click();
	  }
	  //Thread.sleep(2000l);
	  List <WebElement> dates=driver.findElements(By.xpath("//*[@class='day']"));
	  //Thread.sleep(2000l);
	  int count=dates.size();
	  System.out.println(count);
	  for(int i=0;i<count;i++)
	  {
		  String text=dates.get(i).getText();
		  System.out.println(text);
		  if(text.equalsIgnoreCase("22"))
		  {
		//	  Thread.sleep(2000l);
			  dates.get(i).click();
			  Thread.sleep(2000l);
			  break;
		  }
	  }
	  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.path2usa.com/travel-companions");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}