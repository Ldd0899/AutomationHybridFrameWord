package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ContactFormpage;
import pages.ProductsPage;

public class VerifyContactFormValidation extends BaseTest {
	@Test(description = "Tc07 verify Addproducts cart")
	public void validateProductscart() {
		ContactFormpage contactPage =new ContactFormpage();
		contactPage.clickContactUs();
		contactPage.clickSubmit();

}


}
