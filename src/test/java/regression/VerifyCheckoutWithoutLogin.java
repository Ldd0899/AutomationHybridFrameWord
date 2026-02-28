package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductsPage;

public class VerifyCheckoutWithoutLogin extends BaseTest{
	@Test(description = "Tc05 verify Addproducts cart")
	public void validateProductscart() {
		ProductsPage productsPage =new ProductsPage();
		productsPage.productsbtn();
		productsPage.selectCategory();
		productsPage.selectWomenList();
		productsPage.moveToProduct();
		productsPage.selectProduct();
		productsPage.clickViewCart();
		productsPage.clickCheckOutBtn();
		productsPage.validationCheckOutPage();
		productsPage.clickOnContinueCart();

}

}
