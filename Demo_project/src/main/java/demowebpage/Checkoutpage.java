package demowebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	WebDriver driver;
	public Checkoutpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement terms;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getCheckout() {
		return checkout;
	}

}
