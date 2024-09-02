package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.buyer;
import pages.calculateEmi;
import pages.commercial;
import pages.plot;
import pages.popularArea;

public class Buyer {
	public static WebDriver driver;
	buyer b = new buyer();
	plot p=new plot();
	commercial c=new commercial();
	popularArea pa=new popularArea();
	calculateEmi emi=new calculateEmi();

	@Given("user is on the 99Acres website homepage.")
	public void user_is_on_the_99acres_website_homepage() {
		driver=new ChromeDriver();
		driver.get("http://99acres.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}

	@When("user selects the for buyer option on website it shows a dropdown")
	public void user_selects_the_for_buyer_option_on_website_it_shows_a_dropdown() {
 
		b.forBuyer();
		
	}

	@When("select the property in hyderabad option and clicks under construction option")
	public void select_the_property_in_hyderabad_option_and_clicks_under_construction_option() {
	    b.underCons();
	}

	@Then("select the Arkala Life flat.")
	public void select_the_Arkala_Life_flat() {
	   b.flat();
	}

	@When("user selects buyer option")
	public void user_selects_buyer_option() {
	  
	}

	@When("click on Plot and click on East facing option")
	public void click_on_plot_and_click_on_east_facing_option() {
	    p.plot();
	    p.eastFacing();
	}

	@Then("view the available properties page")
	public void view_the_available_properties_page() {
	    System.out.println("Added a method for Then");
	}

	@When("user selects buyer option then clicks on commercial sale in Hyderabad")
	public void user_selects_buyer_option_then_clicks_on_commercial_sale_in_hyderabad() {
	    c.forBuyer();
	    c.commercial();
	}

	@When("user selects shop option")
	public void user_selects_shop_option() {
	    c.shops();
	}

	@Then("user selects the Vasavis MPM Grand.")
	public void user_selects_the_vasavis_mpm_grand() {
	    c.shopAvailable();
	}

	@When("user selects buyer option then clicks on popular areas")
	public void user_selects_buyer_option_then_clicks_on_popular_areas() {
	   pa.forBuyer(); 
	    pa.popularAreas();

	}

	@When("user selects Property in Kondapur")
	public void user_selects_property_in_kondapur() {
	    pa.prop();
	}

	@Then("user selects the Sumadhura Horizon.")
	public void user_selects_the_sumadhura_horizon() {
	    pa.apartment();
	}


	@When("user clicks on for buyers and clicks on Insights option")
	public void user_clicks_on_for_buyers_and_clicks_on_insights_option() {
	    emi.forBuyer();
	    emi.insights();
	}

	@When("select home loans and tools")
	public void select_home_loans_and_tools() {
	    emi.homeloan();
	}

	@When("selects the calculate EMI bar")
	public void selects_the_calculate_emi_bar() {
	    emi.calculateEmi();
	}

	@When("send values for <{string}> <{string}> <{string}>")
	public void send_values_for(String amount, String year, String interest) {
	   emi.loanAmount(amount);
	   emi.Tenure(year);
	   emi.ROI(interest);
	}

//	@Then("it should display pie chart")
//	public void it_should_display_pie_chart() {
//	    
//	}



}
