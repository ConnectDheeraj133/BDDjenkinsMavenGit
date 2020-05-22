package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import utilities.Actions;
import utilities.TestBase;

public class ConfirmationPage extends TestBase{
	
	private Actions actionmethods; 

	@FindBy(xpath=".//span[contains(.,'Thank you, your order has been placed successfully ')]") private WebElement confirmationtext;
	
	public ConfirmationPage() {
		actionmethods =new Actions();	
	}
	
	public String getorderconfriamtiontext() {
	return	actionmethods.gettext(confirmationtext);
	}
}
