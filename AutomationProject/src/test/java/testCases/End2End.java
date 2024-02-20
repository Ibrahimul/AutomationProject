package testCases;

import org.testng.annotations.Test;

import pageFactory.CustomerInfoPage;
import pageFactory.InventoryPage;
import pageFactory.LoginPage;
import utility.Base;

public class End2End extends Base {

	@Test
	public void EndToEnd() throws InterruptedException {
		LoginPage loginp = new LoginPage(driver);
		InventoryPage InvPage = new InventoryPage(driver);
		CustomerInfoPage CusInfo = new CustomerInfoPage(driver);

		loginp.validLogin("standard_user", "secret_sauce");
		InvPage.InventoryPageVarification();
		InvPage.ProductName();
		InvPage.AddToCart();
		InvPage.ShoppingCart();
		InvPage.ProductVerification();
		InvPage.clickoncheckout();
		InvPage.CustomerInfoPageVerification();
		CusInfo.CustomerInfo("FirstName", "LastName", "11345");
	}

}
