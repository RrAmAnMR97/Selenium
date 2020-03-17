package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BMWBase {
WebDriver driver;
@BeforeSuite public void beforesuite() {
	System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.bmw.in/en/");
	driver.manage().window().maximize();
}
@AfterSuite public void aftersuite() {
	
}
}
