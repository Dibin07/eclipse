package firstscript;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		
	}
	@Test
	public void test() throws IOException
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Select se=new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]")));
		se.selectByValue("03");
		
		
		Select month=new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]")));
		month.selectByValue("06");
		
		Select year=new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]")));
		year.selectByValue("2002");
	}
		

}
