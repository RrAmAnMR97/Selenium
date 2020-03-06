package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Bookmeishow {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElements(By.xpath("//*[@class=\"slick-next slick-arrow\"]")).get(1).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.bookmymshow.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
