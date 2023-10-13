package firstscript;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleverification {
	ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
}
@Test
public void test1()
{
	driver.get("http://www.google.com");
    List<WebElement>li=driver.findElements(By.tagName("a"));
    System.out.println(li.size());
    
    for(WebElement ele:li)
    {
    	String links=ele.getAttribute("href");
    	varify(links);
    }
}
private void varify(String links) {
	try
	{
	URL u=new URL(links);
	HttpURLConnection con=(HttpURLConnection)u.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println("success---"+links);
	}
	else if(con.getResponseCode()==404)
	{
		System.out.println("broken link---"+links);
	}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	
	
}
}
