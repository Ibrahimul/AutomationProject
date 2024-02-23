package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base;

public class OrderVerificationPage extends Base {
	public static WebDriver driver;

	public OrderVerificationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[contains(text(),'Thank you for your order!')]")
	WebElement OrderConfirmationMessage;

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement BurgerBtn;

	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement LogoutBtn;

	// Click on burger button to render logout option
	public void BurgerBtn() {
		BurgerBtn.click();
	}

	// Click on the logout button
	public void LogoutBtn() {
		LogoutBtn.click();
	}

	// Verify that the order placed successfully
	public void SuccessfulOrderVerification() {
		if (OrderConfirmationMessage.isDisplayed()) {
			System.out.println("Order has been placed successfully");
		} else {
			System.out.println("Order failed");
		}
	}

	// Method for successfully logging out after placing an order.
	public void SuccessfulLogout() {
		BurgerBtn.click();
		LogoutBtn.click();

	}
}
