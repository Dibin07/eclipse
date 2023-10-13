package testngprgm;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pageshifting {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
	}
	@Test
	public void test()
	{
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("dfgsfhgdj");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
		
		
	}

}
