package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ContactFormpage;

public class VerifyFooterSubscription extends BaseTest {
	@Test(description = "Tc09 verify Addproducts cart")
	public void validateProductscart() {
		ContactFormpage contactPage =new ContactFormpage();
		contactPage.enterMailId("nagunedunuri@gmail.com");
		contactPage.clickSubcribebtn();

}

} 
