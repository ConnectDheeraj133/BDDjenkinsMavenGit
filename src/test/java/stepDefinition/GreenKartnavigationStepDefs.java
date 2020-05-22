package stepDefinition;

import cucumber.api.java.en.Then;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import cucumber.api.java.en.When;
import pages.BookingdetailsPage;
import pages.ConfirmationPage;
import pages.CountrySelectionpage;
import pages.ItemsPage;
import utilities.Actions;

public class GreenKartnavigationStepDefs {

	private ItemsPage allitemspage;
	private BookingdetailsPage detailspage;
	private CountrySelectionpage countrypage;
	private ConfirmationPage confirmpage;
	private Actions actions;
	
	public GreenKartnavigationStepDefs() {
		allitemspage=new ItemsPage();
		detailspage=new BookingdetailsPage();
		countrypage=new CountrySelectionpage();
		confirmpage=new ConfirmationPage();
		actions=new Actions();	
		
	}
	@When("^customer adds an item to cart$")
	public void customer_adds_an_item_to_cart() throws Throwable {
		allitemspage.addtoCartclick();
	}

	@Then("^cart should be updated with items$")
	public void cart_should_be_updated_with_items() throws Throwable {
		allitemspage.carticonclick();
		allitemspage.proceedtoCheckoutclick();
	}

	@Then("^Able to navigate to booking details page$")
	public void able_to_navigate_to_booking_details_page() throws Throwable {
		detailspage.gettotalamounttext();
	}

	@When("^customer clicks on back button$")
	public void customer_clicks_on_back_button() throws Throwable {
		actions.naviagteback();
	   
	}

	@Then("^items page should be dispalyed$")
	public void items_page_should_be_dispalyed() throws Throwable {
		allitemspage.getwebsitetext();
	}

	@When("^clicks on \"([^\"]*)\" button$")
	public void clicks_on_button(String arg1) throws Throwable {
	   if(arg1.trim().equals("Place order")) {
		   detailspage.clcikonplaceorder();
	   }
	}

	@Then("^country page should eb dispalyed$")
	public void country_page_should_eb_dispalyed() throws Throwable {
		countrypage.getChoosecountrytext();
	   
	}
}
