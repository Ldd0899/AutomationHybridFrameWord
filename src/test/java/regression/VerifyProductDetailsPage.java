package regression;

import java.util.HashMap;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.PlaceOrderPage;
import pages.ProductsPage;

public class VerifyProductDetailsPage extends BaseTest {
	@Test( description = "TC-14 verify checkoput process")
	public void VerifyProductDetailsPage() {
		ProductsPage productsPage =new ProductsPage();
	
		productsPage.productsbtn();
		productsPage.selectCategory();
		productsPage.selectWomenList();
		productsPage.clickViewProduct();
		productsPage.changeQuantity("3");
		productsPage.quantityAddCart();

}
}
