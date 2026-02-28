package regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;
import pages.SignupPage;
import utils.UtilKits;

public class VerifySignupwithExistingEmail extends BaseTest {
	@Test(dataProvider="getSetData" , description ="TC-19 validate sign up page already existing user")
	public void verifySignUpExistingMeth(HashMap<String , String>dataSignUpMapNa) {
		LoginPage loginPage = new LoginPage();
		SignupPage signupPage= new SignupPage();
		loginPage.loginOrSubmitButton();
		signupPage.enterNametext(dataSignUpMapNa.get("Name"));
		signupPage.enterEmailtext(dataSignUpMapNa.get("Email"));
		signupPage.clickSignUp();
	}
	@DataProvider
	public Object[][] getSetData(){
		Object[][] dataSet= new Object[1][1];
		dataSet[0][0]=UtilKits.getTestDataFromExcel("TC-2");
		return dataSet;
		
		
	}

}
