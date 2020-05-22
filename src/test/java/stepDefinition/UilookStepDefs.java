package stepDefinition;

import java.util.List;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BookingdetailsPage;
import pages.ConfirmationPage;
import pages.CountrySelectionpage;
import pages.ItemsPage;
import utilities.Actions;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;



public class UilookStepDefs {

	private ItemsPage allitemspage;
	private BookingdetailsPage detailspage;
	private CountrySelectionpage countrypage;
	private ConfirmationPage confirmpage;
	private Actions actions;
	

	public UilookStepDefs() {
		allitemspage=new ItemsPage();
		detailspage=new BookingdetailsPage();
		countrypage=new CountrySelectionpage();
		confirmpage=new ConfirmationPage();
		actions=new Actions();	
	}
	
	
	@Given("^customer is on the items page$")
	public void customer_is_on_the_items_page() throws Throwable {
		allitemspage.getwebsitetext();
	}

	@When("^customer sees all the items$")
	public void customer_sees_all_the_items() throws Throwable {
		
	    
	}

	@Then("^title of the page should be displayed$")
	public void title_of_the_page_should_be_displayed() throws Throwable {
		allitemspage.getwebsitetext();
	}

	@When("^customer sees any particular item$")
	public void customer_sees_any_particular_item() throws Throwable {
	    
	}

	@Then("^all the details should be displayed$")
	public void all_the_details_should_be_displayed(List<String> arg1) throws Throwable {
	   
	}

	@When("^customer sees the footer$")
	public void customer_sees_the_footer() throws Throwable {
		
		
	}

	@Then("^footer text \"([^\"]*)\" should be displayed$")
	public void footer_text_should_be_displayed(String arg1) throws Throwable {
		allitemspage.getfootertext();
	}

}
