package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import utilities.Actions;
import utilities.TestBase;

public class ItemsPage extends TestBase {
	
	private Actions actionmethods; 
	
	@FindBy(css="[class='brand greenLogo']") private WebElement websitename;
	
	@FindBy(css=".cart-icon > img") private WebElement cart;
	
	@FindBy(css=" footer > p") private WebElement footertext;
	
	@FindBy(xpath=".//button[text()='ADD TO CART']") private WebElement addtoCart;
	
	@FindBy(xpath="(.//button[text()='ADD TO CART'])[4]") private WebElement addtoCart2;
	
	@FindBy(xpath=".//p[@class='product-price']") private WebElement itemPrice;
	
	@FindBy(xpath=".//button[text()='PROCEED TO CHECKOUT']") private WebElement proceedtocheckout;

	
	public ItemsPage() {
		actionmethods =new Actions();	
	}
	
	public String getwebsitetext() {
		return actionmethods.gettext(websitename);
	}
	
	public void carticonclick() {
		actionmethods.click(cart);
	}
	
	public String getfootertext() {
		return actionmethods.gettext(footertext);
	}
	
	public void addtoCartclick() {
		actionmethods.click(addtoCart);
	}
	
	public String getitempricetext() {
		return actionmethods.gettext(itemPrice);
	}
	
	public void proceedtoCheckoutclick() {
		actionmethods.click(proceedtocheckout);
	}
	
	public void addtoCartextraitemclick() {
		actionmethods.click(addtoCart2);
	}
	
	
	
}
