package regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SignupPage;
import utils.UtilKits;

public class VerifyUserSignupWithValidDetails {
	public class VerifySignupwithExistingEmail extends BaseTest {
		@Test(dataProvider="getSetData" , description ="TC-20 validate sign up page new user")
		public void verifySignUpExistingMeth(HashMap<String , String>dataSignUpMapNa) {
			LoginPage loginPage = new LoginPage();
			SignupPage signupPage= new SignupPage();
			loginPage.loginOrSubmitButton();
			signupPage.enterNametext(dataSignUpMapNa.get("Name"));
			signupPage.enterEmailtext(dataSignUpMapNa.get("Email"));
			signupPage.clickSignUp();
			signupPage.clickGenderTitle();
			signupPage.enterSignUpPassword(dataSignUpMapNa.get("Password"));
			signupPage.enterFirstName(dataSignUpMapNa.get("FirstName"));
			signupPage.enterLastName(dataSignUpMapNa.get("LastName"));
			signupPage.enterAddress(dataSignUpMapNa.get("Address"));
			signupPage.enterState(dataSignUpMapNa.get("State"));
			signupPage.enterCity(dataSignUpMapNa.get("City"));
			signupPage.enterZipcode(dataSignUpMapNa.get("Zipcode"));
			signupPage.enterMobileNum(dataSignUpMapNa.get("MobileNumber"));
			signupPage.clickCreateAccount();
		}
		@DataProvider
		public Object[][] getSetData(){
			Object[][] dataSet= new Object[1][1];
			dataSet[0][0]=UtilKits.getTestDataFromExcel("TC-1");
			return dataSet;
			
			
		}

	}
}
