package firstscript;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		String actualtitle=driver.getTitle();
		String expectertitle="google";
		
		
		if(actualtitle.equals(expectertitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		String src=driver.getPageSource();
		
		if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		

	}

}
