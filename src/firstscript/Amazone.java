package firstscript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone 
{
	ChromeDriver driver;
	
	@Before
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
	}
	
	@Test
	public void search()
	{
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_newreleases']")).click();
		driver.findElement(By.xpath("//a[@href='/gp/new-releases/amazon-renewed/ref=zg_bsnr_nav_amazon-renewed_0']")).click();
		
	}

}
