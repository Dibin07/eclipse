package firstscript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redifflogo {
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void test() {
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	Boolean logo= driver.findElement(By.xpath("//img[@src='/register/pix/redifflogo1.gif']")).isDisplayed();
	if(logo)
	{
		System.out.println("logo displayed");
	}
	else
	{
		System.out.println("not displayed");
	}
}
}
