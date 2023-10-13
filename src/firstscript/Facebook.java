package firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("dibin02@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("96335523");
		driver.findElement(By.name("login")).click();

	}

}
