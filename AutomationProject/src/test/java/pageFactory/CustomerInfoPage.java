package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base;

public class CustomerInfoPage extends Base {
	public static WebDriver driver;

	public CustomerInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"first-name\"]")
	WebElement CusFN;

	@FindBy(xpath = "//*[@id=\"last-name\"]")
	WebElement CusLN;

	@FindBy(xpath = "//*[@id=\"postal-code\"]")
	WebElement CusZip;

	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement ContinueBut;

	// Enter customer First Name in the text field
	public void CusFN(String CFN) {
		CusFN.sendKeys(CFN);
	}

	// Enter customer last name
	public void CusLN(String CLN) {
		CusLN.sendKeys(CLN);
	}

	// Enter custiner zip code
	public void CusZip(CharSequence[] CZIP) {
		CusZip.sendKeys(CZIP);
	}

	// Click on the continue button
	public void ContinueButton() {
		ContinueBut.click();
	}

	// Method to enter custoimer info

	public void CustomerInfo(String CFN, String CLN, String CZIP) {
		CusFN.sendKeys(CFN);
		CusLN.sendKeys(CLN);
		CusZip.sendKeys(CZIP);
		ContinueBut.click();

	}
}
