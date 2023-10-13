package firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
	}

}
