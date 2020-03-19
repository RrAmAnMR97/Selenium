package com.kohls.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KohlsSecondPage {
WebDriver driver;
public KohlsSecondPage(WebDriver driver) {
	this.driver=driver;
}
By sort=By.xpath("//*[@class=\"sbSelector\"]");
By sel=By.xpath("//*[@rel=\"Price High-Low\"]");
By firstitem=By.xpath("//*[@class=\"pmp-hero-img\"]");
public void item() throws InterruptedException {
	driver.findElements(sort).get(0).click();
	Thread.sleep(2000l);
	driver.findElement(sel).click();
	Thread.sleep(2000l);
	driver.findElements(firstitem).get(0).click();
}
}
