package firstscript;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		
	}
	@Test
	public void test() throws IOException
	{
		driver.get("http://facebook.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D://Screenshot.png"));
		
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login']"));
		File elementscrnshot=loginbutton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(elementscrnshot, new File("./Screenshot/loginbutton.png"));
		
		
	}

}
