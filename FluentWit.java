package testng;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		System.out.println("before Clicking Image");
		@SuppressWarnings("deprecation")
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(50,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
		WebElement element=wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"corover-disha-icon\"]"));
			}
		}
	);
element.click();
Thread.sleep(10000l);
System.out.println("After Clicking Image");
	}
}
