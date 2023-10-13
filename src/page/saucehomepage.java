package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucehomepage {
	WebDriver driver;
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	WebElement item1;
	
	@FindBy(name="add-to-cart-sauce-labs-bike-light")
	WebElement item2;
	
	@FindBy(name="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement item3;
	
	@FindBy(name="add-to-cart-sauce-labs-fleece-jacket")
	WebElement item4;
	
	@FindBy(name="add-to-cart-sauce-labs-onesie")
	WebElement item5;
	
	@FindBy(name="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement item6;
	
	@FindBy(id="shopping_cart_container")
	WebElement cartbutton;
	
	@FindBy(id="checkout")
	WebElement checkoutbutton;
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement pincode;
	
	@FindBy(name="continue")
	WebElement continu;
	
	@FindBy(id="finish")
	WebElement finish;
	
	
	
	@FindBy(name="back-to-products")
	WebElement backtohome;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menu;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	public saucehomepage(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickcart()
	{
		item1.click();
		item2.click();
		item3.click();
		item4.click();
		item5.click();
		item6.click();
		cartbutton.click();
		checkoutbutton.click();
	}
	public void setvalues(String fn,String ln,String pc)
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		pincode.sendKeys(pc);
		
	}
	public void continueclick()
	{
		continu.click();
		finish.click();
		backtohome.click();
		menu.click();
		logout.click();
	}
	
		
	}


