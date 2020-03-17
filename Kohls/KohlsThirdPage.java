package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class KohlsThirdPage {
WebDriver driver;
public KohlsThirdPage(WebDriver driver) {
	this.driver=driver;
}
By size=By.xpath("//*[@id=\"size-dropdown\"]");
By btn=By.xpath("//*[@class=\"pdp-product-increase pdp-qtty pdp-qtty-boss-increase\"]");
By cart=By.name("pdp-addtobag");
By num=By.xpath("//*[@class=\"number-items boss-number-items nonzero-items\"]");
public void sizesel() throws InterruptedException {
	Select s= new Select(driver.findElement(size));
	s.selectByVisibleText("38R 31");
	driver.findElement(btn).click();
	driver.findElement(cart).click();
	Thread.sleep(2000l);
    String asrt=driver.findElement(num).getText();
    int k=Integer.parseInt(asrt);
    Assert.assertTrue(k==2);
}
}
