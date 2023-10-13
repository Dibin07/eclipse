package testngprgm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {
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
	@Test(groups={"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups={"sanity","regression"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"smoke","sanity"})
	public void test3()
	{
		System.out.println("test1");
	}
	@Test(groups= {"regression"})
	public void test4()
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


