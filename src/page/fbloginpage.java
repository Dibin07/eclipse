package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginpage {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpswd;
	
	@FindBy(name="login")
	WebElement fbloginbutton;
	
	public fbloginpage(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues(String email,String pswd)
	{
		fbemail.sendKeys(email);
		fbpswd.sendKeys(pswd);
	}
	public void loginclick()
	{
		fbloginbutton.click();
	}

}
