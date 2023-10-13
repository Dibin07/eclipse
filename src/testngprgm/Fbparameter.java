package testngprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fbparameter {
 ChromeDriver driver;
 
 @BeforeTest
 public void setup() 
 {
	 driver=new ChromeDriver();
 }
 @BeforeMethod
 public void launch()
 {
	 driver.get("http://www.facebook.com");
 }
 @Parameters({"email","password"})
 @Test
 public void test(String em,String pas)
 {
	 System.out.println(em);
	 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(em);
	 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pas);
	 driver.findElement(By.xpath("//button[@name='login']")).click();
	 
	
 }

}
