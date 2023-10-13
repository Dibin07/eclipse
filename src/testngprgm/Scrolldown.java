package testngprgm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.justdial.com/");
	}
	@Test
	public void test() throws InterruptedException 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/section/footer/div[1]/div[7]/div/div[2]/ul/li[3]/a")));
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/footer/div[1]/div[7]/div/div[2]/ul/li[3]/a")).click();
	}

}
