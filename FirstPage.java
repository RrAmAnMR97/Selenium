package tests;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
WebDriver driver;
public FirstPage(WebDriver driver) {
	this.driver=driver;
}
By select=By.xpath("//*[@id=\"dropdownCurrency\"]");
By currency=By.xpath("//*[@class=\"dropdown-item text-center\"]");
By flightselect=By.xpath("//*[@class=\"text-center flights \"]");
By From=By.xpath("//*[@id=\"s2id_location_from\"]");
By fromToLoca=By.xpath("//*[@id=\"select2-drop\"]//div//input");
By FromTosel=By.xpath("//*[@class=\"select2-results-dept-0 select2-result select2-result-selectable\"]");
By To=By.xpath("//*[@id=\"s2id_location_to\"]");
By Calendr=By.name("departure_date");
By selDate=By.xpath("//*[@class='datepicker--cell datepicker--cell-day' or @class='datepicker--cell datepicker--cell-day -weekend-']");
By Search=By.xpath("//*[@class=\"btn-primary btn btn-block\"]");

public void Selectcurrency() {
	driver.findElements(select).get(0).click();
	driver.findElements(currency).get(3).click();
	
}
public void fromto() {
	driver.findElement(flightselect).click();
	driver.findElement(From).click();
	driver.findElement(fromToLoca).sendKeys("Los Angeles");
	driver.findElements(FromTosel).get(1).click();
	driver.findElement(To).click();
	driver.findElement(fromToLoca).sendKeys("Dallas");
    driver.findElements(FromTosel).get(2).click();
    
}
public void Dates() {
	 driver.findElement(Calendr).click();
	    Calendar calendar=Calendar.getInstance(TimeZone.getDefault());
	    Integer a=calendar.get(Calendar.DATE)+5;
	    System.out.println(a);
	    List<WebElement> q=driver.findElements(selDate);
	    for(int i=0;i<q.size();i++) {
	    	System.out.println(".................."+q.get(i).getText());
	  	  if(q.get(i).getText().equalsIgnoreCase(a.toString())) {
	  		  System.out.println("Mowna nen mess");
	  		  q.get(i).click();
	  		  break;
	  	  }
	    }
}
public void search(){
	 List<WebElement> r=driver.findElements(Search);
     r.get(0).click();
}
}


