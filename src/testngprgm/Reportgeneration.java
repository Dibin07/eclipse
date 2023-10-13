package testngprgm;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentTestInterruptedException;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportgeneration {
	ChromeDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void beforetest()
	{
		reporter=new ExtentHtmlReporter("./Report/Myreport1.html");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Hostname", "localHost");
		extent.setSystemInfo("os", "windows 10");
		extent.setSystemInfo("Testername", "Dibin");
		extent.setSystemInfo("BrowserName", "chrome");
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void setup()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	public void titlevarification()
	{
		test=extent.createTest("titlevarification");
		String exp="Facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(exp, actual);
	}
	@AfterTest
	public void teardown() 
	{
	extent.flush();
	}
	@AfterMethod
	public void browserclose(ITestResult result)throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"test case failed is"+result.getName());
			test.log(Status.FAIL,"test casefailed is"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,"test case skippes is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,"yest case passed is "+result.getName());
		}
	}
	
	

}
