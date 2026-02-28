package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.PlaceOrderPage;
import pages.ProductsPage;
import pages.UiValidationPage;

public class VerifyRemoveProductfromCart extends BaseTest {
	@Test(description = "TC-17 verify removed product or not")
	
	public void verifyRemoveProductFromCartMeth() {
		ProductsPage productsPage =new ProductsPage();
		UiValidationPage uiVlidationPage = new UiValidationPage();
		productsPage.productsbtn();
		productsPage.selectCategory();
		productsPage.selectWomenList();
		productsPage.clickViewProduct();
		productsPage.changeQuantity("3");
		productsPage.quantityAddCart();
		productsPage.clickViewCart();
		uiVlidationPage.removeProductFromAddCart();
		uiVlidationPage.verifyProductRemoved();
	}

}
