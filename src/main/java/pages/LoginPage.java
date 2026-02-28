package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
public LoginPage()
{
	super();
	}
@FindBy(xpath="//a[text()=' Signup / Login']")
 WebElement loginOrSubmitButton;

@FindBy(xpath="//input[@name='email' and @data-qa='login-email']")
WebElement userMail;
@FindBy(xpath="//input[@name='password' and @data-qa='login-password']")
WebElement passwordTextBox;
@FindBy(xpath="//button[@type='submit' and @data-qa='login-button']")
WebElement userLogin;
@FindBy(xpath="//p[text()='Your email or password is incorrect!']")
WebElement verifyErrorText;
public void userLogin() {
	click(userLogin);
}
public void userMail(String text) {
	type(userMail ,text);
	
}
public void passwordTextBox(String text) {
	type(passwordTextBox ,text);
	
}

public void loginOrSubmitButton() {
	click(loginOrSubmitButton);
}
public void verifyErrorText(String text) {
	verifyTextPresenceAsValue(verifyErrorText, text);
}

}
