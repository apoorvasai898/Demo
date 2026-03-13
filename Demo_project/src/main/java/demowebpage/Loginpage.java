package demowebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement EmailEdt;
	@FindBy(id="Password")
	private WebElement PasswordEdt;
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginEdt;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getEmailEdt() {
		return EmailEdt;
	}
	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}
	public WebElement getLoginEdt() {
		return loginEdt;
	}
	public void login(String email,String passwd)
	{
		EmailEdt.sendKeys(email);
		PasswordEdt.sendKeys(passwd);
	}


}
