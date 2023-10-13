package testngprgm;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwindowhandler {
	ChromeDriver driver;
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		for(String handle:allwindows)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
			
				
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();	
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")));
				
				
				driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
				driver.close();
			}
			driver.switchTo().window(parentwindow);
			
		}
		
	}
	

}
