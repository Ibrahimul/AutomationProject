package pageFactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base;

public class CheckoutPage extends Base{
	public static WebDriver driver;
	
	public CheckoutPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Checkout: Overview')]")
	WebElement CheckoutText;
	
	@FindBy(xpath = "//div[@class=\"inventory_item_price\"]")
	WebElement ProductPrice;
	
	
	@FindBy(xpath="//div[contains(text(),'SauceCard #31337')]")
	WebElement PaymentInfo;
	
	@FindBy(xpath = "//div[contains(text(),'Free Pony Express Delivery!')]")
	WebElement ShipInfo;
	
	@FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
	WebElement TotalPrice;
	
	@FindBy(xpath = "//*[@id='finish']")
	WebElement FinishBut;
	
	//Checkout text
	public void CheckoutText() {
		CheckoutText.click();
	}
	// Click on the Finish button
	public void FinishButton() {
		FinishBut.click();
	}
	
	// Checkout page verification 1
	public void CheckoutPageVerification() {
		if (CheckoutText.isDisplayed()) {
			System.out.println("Checkout page displayed successfully");
		}else {
			System.out.println("Checkout page did not display");
		}
	}
	
	//Shipping info verification
	public void ShippingInfoVerification() {
		if (ShipInfo.isDisplayed()) {
			System.out.println("Correct shipping info displayed");
		}else {
			System.out.println("Incorrect shipping info displayed");
		}
	}
	//Product price verification 
	public void PriceVerification() {
		if (ProductPrice.isDisplayed()) {
			System.out.println("Correct product price displayed");
			
		}else {
			System.out.println("Incorrect product price displayed");
		}
		
	}
	// Payment info verification ///
		public void PaymentVerification() {
			if(PaymentInfo.isDisplayed()) {
				System.out.println("Correct Payment info displayed");
			}else {
				System.out.println("Incorrect payment info displayed");
			}
		}
	// Total price verification 
		public void TotalVerification() {
			if(TotalPrice.isDisplayed()) {
				System.out.println("Correct total displayed");
			}else {
				System.out.println("Incorrect total displayed");
			}
		}
	}




