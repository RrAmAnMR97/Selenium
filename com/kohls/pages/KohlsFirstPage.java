package com.kohls.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KohlsFirstPage {
WebDriver driver;
public KohlsFirstPage(WebDriver driver) {
	this.driver=driver;
}
By sarch=By.name("search");
public void srch() {
	driver.findElement(sarch).sendKeys("tuxedo");
	driver.findElement(sarch).sendKeys(Keys.RETURN);
}
}