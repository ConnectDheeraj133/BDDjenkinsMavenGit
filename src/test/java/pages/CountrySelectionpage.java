package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import utilities.Actions;
import utilities.TestBase;

public class CountrySelectionpage extends TestBase{
	
	private Actions actionmethods; 
	
	
	@FindBy(xpath=".//button[text()='Proceed']") private WebElement proceed;
	
	 @FindBy(css=".chkAgree") private WebElement termsandConditions;
	 
	 @FindBy(xpath=".//div/label[text()='Choose Country']") private WebElement choosecountrytext;
	 
	 @FindBy(xpath=".//select") private WebElement countrySelectiondropdown;
	 

	 public CountrySelectionpage() {
			actionmethods =new Actions();
			
		}
	 
	 public void clickonproceed() {
		 actionmethods.click(proceed);
	 }
	 
	 public String getChoosecountrytext() {
		 return actionmethods.gettext(choosecountrytext);
	 }
	 
	 public void clickontermsandconditions() {
		 actionmethods.click(termsandConditions);
	 }
	 
	 public void selectingcountry() {
		 actionmethods.dropdownselection(countrySelectiondropdown);
	 }
	 
	 
}
