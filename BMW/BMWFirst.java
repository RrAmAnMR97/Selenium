package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BMWFirst {
WebDriver driver;
public BMWFirst(WebDriver driver) {
	this.driver=driver;
}
By model=By.xpath("//*[@id=\"the-top-navigation\"]/div/div/div/div[1]/div/div[1]/div[1]/div/div[1]/a");
By series=By.xpath("//*[@class=\"tw-relative tw-overflow-hidden tw-pl-400 tw-pr-400 tw-m-0 tw-flex tw-items-center tw-font-bmw-bold tw-text-450 tw-text-grey-500 tw-border-b-400 tw-border-transparent hover:tw-text-grey-500 lg:hover:tw-border-b-400 lg:hover:tw-border-primary-500 lg:hover:tw-text-grey-900\"]");
By ser=By.xpath("//*[@class=\"cosy-image-wrapper tw-relative\"]");
By tech=By.xpath("//*[@class=\"tw-font-bmw-bold tw-text-450 tw-no-underline tw-m-0 focus:tw-text-grey-500 tw-text-grey-500\"]");
public void mdls() throws InterruptedException {
	driver.findElement(model).click();
	List<WebElement> r=driver.findElements(series);
	r.get(2).click();
	Thread.sleep(2000l);
	WebElement f=driver.findElement(ser);
	Actions act=new Actions(driver);
	act.moveToElement(f).click().perform();
	List<WebElement> h=driver.findElements(tech);
	h.get(1).click();
}
}
