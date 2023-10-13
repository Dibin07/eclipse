package firstscript;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgm {
	ChromeDriver driver;
	
	@Before
	public void open()
	
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/java/prgm.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@value='display alert box']")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		
		driver.findElement(By.xpath("//input[@name='Firstname']")).sendKeys("dibin");
		driver.findElement(By.xpath("//input[@name='Lastname']")).sendKeys("Thomas");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@After
	public void close()
	{
		driver.quit();
	}

}
