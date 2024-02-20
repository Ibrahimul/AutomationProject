package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utility.Base;

public class InventoryPage extends Base {
	public static WebDriver driver;

	public  InventoryPage(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}

	@FindBy(xpath = "//*[@id=\"item_1_title_link\"]/div")
	WebElement ProductName;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement AddToCartBut;

	@FindBy(xpath = ("//*[@class=\"shopping_cart_link\"]"))
	WebElement Shoppingcart;
	
	@FindBy(xpath = "//span[contains(text(),'Products')]")
	WebElement InvPage;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement CheckoutBut;
	
	@FindBy(xpath = "//span[contains(text(),'Checkout: Your Information')]")
	WebElement CustomerInfo;
	
	//Click on the product title
	public void ProductName() {
		ProductName.click();
	}
	//Click on the Add To Cart button
	public void AddToCart() {
		AddToCartBut.click();
	}
	//Click on the shopping cart icon
	public void ShoppingCart() {
		Shoppingcart.click();
	}
	// Inventory page 'Inventory' text
	public void invtag() {
		InvPage.click();
	}
	//Click on the checkout button
	public void clickoncheckout() {
		CheckoutBut.click();
	}
	// Customer info text
	public void YourInfo() {
		CustomerInfo.click();
	}

// Verify correct product added to the cart
	
	public void ProductVerification() {
		if(ProductName.isDisplayed()) {
			System.out.println("Correct Product added");
		}else {
			System.out.println("Wrong product added");
		}
	}
// Verify inventory page 
	public void InventoryPageVarification() {
		if (InvPage.isDisplayed()) {
			System.out.println("Correct inventory UI displayed");
		}else {
			System.out.println("Wrong inventory UI displayed");
		}
	}
// Verify customer input page
	public void CustomerInfoPageVerification () {
		if (CustomerInfo.isDisplayed()) {
			System.out.println("Customer information page displayed successfully");
		}else {
			System.out.println("Customer information page did not display");
		}
	}
}
