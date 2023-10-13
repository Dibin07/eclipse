package testngprgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	ChromeDriver driver;
	@BeforeTest
	public  void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.ebay.com");
	}
	@Test
	public void test1()
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println(linkdetails.size());
		
		
	}
	@Test
	public void test2()
	{
		boolean c=driver.findElement(By.xpath("//input[@value='Search']")).isEnabled();
		if(c==true)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("not");
		}

	}
	@Test
	public void test3()
	{
		boolean d=driver.findElement(By.xpath("//img[@alt='eBay Home']")).isDisplayed();
		if(d==true)
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
	}
	@Test
	public void test4()
	{
		String pegecode=driver.getPageSource();
		String text="Daily Deals";
		if(pegecode.contains(text))
		{
			System.out.println("contained");
		}
		else
		{
			System.out.println("not contains");
		}
	}

}
