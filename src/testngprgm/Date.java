package testngprgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Date {
	ChromeDriver driver;
	@BeforeTest
	public void  setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div")).click();
		while(true)
		{
			String month =driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
			System.out.println(month);
			
			
			if(month.equalsIgnoreCase("December 2023"))
			{
			System.out.println("month slected");
			break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button[2]/span/span/svg")).click();
			}
			
		}
		List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button[2]/span/span/svg"));
		for(WebElement dateelemnt:alldates)
		{
			String date=dateelemnt.getText();
			if(date.equals("20"))
			{
				dateelemnt.click();
				break;
				
			}
			
			
		}
		
	}

}
