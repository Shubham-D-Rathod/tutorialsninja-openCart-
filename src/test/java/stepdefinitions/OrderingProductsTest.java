package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.AccountPage;
import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.HpPage;
import pageobjects.LoginPage;
import pageobjects.SearchResultsPage;
import pageobjects.SuccessPage;
import resources.Base;

public class OrderingProductsTest extends Base {
	WebDriver driver;
	HomePage homePage = null;
	LoginPage loginPage = null;
	AccountPage accountPage = null;

@Given("^Open Browsers and enter URL for the website$$")
public void open_browsers_and_enter_url_for_the_website() throws IOException  {
	driver = initializeBrowser();
	driver.get(prop.getProperty("url"));
}

@Then("^Add them to Add to cart$$")
public void add_them_to_add_to_cart()  {
   
}

@Then("^Click on the shopping cart button$$")
public void click_on_the_shopping_cart_button()  {
    
}

@Then("^Click on the as a guest user                                     $")
public void click_on_the_as_a_guest_user()  {
    
}

@Then("^fill in the delivery details $$")
public void fill_in_the_delivery_details() throws InterruptedException  {
	HomePage homePage = new HomePage(driver);
	homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
	SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
	searchResultsPage.AddtocartButton();
	HpPage hppage = new HpPage(driver);
	hppage.AddtocartButtonhp();
	Thread.sleep(5000);
	hppage. Succesfulladded();
	hppage.Addtoshoppingcart();
	CheckoutPage  checkoutpage = new CheckoutPage(driver);
	checkoutpage.Clickoncheckoutbutton();
	Thread.sleep(5000);//its compulsory sometime continuebutton not work
	checkoutpage.Guestuserbutton();
	checkoutpage.Billerfirstname(prop.getProperty("firstname"));
	checkoutpage.Billerlastname(prop.getProperty("lastname"));
	checkoutpage.Billeremail(prop.getProperty("validemail"));
	checkoutpage.Billertelephone(prop.getProperty("telephone"));
	checkoutpage.Billeraddress1(prop.getProperty("address1"));
	checkoutpage.Billercity(prop.getProperty("city"));
	checkoutpage.Billerpostcode(prop.getProperty("postcode"));
	checkoutpage.Billercountry(prop.getProperty("country"));
	Thread.sleep(5000);
	checkoutpage.Billerstate(prop.getProperty("state"));
}

@Then("^click on the continue button in step two$$")
public void click_on_the_continue_button_in_step_two() {
	CheckoutPage  checkoutpage = new CheckoutPage(driver);

	checkoutpage.ClickonguestContinueButton();
	checkoutpage.Billcontinuestep3();
}

@Then("^click on the continue button in step four$$")
public void click_on_the_continue_button_in_step_four()  {
	CheckoutPage  checkoutpage = new CheckoutPage(driver);

	checkoutpage.Billcontinuestep4();
}

@Then("^click on the term and condition button $$")
public void click_on_the_term_and_condition_button()  {
	CheckoutPage  checkoutpage = new CheckoutPage(driver);

	checkoutpage.termsandcondition(prop.getProperty("condition"));
}

@Then("^click on the continue button in step five$$")
public void click_on_the_continue_button_in_step_five()  {
	CheckoutPage  checkoutpage = new CheckoutPage(driver);

	checkoutpage.Billcontinuestep5();
}

@Then("^click on the confirm order button in step six$$")
public void click_on_the_confirm_order_button_in_step_six()  {
	CheckoutPage  checkoutpage = new CheckoutPage(driver);

	checkoutpage.confirmorder();
}

@Then("^order is placed message is displayed$$")
public void order_is_placed_message_is_displayed()  {
    
}

@Then("^click on the Order History button on Home Page$$")
public void click_on_the_order_history_button_on_home_page()  {
	SuccessPage successpage=new SuccessPage(driver);
	successpage.isclickOncontinueButton();

}

@Then("^Ordering Products is Displayed$$")
public void ordering_products_is_displayed()  {
	homePage.isclickOnviewyourOrderHistory();

}

@And("^Search the product (HP)from search option(Header)$$")
public void search_the_product_hpfrom_search_optionheader() {
   
}

@And("^The product is successfully added into shopping cart$$")
public void the_product_is_successfully_added_into_shopping_cart()  {

}

@And("^Click on the checkoutbutton$$")
public void click_on_the_checkoutbutton()  {
  
}

@And("^click on the continue button in step one$$")
public void click_on_the_continue_button_in_step_one()  {
   
}




}


