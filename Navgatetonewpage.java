package testng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navgatetonewpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.redbus.com");
		String DomainName=js.executeScript("return document.domain;").toString();
		System.out.println("Domain name of the site= " +DomainName);
		String url=js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site="+url);
		String TitleName=js.executeScript("return document.title;").toString();
		System.out.println("Title of the page="+TitleName);
		js.executeScript("window.location='https://www.facebook.com/'");
	}

}
