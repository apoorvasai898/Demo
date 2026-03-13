package demowebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerlink;
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginlink;
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	private WebElement Booklink;
	@FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
	private WebElement ApparelShoelink;
	@FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	private WebElement Digitallink;
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	private WebElement Cartlink;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getRegisterlink() {
		return registerlink;
	}
	public WebElement getLoginlink() {
		return loginlink;
	}
	public WebElement getBooklink() {
		return Booklink;
	}
	public WebElement getApparelShoelink() {
		return ApparelShoelink;
	}
	public WebElement getDigitallink() {
		return Digitallink;
	}
	public WebElement getCartlink() {
		return Cartlink;
	}
	

}
