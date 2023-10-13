package testngprgm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99 {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void test()
{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Actions act=new Actions(driver);
	WebElement right= driver.findElement(By.xpath("//*[contains(text(),'right click me')]"));
	act.contextClick(right);
	act.perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	System.out.println(alerttext);
	a.accept();
	WebElement doble=driver.findElement(By.xpath("//*[contains(text(),'Double-Click Me To See Alert')]"));
	act.doubleClick(doble);
	act.perform();
	Alert b=driver.switchTo().alert();
	String alertext=b.getText();
	System.out.println(alertext);
	b.accept();
	
	
	
}
}
