package com.yp.pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.yp.utilities.PropertiesFileReader;



public class DriverHome extends YPBase {
	
	public static final String prod_url = PropertiesFileReader.getproperty("app.url");
			

	public DriverHome(WebDriver driver) {
		super(driver);

	}

	public DriverHome(String browser, String text) {
		super(prod_url, browser); 
	}

	public DriverHome(String url) {
		super(url, "test");

	}
	
	
	public YapyzalSignup getsignup(){
		return PageFactory.initElements(driver, YapyzalSignup.class);
	}
	public Login getLogin(){
		return PageFactory.initElements(driver, Login.class);
	}
	
	public FbLogin getfblogin(){
		return PageFactory.initElements(driver, FbLogin.class);
	}

	public CreateaNewDeal getdeal(){
		return PageFactory.initElements(driver, CreateaNewDeal.class);
	}
	
	public RequestDynamicDonation getdonatedynamic(){
		return PageFactory.initElements(driver, RequestDynamicDonation.class);
	}
	
	public RequestStaticDonation getdonatestatic(){
		return PageFactory.initElements(driver, RequestStaticDonation.class);
	}
	
	public FacebookCheckoutDeal getfbDeal(){
		return PageFactory.initElements(driver, FacebookCheckoutDeal.class);
	}
	
	public FacebookCheckoutDonate getfbDonate(){
		return PageFactory.initElements(driver, FacebookCheckoutDonate.class);
	}
}

