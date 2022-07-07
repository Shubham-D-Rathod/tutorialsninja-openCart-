package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.AccountPage;
import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.HpPage;
import pageobjects.LoginPage;
import pageobjects.SearchResultsPage;
import resources.Base;

public class CheckoutTest extends Base {
    WebDriver driver;
   HomePage homePage = null;
   LoginPage loginPage = null;
   AccountPage accountPage = null;
   SearchResultsPage searchresultspage ;
   CheckoutPage checkoutpage;
   
 

   @Given("^Open Browser and enter URL for the website$")
   public void open_browser_and_enter_url_for_the_website() throws IOException  {
	   driver = initializeBrowser();
	   driver.get(prop.getProperty("url"));
		
   }

   @Then("^Add them to Add to cart  $")
   public void add_them_to_add_to_cart()  {
	HpPage hppage = new HpPage(driver);  
	hppage.AddtocartButtonhp();
   }

   @Then("^Click on the shopping cart button   $")
   public void click_on_the_shopping_cart_button() {
	 
	   HpPage hppage = new HpPage(driver);
	   hppage.Addtoshoppingcart();
   }

   @Then("^Click on the as a guest user $")
   public void click_on_the_as_a_guest_user() {
	   checkoutpage.Guestuserbutton();
	  
   }

   @Then("^fill in the delivery details $")
   public void fill_in_the_delivery_details()  {
	   checkoutpage.Billerfirstname(prop.getProperty("firstname"));
	    checkoutpage.Billerlastname(prop.getProperty("lastname"));
	    checkoutpage.Billeremail(prop.getProperty("validemail"));
	    checkoutpage.Billertelephone(prop.getProperty("telephone"));
	  
	    checkoutpage.Billeraddress1(prop.getProperty("address1"));
	    checkoutpage.Billercity(prop.getProperty("city"));
	    
	    checkoutpage.Billerpostcode(prop.getProperty("postcode"));
	    checkoutpage.Billercountry(prop.getProperty("country"));
	    
	    checkoutpage.Billerstate(prop.getProperty("state"));
	    
       
   }

   @Then("^click on the continue button in step two$")
   public void click_on_the_continue_button_in_step_two() {
	    checkoutpage.Billcontinuestep3();
   }

   @Then("^click on the continue button in step four$")
   public void click_on_the_continue_button_in_step_four()  {
	   checkoutpage.Billcontinuestep4();  
   }

   @Then("^click on the term and condition button $")
   public void click_on_the_term_and_condition_button()  {
	   checkoutpage.termsandcondition(prop.getProperty("condition"));
   }

   @Then("^click on the continue button in step five$")
   public void click_on_the_continue_button_in_step_five(){
	   checkoutpage.Billcontinuestep5();
   }

   @Then("^click on the confirm order button in step six$")
   public void click_on_the_confirm_order_button_in_step_six() {
	   checkoutpage.confirmorder();
	   driver.quit();
   }

   @Then("^order is placed message is displayed$")
   public void order_is_placed_message_is_displayed() {
       
   }

   @Then("^message is displayed please fill all delivery details$")
   public void message_is_displayed_please_fill_all_delivery_details() {
	   Assert.assertEquals(checkoutpage.CheckdeliveryMessage(),prop.getProperty("pleasefillalldeliverydeatis"));
	   driver.quit();
   }

   @And("^Search the product (HP)from search option(Header) $")
   public void search_the_product_hpfrom_search_optionheader()  {
	   HomePage homePage = new HomePage(driver);
		homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
		SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
	    searchResultsPage.AddtocartButton();
   }

   @And("^The product is successfully added into shopping cart$")
   public void the_product_is_successfully_added_into_shopping_cart() {
	   HpPage hppage = new HpPage(driver);  
	   hppage. Succesfulladded();
	    
   }

   @And("^Click on the checkoutbutton   $")
   public void click_on_the_checkoutbutton()  {
	   checkoutpage.Clickoncheckoutbutton();
      
   }

   @And("^click on the continue button in step one$")
   public void click_on_the_continue_button_in_step_one() {
	   checkoutpage.ClickonguestContinueButton();
   }

}