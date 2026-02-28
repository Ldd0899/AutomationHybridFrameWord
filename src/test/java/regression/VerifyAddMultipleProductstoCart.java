package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductsPage;

public class VerifyAddMultipleProductstoCart extends BaseTest {
	
	@Test(description = "Tc01 verify products cart")
	public void validateProductscart() {
		ProductsPage productsPage =new ProductsPage();
		productsPage.productsbtn();
		productsPage.selectCategory();
		productsPage.selectWomenList();
		productsPage.moveToProduct();
		productsPage.selectProduct();
		productsPage.clickContinueShopping();
		productsPage.selectCategoryTwo();
		productsPage.selectProductTwo();
		productsPage.clickViewCart();
		
	}

}
