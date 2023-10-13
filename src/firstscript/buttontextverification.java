package firstscript;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttontextverification {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		
	}
	@Test
	public void test() throws IOException
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement button=driver.findElement(By.xpath("//input[@type='button']"));
		
		if(button.getAttribute("value").equals("Check availability"))
		{
			System.out.println("Verified");
			
		}
		else
		{
			System.out.println("fail");
		}
	}

}
