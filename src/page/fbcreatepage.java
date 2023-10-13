package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbcreatepage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
	WebElement createpage;
	public fbcreatepage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void getStartedclick()
	{
		createpage.click();
	}
	

}
