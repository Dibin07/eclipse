package firstscript;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUNIT {
	ChromeDriver driver;
	@Before
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void titlevarification()
	{
		String a=driver.getTitle();
		String b="Google";
		if(a.equals(b))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void content()
	{
		String s=driver.getPageSource();
		if(s.contains("gmail"))
		{
			System.out.println("pass");
		}
			else
			{
				System.out.println("fail");
			}
		}
	
	@Test
	public void test1()
	{
		driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
	}
	@After
	public void after()
	
	{
	driver.quit();
	}

	

}
