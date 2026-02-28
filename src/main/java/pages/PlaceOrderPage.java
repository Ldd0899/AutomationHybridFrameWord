package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage extends BasePage{
	@FindBy (xpath="//u[text()='Register / Login']")
	WebElement clickRegisterLink;
	
	@FindBy(xpath="//a[text()='Place Order']")
	WebElement clickPlaceOrderBtn;
	@FindBy(xpath="//input[@name='name_on_card']")
	WebElement enterNameOnCardDetails;
	@FindBy(xpath="//input[@name='card_number']")
	WebElement enterCardDetailsOnCard;
	@FindBy(xpath="//input[@name='cvc']")
	WebElement enterCvcNumberOnCarddetails;
	@FindBy(xpath="//input[@name='expiry_month']")
	WebElement enterExpityMonthOnCardDetails;
	@FindBy(xpath="//input[@name='expiry_year']")
	WebElement enterExpiryYearOnCardDetails;
	@FindBy(xpath="//button[@id='submit']")
	WebElement clickSubmitbtnOnCardDetails;
	@FindBy(xpath="//p[text()='Congratulations! Your order has been confirmed!']")
	WebElement validateSuccessMessageOnCardDetails;
	public void clickRegisterLink() {
		click(clickRegisterLink);
	}
	public void clickPlaceOrderBtn()
	{	
		click(clickPlaceOrderBtn);
	}
	public void enterNameOnCardDetails(String text)
	{	
		type(enterNameOnCardDetails , text);
	}
	public void enterCardDetailsOnCard(String text)
	{	
		type(enterCardDetailsOnCard , text);
	}
	public void enterCvcNumberOnCarddetails(String text)
	{	
		type(enterCvcNumberOnCarddetails , text);
	}
	public void enterExpityMonthOnCardDetails(String text)
	{	
		type(enterExpityMonthOnCardDetails , text);
	}
	
	public void enterExpiryYearOnCardDetails(String text)
	{	
		type(enterExpiryYearOnCardDetails , text);
	}
	public void clickSubmitbtnOnCardDetails()
	{	
		click(clickSubmitbtnOnCardDetails);
	}
	
		
		public void validateSuccess() {
		
		verifyPlaceOrderPageAssertion(validateSuccessMessageOnCardDetails, "Congratulations! Your order has been confirmed!");
	}

}
