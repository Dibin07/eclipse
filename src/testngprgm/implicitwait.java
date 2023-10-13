package testngprgm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class implicitwait {
	
		ChromeDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			
		}
		@Test
		public void test()
		
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			driver.get("https://www.ebay.com");
			Actions act=new Actions(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement elctronic=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
			act.moveToElement(elctronic).perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		}

	}



