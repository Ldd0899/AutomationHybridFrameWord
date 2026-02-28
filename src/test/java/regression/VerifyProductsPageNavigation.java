package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductsPage;
import pages.SearchPage;
import pages.UiValidationPage;

public class VerifyProductsPageNavigation extends BaseTest {
	@Test (description = "TC-16 verify product List")
	public void veridyListOfPageMethog()
	{
		
		ProductsPage productsPage =new ProductsPage();
		UiValidationPage uiVlidationPage = new UiValidationPage();
		SearchPage searchPage = new SearchPage();
		productsPage.productsbtn();
		uiVlidationPage.categoryProductList();
		uiVlidationPage.brandProductList();
		
	}

}
