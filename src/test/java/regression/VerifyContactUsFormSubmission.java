package regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ContactFormpage;
import utils.UtilKits;

public class VerifyContactUsFormSubmission extends BaseTest {
	
		@Test(dataProvider="getContactData" , description = "Tc08 verify Addproducts cart")
		public void validateProductscart(HashMap<String , String>getDataDetails) {
			ContactFormpage contactPage =new ContactFormpage();
			contactPage.clickContactUs();
			contactPage.enterName(getDataDetails.get("Name"));
			contactPage.enterMail(getDataDetails.get("Email"));
			contactPage.enterSubject("checkingCartNot Shown");
			contactPage.enterMessage("verifying all details with automation");
			contactPage.uploadFileBox("C:\\Users\\lavan\\Downloads\\Selenium Runing notes.txt");
			
			contactPage.clickSubmit();

	}
		@DataProvider
		public Object[][] getContactData(){
			Object[][] dataResult= new Object[1][1];
			dataResult[0][0]=UtilKits.getTestDataFromExcel("TC-6");
			return dataResult;
			
		}

}
