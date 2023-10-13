package firstscript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	ChromeDriver driver;
	
	@Before
	
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("http://www.ebay.com");
	}
	
	@Test
	
	public void test()
	{
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//a[@href='https://cart.payments.ebay.com/sc/view']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.ebay.com']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Fashion/bn_7000259856']")).click();
	}

}
