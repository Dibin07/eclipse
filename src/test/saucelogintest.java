package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.saucehomepage;
import page.sauceloginpage;

public class saucelogintest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test() throws IOException,Exception
	{
		sauceloginpage ob=new sauceloginpage(driver);
		saucehomepage oc=new saucehomepage(driver);
		FileInputStream f=new FileInputStream("C:\\Users\\sinta\\OneDrive\\Documents\\sauce.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("sheet2");
		int row =sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			String pswrd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(email);
		    ob.setvalues(email, pswrd);
		    ob.login();
		    Thread.sleep(2000);
			driver.navigate().refresh();
		}
		oc.clickcart();
		oc.setvalues("dibin","thomas","967438");
		oc.continueclick();
		
		
		
		
	}

}
