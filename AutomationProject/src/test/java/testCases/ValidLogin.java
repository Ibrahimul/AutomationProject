package testCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageFactory.LoginPage;
import utility.Base;

public class ValidLogin extends Base {

	@Test
	public void validlogin() throws IOException {
		LoginPage loginp = new LoginPage(driver);
		loginp.loginPageVarification();
		loginp.validLogin("standard_user", "secret_sauce");
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File(
				"C:\\Users\\ullah\\git\\AutomationProject\\AutomationProject\\src\\test\\resources\\ScreenShots\\Photo\\login2.png"));
	}

}
