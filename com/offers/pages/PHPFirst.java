package com.offers.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PHPFirst {
WebDriver driver;
public PHPFirst(WebDriver driver) {
	this.driver=driver;
}
By currency=By.xpath("//*[@id=\"dropdownCurrency\"]");
By usd=By.xpath("//*[@class=\"dropdown-menu-inner\"]//*[@class=\"dropdown-item text-center\"]");
By move=By.xpath("//*[@class=\"col-inner d-flex flex-column\"]");
By summer=By.xpath("//*[@class=\"btn btn-primary btn-sm btn-wide\"]");
By nme=By.name("name");
By phn=By.name("phone");
By msg=By.name("message");
By se=By.xpath("//*[@class=\"btn btn-success btn-success btn-block btn-lg\"]");
By popup=By.xpath("//*[@class='alert alert-success successMsg']");
By pop=By.xpath("//*[@class=\"blog-media\"]");
public void currncy() throws InterruptedException {
    driver.findElement(currency).click();
	List<WebElement> us=driver.findElements(usd);
	int v=us.size();
	for(int i=0;i<v;i++) {
		if(us.get(i).getText().contains("USD")) {
			us.get(i).click();
			break;
		}
	}
	Thread.sleep(2000l);
}
public void summ() {
	List<WebElement> st=driver.findElements(move);
	Actions act=new Actions(driver);
	act.moveToElement(st.get(6));
	List<WebElement> su=driver.findElements(summer);

	act.moveToElement(su.get(6)).click().perform();
}
public void details(String name,Integer num,String message) {
	driver.findElement(nme).sendKeys(name);
	driver.findElement(phn).sendKeys(num.toString());
	driver.findElement(msg).sendKeys(message);
}
public void go() {
	driver.findElement(se).click();
	JavascriptExecutor hj=((JavascriptExecutor)driver);
    hj.executeScript("arguments[0].scrollIntoView();",driver.findElements(pop).get(0));
	Assert.assertTrue(driver.findElement(popup).isDisplayed());
}
}

