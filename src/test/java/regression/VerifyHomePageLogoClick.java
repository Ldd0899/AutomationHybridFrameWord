package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductsPage;

public class VerifyHomePageLogoClick extends BaseTest{
	@Test(description = "Tc10 verify Addproducts cart")
	public void validateProductscart() {
		ProductsPage productsPage =new ProductsPage();
		productsPage.productsbtn();
		productsPage.clickHomeBtn();
		productsPage.verifyHomepage();

}
}
