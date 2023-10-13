package testngprgm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multipledataentry {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test() throws IOException, Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\sinta\\OneDrive\\Documents\\demo.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("sheet1");
		int row =sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pswd);
			driver.findElement(By.xpath("//button[@name='login']")).click();
			Thread.sleep(2000);
			driver.navigate().refresh();
		
		}
	}

}
