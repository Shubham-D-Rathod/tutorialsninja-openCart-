

	package pageobjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class WishListPagePage {
	WebDriver driver;

	    public WishListPagePage(WebDriver driver) {

	        this.driver = driver;
	        PageFactory.initElements(driver,this);

	    }
	    
	    
	    @FindBy(xpath="//button[@class='btn btn-primary']")
	    private WebElement clickonaddtocartOnWishListPage;
	    
	    public AccountPage clickonaddtocartOnWishListPage() 
	    {
	    	clickonaddtocartOnWishListPage.click();
	    	
	    	return new AccountPage(driver);
	    }
	    
	    @FindBy(linkText="shopping cart")
	    private WebElement successmessDisplayOnWishListpage;
	    
	    public String issuccessmessDisplayasaddtoshoppingcartOnWishListpage()
	    {
	    	return successmessDisplayOnWishListpage.getText();
	    }
	}


