package regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.UtilKits;

public class VerifyLoginwithInValidCredentials extends BaseTest {
	@Test(dataProvider="getTestData")
	public void validateLoginTest(HashMap<String , String> dataMapNa) {
		LoginPage loginPage = new LoginPage();
		loginPage.loginOrSubmitButton();
		loginPage.userMail(dataMapNa.get("Email"));
		loginPage.passwordTextBox(dataMapNa.get("Password"));
		loginPage.userLogin();
		loginPage.verifyErrorText(dataMapNa.get("Textname"));
		
	}
	
	
	
	
	@DataProvider
	public Object[][] getTestData(){
		Object[][] data = new Object[1][1];
		data[0][0]=UtilKits.getTestDataFromExcel("TC-3");
		return data;
		
	}

}
