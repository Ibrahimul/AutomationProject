package testCases;
import java.io.IOException;
import org.testng.annotations.Test;
import pageFactory.LoginPage;
import utility.Base;
import utility.ReadXLSdata;

public class InvalidLogin extends Base {
	@Test(dataProviderClass = ReadXLSdata.class, dataProvider = "userCredentials")
	public void InvalidSignIn(String UN, String PW) throws IOException {
		LoginPage login = new LoginPage(driver);
		login.validLogin(UN, PW);
		//login.invalidUserName();
	}
	
	// Read Excel data using TestNG annotation
//	@DataProvider(name = "userCredentials")
//	public Object[][] tData() {
//		return new Object[][] { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret" },
//				{ "problem", "secret_sauce" }, { "nouser", "nopassword" } };
//	}

}
