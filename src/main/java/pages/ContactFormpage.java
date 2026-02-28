package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormpage extends BasePage{
	@FindBy (xpath="//a[text()=' Contact us']")
	WebElement clickContactUs;
	@FindBy (xpath="//input[@type='submit']")
	WebElement clickSubmit; 
	@FindBy(xpath="//input[@name='name']")
	WebElement enterName;
	@FindBy (xpath="//input[@name='email']")
	WebElement enterMail;
	@FindBy (xpath="//input[@name='subject']")
	WebElement enterSubject;
	@FindBy (xpath="//textarea[@name='message']")
	WebElement enterMessage;
	@FindBy(xpath="//input[@name='upload_file']")
	WebElement uploadFileBox;
	//footer
	@FindBy (xpath="//input[@id='susbscribe_email']")
	WebElement enterMailId;
	@FindBy(xpath="//button[@id='subscribe']")
	WebElement clickSubcribebtn;
	
public void clickSubmit()
{
	click(clickSubmit);
}
public void clickContactUs() {
	click(clickContactUs);
}
public void enterName(String text)
{
	type(enterName, text);
	}
public void enterMail(String text) {
	type(enterMail , text);
}
public void enterSubject(String text) {
	type(enterSubject, text);
}
public void enterMessage(String text) {
	type(enterMessage ,text );
}
public void uploadFileBox(String text) {
	type(uploadFileBox , text);
}
public void enterMailId(String text)
{
	type(enterMailId,text);
	}
public void clickSubcribebtn()
{
	click(clickSubcribebtn);
}
}
