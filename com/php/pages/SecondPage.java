package com.php.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SecondPage {
WebDriver driver;
public SecondPage(WebDriver driver) {
	this.driver=driver;
}
By Strng=By.xpath("//*[@id=\"LIST\"]/li[1]/div/div[1]/div[2]/form/div[2]/div/div/p[1]/strong");

//Assert
public void abc() {
	 String t=driver.findElement(Strng).getText();
     int k=Integer.parseInt(t.substring(4));
     Assert.assertTrue(k>100&&k<250,"Not between the required value");
}
}

