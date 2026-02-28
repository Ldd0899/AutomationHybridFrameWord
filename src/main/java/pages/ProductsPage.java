package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
	@FindBy (xpath="//a[text()=' Products']")
	WebElement productsbtn;
	@FindBy (xpath="(//i[@class='fa fa-plus'])[1]")
	WebElement selectCategory;
	@FindBy(xpath="//a[text()='Tops ']")
	WebElement selectWomenList;
	@FindBy(xpath="//div[@class='productinfo text-center']//p[text()='Blue Top']")
	WebElement moveToProduct;
	@FindBy(xpath="(//a[text()='Add to cart'])[2]")
	WebElement selectProduct;
	@FindBy(xpath="//div[@class='productinfo text-center']//p[text()='Winter Top']")
	WebElement selectCategoryTwo;
	@FindBy(xpath="(//a[text()='Add to cart'])[4]")
	WebElement selectProductTwo;
	@FindBy(xpath="//button[text()='Continue Shopping']")
	WebElement clickContinueShopping;
	@FindBy(xpath="//u[text()='View Cart']")
	WebElement clickViewCart;
	//clcik view product
	@FindBy (xpath="//a[@href='/product_details/1']")
	WebElement clickViewProduct;
	//change quantity
	@FindBy (xpath="//input[@id='quantity']")
	WebElement changeQuantity;
	//change quantity after click add cart
	@FindBy (xpath="//button[@type='button']")
	WebElement quantityElement;
	//actual quantity
	@FindBy (xpath="//button[@class='disabled']")
	WebElement actualNumOfQuantity;
	@FindBy (xpath="//td[@class='cart_price']")
	WebElement priceElement;
	@FindBy (xpath="//p[@class='cart_total_price']")
	WebElement totalElement;
	@FindBy (xpath="//td[@class='cart_quantity']")
	WebElement quantityOfElement;
	//click checkout btn
	@FindBy (xpath="//a[text()='Proceed To Checkout']")
	WebElement clickCheckOutBtn;
	//assesertion of checkout page
	@FindBy (xpath = "//p[text()='Register / Login account to proceed on checkout.']")
	WebElement validationCheckOutPage;
	//click on continue on cart
	@FindBy (xpath="//button[text()='Continue On Cart']")
	WebElement clickOnContinueCart;
	@FindBy (xpath="//a[text()=' Logout']")
	WebElement ValidateLogOut;
	//home
	@FindBy(xpath="//a[text()=' Home']")
	WebElement clickHomeBtn;
	@FindBy (xpath="//h2[text()='Features Items']")
	WebElement verifyHomePage;
	@FindBy (xpath="//h2[text()='Login to your account']")
	WebElement backToLoginPage;
	
	public void productsbtn() {
		
		click(productsbtn);
	}
public void selectCategory() {
	click(selectCategory);
	
	}
public void selectWomenList() {
	click(selectWomenList);
}
	public void moveToProduct() {
		mouseHoverText(moveToProduct);
	}
	public void selectProduct() {
		click(selectProduct);
	}
	public void selectCategoryTwo()
{
		mouseHoverText(selectCategoryTwo);
		}
	public void selectProductTwo() {
		click(selectProductTwo);
	}
	public void clickContinueShopping() {
		click(clickContinueShopping);
	}
	public void clickViewCart()
{   
		click(clickViewCart);
		}
	public void clickViewProduct() {
		click(clickViewProduct);
	}
	public void changeQuantity(String expectedQuantity)
	
	{
		changeQuantity.clear();
		type(changeQuantity,expectedQuantity );
	}
	public void quantityAddCart()
{
		click(quantityElement);
		}
	public void actualNumOfQuantity(String expectedQuantity)
	{
		assertionOfQuantity(actualNumOfQuantity, expectedQuantity);
		System.out.println(expectedQuantity);
	}
	public void verifyPrice() {
		verifyTotalPrice(priceElement, quantityOfElement, totalElement);
	}
	public void clickCheckOutBtn()
{
		click(clickCheckOutBtn);
		}
	public void validationCheckOutPage() {
		verifyCheckoutTile(validationCheckOutPage);
	}
	public void clickOnContinueCart()
{
		click(clickOnContinueCart);
		}
	public void clickHomeBtn()
{
	click(clickHomeBtn)	;

}
	public void verifyHomepage()
{
		verifyHomepageAssertion(verifyHomePage , "FEATURES ITEMS");
}
	public void ValidateLogOut()
{
	click(ValidateLogOut);
}
	public void backToLoginPage() {
		verifyLoginPageAssertion(backToLoginPage , "Login to your account");
		
		
	}
}

