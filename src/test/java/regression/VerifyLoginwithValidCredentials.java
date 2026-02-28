package regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;
import utils.UtilKits;


	public class VerifyLoginwithValidCredentials extends BaseTest {
		@Test(dataProvider="getTestData")
		public void validateLoginTest(HashMap<String , String> dataMapNa) {
			LoginPage loginPage = new LoginPage();
			ProductsPage productsPage= new ProductsPage();
			loginPage.loginOrSubmitButton();
			loginPage.userMail(dataMapNa.get("Email"));
			loginPage.passwordTextBox(dataMapNa.get("Password"));
			loginPage.userLogin();
			productsPage.ValidateLogOut();
			productsPage.backToLoginPage();
			
		}
		
		
		
		
		@DataProvider
		public Object[][] getTestData(){
			Object[][] data = new Object[1][1];
			data[0][0]=UtilKits.getTestDataFromExcel("TC-4");
			return data;
			
		}

	}


