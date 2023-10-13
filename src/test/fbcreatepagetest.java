package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.fbcreatepage;

public class fbcreatepagetest {
	WebDriver driver;

	

	@BeforeTest
	public void stup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
	}
	
	@Test
	public void test()
	{
		fbcreatepage ob=new fbcreatepage(driver);
		ob.getStartedclick();
	}

}
