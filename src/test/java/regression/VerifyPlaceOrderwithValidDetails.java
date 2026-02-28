package regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.PlaceOrderPage;
import pages.ProductsPage;
import utils.UtilKits;

public class VerifyPlaceOrderwithValidDetails extends BaseTest {
	
	
		@Test(dataProvider="placeDatadetaisl" , description = "TC-13 verify checkoput process")
		public void validateProductscart(HashMap<String ,String>hashMapPlacedata) {
			ProductsPage productsPage =new ProductsPage();
			PlaceOrderPage placeOrderPage = new PlaceOrderPage();
			LoginPage loginPage=new LoginPage();
			productsPage.productsbtn();
			productsPage.selectCategory();
			productsPage.selectWomenList();
			productsPage.clickViewProduct();
			productsPage.changeQuantity("3");
			productsPage.quantityAddCart();
			productsPage.clickViewCart();
			productsPage.clickCheckOutBtn();
			placeOrderPage.clickRegisterLink();
			loginPage.loginOrSubmitButton();
			loginPage.userMail(hashMapPlacedata.get("Email"));
			loginPage.passwordTextBox(hashMapPlacedata.get("Password"));
			loginPage.userLogin();
			productsPage.selectCategory();
			productsPage.selectWomenList();
			productsPage.clickViewProduct();
			productsPage.quantityAddCart();
			productsPage.clickViewCart();
			productsPage.clickCheckOutBtn();
			placeOrderPage.clickPlaceOrderBtn();
			placeOrderPage.enterNameOnCardDetails(hashMapPlacedata.get("NameOnCard"));
			placeOrderPage.enterCardDetailsOnCard(hashMapPlacedata.get("CardNumber"));
			placeOrderPage.enterCvcNumberOnCarddetails(hashMapPlacedata.get("Cvc"));
			placeOrderPage.enterExpityMonthOnCardDetails(hashMapPlacedata.get("Month"));
			placeOrderPage.enterExpiryYearOnCardDetails(hashMapPlacedata.get("Year"));
			placeOrderPage.clickSubmitbtnOnCardDetails();
			placeOrderPage.validateSuccess();

}
		@DataProvider
		public Object[][]placeDatadetaisl(){
		Object[][] placeData=new Object[1][1];
		placeData[0][0]=UtilKits.getTestDataFromExcel("TC-7");
		return placeData;
}
}
