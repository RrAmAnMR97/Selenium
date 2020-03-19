package com.bmw.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BMWSecond {
WebDriver driver;
public BMWSecond(WebDriver driver) {
	this.driver=driver;
}
By dropdown=By.xpath("//*[@class='button ds2-link expand ds2-dropdown-js-area']");
By list=By.xpath("//*[@class=\"ds2-dropdown__link ds2-link\"]");
By hp=By.xpath("//*[@class=\"ds2-cms-output\"]");
public void drp(int n,int num) {
	driver.findElement(dropdown).click();
	List<WebElement> j=driver.findElements(list);
	j.get(n).click();
	List<WebElement> h=driver.findElements(hp);
	String p=h.get(num).getText();
	int v=Integer.parseInt(p.substring(5,8));
	Assert.assertTrue(v>500,"Dosent meet my requirements");
}
}