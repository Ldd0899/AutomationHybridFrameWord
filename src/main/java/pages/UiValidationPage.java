package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UiValidationPage extends BasePage{
	@FindBy (xpath="//div[@class='panel-group category-products']")
	WebElement categoryProductList;
	@FindBy (xpath="//div[@class='brands_products']")
	WebElement brandProductList;
	@FindBy(xpath="//i[@class='fa fa-times']")
	WebElement removeProductFromAddCart;
	@FindBy(xpath="//b[text()='Cart is empty!']")
	WebElement verifyProductRemoved;
	public void categoryProductList()
	{
		mouseHoverText(categoryProductList);
		
	}
	public void brandProductList()
	{
		mouseHoverText(brandProductList);
		
	}
	public void removeProductFromAddCart()
{
		click(removeProductFromAddCart);
		}
	public void verifyProductRemoved() {
		verifyProductRemovedAssertion(verifyProductRemoved, "");
	}
}
