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

public class endtoEndFlowStepDefs {

	private ItemsPage allitemspage;
	private BookingdetailsPage detailspage;
	private CountrySelectionpage countrypage;
	private ConfirmationPage confirmpage;
	private Actions actions;
	
public endtoEndFlowStepDefs() {
	allitemspage=new ItemsPage();
	detailspage=new BookingdetailsPage();
	countrypage=new CountrySelectionpage();
	confirmpage=new ConfirmationPage();
	actions=new Actions();	
}
@When("^clicks on proceed button$")
public void clicks_on_proceed_button() throws Throwable {
	allitemspage.carticonclick();
	allitemspage.proceedtoCheckoutclick();
	
}

@Then("^Booking details page should be displayed$")
public void booking_details_page_should_be_displayed() throws Throwable {
	detailspage.gettotalamounttext();
	
}

@Then("^clicks on place order button$")
public void clicks_on_place_order_button() throws Throwable {
	detailspage.clcikonplaceorder();
}

@Then("^countryselection page should eb displayed$")
public void countryselection_page_should_eb_displayed() throws Throwable {
	countrypage.getChoosecountrytext();
}

@When("^customer clickson continue button$")
public void customer_clickson_continue_button() throws Throwable {
	countrypage.clickonproceed();
}

@Then("^confirmation page should be displayed$")
public void confirmation_page_should_be_displayed() throws Throwable {
	confirmpage.getorderconfriamtiontext();
}

@When("^customer ads many items to cart$")
public void customer_ads_many_items_to_cart() throws Throwable {
	allitemspage.addtoCartclick();
	allitemspage.addtoCartextraitemclick();
}

@When("^user seelcts country and tandc checkbox$")
public void user_seelcts_country_and_tandc_checkbox() throws Throwable {
	countrypage.selectingcountry();
	countrypage.clickontermsandconditions();
}

}
