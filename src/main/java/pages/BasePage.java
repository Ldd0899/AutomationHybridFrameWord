package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import base.BaseTest;

public class BasePage extends BaseTest {
	public BasePage()
	{
		PageFactory.initElements(driver, this);
	}
	public void type(WebElement element , String text) {
		waitForElementPresence(element);
		element.sendKeys(text);
		test.log(Status.INFO, "Entered text "+text+" into the textbox");
		
	}
	public void waitForElementPresence(WebElement element) {
		WebDriverWait myWait = new WebDriverWait(driver , Duration.ofSeconds(Long.parseLong(configProp.getProperty("explicitlywait"))));
		myWait.until(ExpectedConditions.visibilityOf(element));
	}
	public void click(WebElement element)
	{
	    handleAds(); // remove ads before click

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(configProp.getProperty("explicitlywait"))));

	    wait.until(ExpectedConditions.visibilityOf(element));

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);

	    wait.until(ExpectedConditions.elementToBeClickable(element));

	    js.executeScript("arguments[0].click();", element);
	    test.log(Status.INFO, "Clicked  the button");
	}
	public String getTitle() {
		return driver.getTitle();
		
	}
	public void mouseHoverText(WebElement element) {
		Actions act=new Actions (driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(configProp.getProperty("explicitlywait"))));
		 WebElement product = wait.until(
			        ExpectedConditions.visibilityOf(element)
			    );
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		act.moveToElement(product).build().perform();
		
	}
	public void verifyTextPresenceAsValue(WebElement element , String text) {
		String actualText=element.getText();
		Assert.assertNotEquals(actualText, "Element text is null");
		Assert.assertTrue(actualText.contains(text), "Expected text not found. Actual text: " +actualText);
		
	}
	public void verifyTitle(String expTitle) {
		Assert.assertEquals(getTitle(), expTitle);
	}
	
	public void handleAds()
	{
	    try
	    {
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript(
	            "document.querySelectorAll(\"iframe[id*='aswift'], div[id*='aswift'], iframe[src*='doubleclick']\")" +
	            ".forEach(el => el.remove());");

	        // optional small wait for DOM update
	        Thread.sleep(500);
	    }
	    catch(Exception e)
	    {
	        // do nothing if ads not present
	    }
	}
	public void assertionOfQuantity(WebElement element, String expectedQuantity)
	{
	    String actualQuantity = element.getText();

	    Assert.assertEquals(actualQuantity, expectedQuantity, "Quantity is incorrect");
	}
	
	public void verifyTotalPrice(WebElement priceElement, WebElement quantityOfElement, WebElement totalElement)
	{
	    int price = Integer.parseInt(priceElement.getText().replace("Rs.", "").trim());

	    int quantity = Integer.parseInt(quantityOfElement.getText().trim());

	    int expectedTotal = price * quantity;

	    Assert.assertEquals(
	            totalElement.getText(),
	            "Rs. " + expectedTotal,
	            "Total price mismatch"
	            
	    );
	    test.log(Status.PASS, "Titles are matached...");
	}
	public void verifyCheckoutTile(WebElement element) {
		String actualTile = element.getText();
		Assert.assertEquals(actualTile, "Register / Login account to proceed on checkout.");
		test.log(Status.PASS, "Titles are matached...");
	}
	public void verifyHomepageAssertion(WebElement element , String expMessage) {
		String actualMessage=element.getText();
		Assert.assertEquals(actualMessage, expMessage , "Message is incorrect");
		test.log(Status.PASS, "Titles are matached...");
	}
	public void verifyLoginPageAssertion(WebElement element , String expMessageLogin) {
		String actualLoginMessage=element.getText();
		Assert.assertEquals(actualLoginMessage, expMessageLogin , "Message is incorrect");
		test.log(Status.PASS, "Titles are matached...");
	}
	public void verifyPlaceOrderPageAssertion(WebElement element , String expMessagePlaceOrder) {
		String actualPlaceOrderMessage=element.getText();
		Assert.assertEquals(actualPlaceOrderMessage, expMessagePlaceOrder , "Message is incorrect");
		test.log(Status.PASS, "Titles are matached...");
	}
	public void verifyProductRemovedAssertion(WebElement element , String expMessageRemoveProducts) {
		String actualProductRemovedAssertion=element.getText();
		Assert.assertEquals(actualProductRemovedAssertion, expMessageRemoveProducts , "Message is incorrect" );
		test.log(Status.PASS, "Titles are matached...");
	}
	}
	

