package testCases;

import org.testng.annotations.Test;


import pageFactory.LoginPage;
import utility.Base;

public class InvalidPW extends Base {
	
	@Test
	public void invalidPW() {
		LoginPage login=new LoginPage(driver);
		login.loginPageVarification();
		login.validLogin("standard_user", "secret_sauc");
		login.invalidPssword();
	
	}
	

}
