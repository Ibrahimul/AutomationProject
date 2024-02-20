package testCases;

import org.testng.annotations.Test;


import pageFactory.LoginPage;
import utility.Base;

public class InvalidLogin extends Base {
	LoginPage login=new LoginPage(driver);
	@Test
	public void invalidPW() {
		LoginPage login=new LoginPage(driver);
		login.loginPageVarification();
		login.validLogin("standard_user", "secret_sauc");
		login.invalidPssword();
	}
	@Test
	public void invalidUN() {
		LoginPage login=new LoginPage(driver);
		login.validLogin("standard", "secret_sauce");
		login.invalidUserName();
	}

}
