package testCases;
import java.io.IOException;

import org.testng.annotations.Test;
import pageFactory.CheckoutPage;
import pageFactory.CustomerInfoPage;
import pageFactory.InventoryPage;
import pageFactory.LoginPage;
import pageFactory.OrderVerificationPage;
import utility.Base;

public class End2End extends Base {

	@Test
	public void EndToEnd() throws InterruptedException, IOException {
		LoginPage loginp = new LoginPage(driver);
		InventoryPage InvPage = new InventoryPage(driver);
		CustomerInfoPage CusInfo = new CustomerInfoPage(driver);
		CheckoutPage CheckOut = new CheckoutPage(driver);
		OrderVerificationPage Order = new OrderVerificationPage(driver);

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		loginp.loginPageVarification();
		loginp.validLogin("standard_user", "secret_sauce");
		InvPage.InventoryPageVarification();
		InvPage.ProductName();
		InvPage.AddToCart();
		InvPage.ShoppingCart();
		InvPage.ProductVerification();
		InvPage.clickoncheckout();
		InvPage.CustomerInfoPageVerification();
		CusInfo.CustomerInfo("FirstName", "LastName", "11345");
		CheckOut.CheckoutPageVerification();
		CheckOut.PriceVerification();
		CheckOut.PaymentVerification();
		CheckOut.ShippingInfoVerification();
		CheckOut.TotalVerification();
		CheckOut.FinishButton();
		Order.SuccessfulOrderVerification();
		Order.SuccessfulLogout();
		loginp.loginPageVarification();

	}

}
