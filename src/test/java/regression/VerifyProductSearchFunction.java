package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductsPage;
import pages.SearchPage;

public class VerifyProductSearchFunction extends BaseTest{
	@Test (description = "TC-15 verify product search page")
	public void veridySearchPageMethog()
	{
		
		ProductsPage productsPage =new ProductsPage();
		SearchPage searchPage = new SearchPage();
		productsPage.productsbtn();
		searchPage.searchProduct("Saree");
		searchPage.clickSearchProduct();
	}
			
		
		
			
}
