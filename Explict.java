package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explict {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        System.out.println("Before clicking Image");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"corover-disha-icon\"]")));
        driver.findElement(By.xpath("//*[@id=\"corover-disha-icon\"]"));
        Thread.sleep(3000l);
        System.out.println("After Clicking the image");
        driver.close();
	}

}
