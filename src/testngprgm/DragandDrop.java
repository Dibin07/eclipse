package testngprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement fromelement =driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
		WebElement toelemnt=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		Actions act=new Actions(driver);
		driver.manage().window().maximize();
		act.dragAndDrop(fromelement, toelemnt).perform();
		WebElement frome =driver.findElement(By.xpath("//*[@id=\"credit2\"]"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		act.dragAndDrop(frome, to).perform();
		WebElement fromee =driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement toe=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(fromee, toe).perform();
		WebElement fromeele=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement toele=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		act.dragAndDrop(fromeele, toele).perform();
		WebElement button =driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		if(button.isDisplayed())
			System.out.println("displayed");
		else
		{
			System.out.println("not");
		}
		
		
		
		
		
		
	}
	
	

}
