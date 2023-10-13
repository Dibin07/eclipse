package testngprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buttonenable {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void launch()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		boolean d=driver.findElement(By.xpath("//input[@value='m']")).isSelected();
		if(d==true)
		{
			System.out.println("slected");
		}
		else
		{
			System.out.println("not");
		}
		
}
	@Test
	public void test1()
	{
		boolean c=driver.findElement(By.xpath("//input[@id='Register']")).isEnabled();
		if(c==true)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("not");
		}
		
	}
	

}
