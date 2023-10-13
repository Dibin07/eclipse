package firstscript;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	
	@Before
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	@Test
	public void test()
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println(linkdetails.size());
		
		for(WebElement linkdetailss:linkdetails)
		{
			System.out.println(linkdetailss.getText()+"="+linkdetailss.getAttribute("href"));
		}
			
		
	}

}
