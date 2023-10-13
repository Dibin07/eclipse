package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sauceloginpage {
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pswd;
	
	@FindBy(name="login-button")
	WebElement loginbutton;
	
	public sauceloginpage(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvalues(String uname,String pwd)
	{
		username.sendKeys(uname);
		pswd.sendKeys(pwd);
	}
	public void login()
	{
		loginbutton.click();
	}

}
