package testngprgm;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class saucedemo {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String exp="https://www.saucedemo.com/inventory.html";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(exp, actual);
		
		
		
		
	}

}
