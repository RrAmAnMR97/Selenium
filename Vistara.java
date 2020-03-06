package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Vistara {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@class=\"login-btn done_button padd_0 cntry-btn-wrap col-sm-12\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"onewaytrip\"]/a")).click();
	  Thread.sleep(3000l);
	  driver.findElement(By.name("flightSearchFrom")).sendKeys("Kochi");
	  Thread.sleep(3000l);
	  driver.findElement(By.xpath("//*[@class=\"scombobox-list originList\"]")).click();
	  Thread.sleep(3000l);
	  driver.findElement(By.name("flightSearchTo")).sendKeys("Delhi");
	  Thread.sleep(3000l);
	  driver.findElement(By.xpath("//*[@id=\"arrivesat-div\"]/div[3]/p[20]")).click();
	  driver.findElement(By.xpath("//*[@id=\"departCalendar\"]")).click();
	  Thread.sleep(3000l);
	  driver.findElements(By.xpath("//*[@class=\"month col-xs-2 col-sm-2 col-md-3\"]")).get(0).click();
	  Thread.sleep(3000l);
	  driver.findElements(By.xpath("//*[@class=\"ui-state-default\"]")).get(17).click();
	  Thread.sleep(3000l);
	  driver.findElement(By.name("passengers")).click();
	  Thread.sleep(3000l);
	  driver.findElements(By.xpath("//*[@class=\"done_btn\"]")).get(0).click();
	  Thread.sleep(3000l);
	  driver.findElement(By.xpath("//*[@id=\"search_book_flights_1\"]")).click();
	  Thread.sleep(3000l);
	  //WebElement l=driver.findElements(By.xpath("//*[@id=\"table-bound0-cell00-available-content\"]"));
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://airvistara.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
