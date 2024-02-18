package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base;

public class LoginPage extends Base {
	public static WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement UserName;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "login-button")
	WebElement LoginButton;

	@FindBy(xpath = ("//*[@class=\"login_logo\"]"))
	WebElement Logo;

	@FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
	WebElement WrongPW;

	// Enter data in the username editbox
	public void enterUserName(String UN) {
		UserName.sendKeys(UN);
	}

	// Enter data in the password field
	public void enterPassword(String PW) {
		Password.sendKeys(PW);
	}

	// Click on the login button
	public void clickLoginButton() {
		LoginButton.click();
	}

	// Method to use for valid log in
	public void validLogin(String UN, String PW) {
		UserName.sendKeys(UN);
		Password.sendKeys(PW);
		LoginButton.click();
		
	}

	// To verify valid login page
	public void loginPageVarification() {
		if (Logo.isDisplayed()) {
			System.out.println("Login page logo displayed");
		} else {
			System.out.println("Login page logo did not display");
		}
	}

	public void invalidPssword() {
		if (WrongPW.isDisplayed()) {
			System.out.println("Invaild password error message displayed successfully");
		} else {
			System.out.println("Password error message did not display");
		}

	}

}
