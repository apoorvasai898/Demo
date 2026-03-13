package demowebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutBoxPage {

	WebDriver driver;
	public CheckOutBoxPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@id='billing-address-select']")
	private WebElement addressEdt;
	
	@FindBy(xpath="(//input[@title='Continue'])[1]")
	private WebElement continueEdt;
	@FindBy(id="shipping-address-select")
	private WebElement shippaddressEdt;
	
	@FindBy(xpath="(//input[@title='Continue'])[2]")
	private WebElement shippingcontinueEdt;
	
	@FindBy(name="shippingoption")
	private WebElement shippingoptionEdt;
	@FindBy(xpath="(//input[@value='Continue'])[3]")
	private WebElement shippingmethodcontinueEdt;
	
	
	@FindBy(name="paymentmethod")
	private WebElement paymentEdt;
	@FindBy(xpath="(//input[@value='Continue'])[4]")
	private WebElement paymentcontinueEdt;
	
	@FindBy(xpath="(//input[@value='Continue'])[5]")
	private WebElement paymentinfoEdt;
	@FindBy(xpath="//input[@value='Confirm']")
	private WebElement ConfirmEdt;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAddressEdt() {
		return addressEdt;
	}
	public WebElement getContinueEdt() {
		return continueEdt;
	}
	public WebElement getShippaddressEdt() {
		return shippaddressEdt;
	}
	public WebElement getShippingcontinueEdt() {
		return shippingcontinueEdt;
	}
	public WebElement getShippingoptionEdt() {
		return shippingoptionEdt;
	}
	public WebElement getShippingmethodcontinueEdt() {
		return shippingmethodcontinueEdt;
	}
	public WebElement getPaymentEdt() {
		return paymentEdt;
	}
	public WebElement getPaymentcontinueEdt() {
		return paymentcontinueEdt;
	}
	public WebElement getPaymentinfoEdt() {
		return paymentinfoEdt;
	}
	public WebElement getConfirmEdt() {
		return ConfirmEdt;
	}
	
	
			
			
			
			
			
			
			
			
	
	
	
	
	
	
}
