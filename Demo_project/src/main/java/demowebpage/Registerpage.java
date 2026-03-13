package demowebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	WebDriver driver;
	public Registerpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="gender-female")
	private WebElement femalebtn;
	@FindBy(id="FirstName")
	private WebElement fnedt;
	@FindBy(id="LastName")
	private WebElement lnedt;
	@FindBy(id="Email")
	private WebElement emailedt;
	@FindBy(id="Password")
	private WebElement pwdedt;
	@FindBy(id="ConfirmPassword")
	private WebElement Confirmepwdedt;
	@FindBy(name="register-button")
	private WebElement registerbtn;
	public void registerpage(String fn,String ln,String email,String pwd,String Cpwd)
	
	{
		fnedt.sendKeys(fn);
		lnedt.sendKeys(ln);
		emailedt.sendKeys(email);
		pwdedt.sendKeys(pwd);
		Confirmepwdedt.sendKeys(Cpwd);
		
		
	}
}
