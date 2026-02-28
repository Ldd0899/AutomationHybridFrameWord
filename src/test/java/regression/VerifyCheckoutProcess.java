package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.PlaceOrderPage;
import pages.ProductsPage;

public class VerifyCheckoutProcess extends BaseTest{
	@Test(description = "TC-04 verify checkoput process")
	public void validateProductscart() {
		ProductsPage productsPage =new ProductsPage();
		
		productsPage.productsbtn();
		productsPage.selectCategory();
		productsPage.selectWomenList();
		productsPage.moveToProduct();
		productsPage.selectProduct();
		productsPage.clickViewCart();
		productsPage.clickCheckOutBtn();

}

}
