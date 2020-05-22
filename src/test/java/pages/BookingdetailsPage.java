package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Actions;
import utilities.TestBase;

public class BookingdetailsPage extends TestBase{
	

private Actions actionmethods; 

	@FindBy(xpath=".//button[text()='Place Order']") private WebElement placeorder;
	
	@FindBy(xpath=".//div/b[contains(.,'Total Amount')]") private WebElement pagedisplayTotalpricetext;

	
	public BookingdetailsPage() {
		actionmethods =new Actions();
		
	}
	
	public void clcikonplaceorder() {
		actionmethods.click(placeorder);
	}
	
	public String gettotalamounttext() {
		System.out.println(actionmethods.gettext(pagedisplayTotalpricetext));
		return actionmethods.gettext(pagedisplayTotalpricetext);
	}


}
