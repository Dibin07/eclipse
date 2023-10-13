package firstscript;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	ChromeDriver driver;
	@Before
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
	}
	@Test
	
	public void login()
	{
		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("dibin2k02@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("9633552171");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@After
	public void close()
	{
		driver.close();
	}
}
