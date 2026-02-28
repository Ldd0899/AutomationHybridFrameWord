package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage{
	@FindBy (xpath="//input[@type='text']")
	WebElement enterNametext;
	@FindBy (xpath="//input[@data-qa='signup-email']")
	WebElement enterEmailtext;
	@FindBy (xpath="//button[@data-qa='signup-button']")
	WebElement clickSignUp;
	@FindBy(xpath="//div[@id='uniform-id_gender2']")
	WebElement clickGenderTitle;
	@FindBy (xpath="//input[@type='password']")
	WebElement enterSignUpPassword;
	@FindBy (xpath="//input[@data-qa='first_name']")
	WebElement enterFirstName;

	@FindBy (xpath="//input[@data-qa='last_name']")
	WebElement enterLastName;

	@FindBy (xpath="//input[@data-qa='address']")
	WebElement enterAddress;

	@FindBy (xpath="//input[@data-qa='state']")
	WebElement enterState;

	@FindBy (xpath="//input[@data-qa='city']")
	WebElement enterCity;

	@FindBy (xpath="//input[@data-qa='zipcode']")
	WebElement enterZipcode;

	@FindBy (xpath="//input[@data-qa='mobile_number']")
	WebElement enterMobileNum;
	@FindBy (xpath="//button[text()='Create Account']")
	WebElement clickCreateAccount;


	public void enterNametext(String text) {
		type(enterNametext , text);
	}
	public void enterEmailtext(String text) {
		type(enterEmailtext , text);
	}
	public void clickSignUp()
{
	click(clickSignUp);
}
	
	public void clickGenderTitle()
	{
		click(clickGenderTitle);
	}
	public void enterSignUpPassword(String text) {
		type(enterSignUpPassword , text);
	}
	public void enterFirstName(String text) {
		type (enterFirstName , text);
	}
	public void enterLastName(String text) {
		type(enterLastName, text);
		
	}
	public void enterAddress(String text) {
		type(enterAddress , text);
	}
	public void enterState(String text) {
		type(enterState , text);
	}
	public void enterCity(String text) {
		type(enterCity, text);
	}
	public void enterZipcode(String text) {
		type(enterZipcode , text);
	}
	public void enterMobileNum(String text) {
		type(enterMobileNum , text);
	}
	public void clickCreateAccount() {
		click(clickCreateAccount);
	}
}
