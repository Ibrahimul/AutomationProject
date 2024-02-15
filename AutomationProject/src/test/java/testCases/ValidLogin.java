package testCases;

import org.testng.annotations.Test;

import pageFactory.LoginPage;
import utility.Base;

public class ValidLogin extends Base {
	@Test
	public void validlogin() {
		LoginPage login = new LoginPage(driver);
		login.loginPageVarification();
		login.validLogin("standard_user", "secret_sauce");

	}

}
