package testCases;


import org.testng.annotations.Test;

import pageFactory.LoginPage;
import utility.Base;

public class ValidLogin extends Base {
	
	
	@Test
	public void validlogin() {
		LoginPage loginp = new LoginPage(driver);
		loginp.loginPageVarification();
		loginp.validLogin("standard_user", "secret_sauce");
		

	}

}
