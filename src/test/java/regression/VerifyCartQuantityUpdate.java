package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductsPage;

public class VerifyCartQuantityUpdate extends BaseTest {
	@Test(description = "Tc03 verify QuantityUpdate cart")
	public void validateProductscart() {
		ProductsPage productsPage =new ProductsPage();
		productsPage.productsbtn();
		productsPage.selectCategory();
		productsPage.selectWomenList();
		productsPage.clickViewProduct();
		productsPage.changeQuantity("3");
		productsPage.quantityAddCart();
		productsPage.clickViewCart();
		productsPage.actualNumOfQuantity("3");
		productsPage.verifyPrice();
		
		
		

}
}
