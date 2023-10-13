package testngprgm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	@BeforeTest
	public void setup()
	{
		System.out.println("open browser");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("oprn url");
	}
	@Test(priority=2,enabled=false)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=1,invocationCount=3)
	public void test2()
	{
		System.out.println("test2");
	}
	@AfterMethod
	public void methodclose()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void testclose()
	{
		System.out.println("after test");
	}

}
