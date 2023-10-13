package firstscript;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkverify
{
	ChromeDriver driver;
	String baseurl="http://www.google.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void open() throws Exception
	{
		driver.get(baseurl);
		URL u=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		if(con.getResponseCode()==200)
		{
			System.out.println("successfull----"+baseurl);
		
		}
		else
		{
			System.out.println("not 200");
		}
		
	}

}
