package com.cruises.pages;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CruisesFirst {
WebDriver driver;
public CruisesFirst(WebDriver driver) {
	this.driver=driver;
}
By whales=By.xpath("//*[@class=\"inlineHyperlink\"]");
By nav=By.xpath("//*[@id=\"rciHeaderOpenSidenav\"]");
By plan=By.id("rciHeaderSideNavMenu-1");
By ship=By.xpath("//*[@id=\"rciHeaderSideNavSubmenu-1-1\"]");
By shp=By.id("rciHeaderMenuItem-2");
By rhap=By.xpath("//*[@class=\"gallery__thumb__glass\"]");
By deck=By.id("ad4b457b5-df70-4690-b347-ae2817f8910a");
By decknum=By.name("deck-dropdown");
By royal=By.xpath("//*[@class=\"deck-plan__stateroom__subtype__name\"]");
public void whale() throws InterruptedException {
	int flag=0;
	List<WebElement> w=driver.findElements(whales);
	for(int i=0;i<w.size();i++) {
		if(w.get(i).getText().contains("whale")) {
			flag=1;
			break;
		}
	}
	System.out.println(flag);
	Thread.sleep(2000l);
    driver.findElement(nav).click();
    Thread.sleep(2000l);
    driver.findElement(plan).click();
    driver.findElement(ship).click();
    driver.findElement(shp).click();
    List<WebElement> rh=driver.findElements(rhap);
    rh.get(21).click();
    driver.findElement(deck).click();
    Select dk=new Select(driver.findElement(decknum));
    dk.selectByVisibleText("Deck Eight");
    int aloy=0;
    List<WebElement> rl=driver.findElements(royal);
    for(int j=0;j<rl.size();j++) {
    	if(rl.get(j).getText().contains("Royal")) {
    		aloy=1;
    		break;
    	}
    }
    System.out.println(aloy);
    Assert.assertTrue(flag==1 && aloy==1);
}
}
