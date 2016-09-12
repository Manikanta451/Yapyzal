package com.yp.testscripts;

import java.util.Iterator;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.yp.datainitialization.DataInt;
import com.yp.utilities.Util;
import com.yp.utilities.Xls_Reader;


public class YapyzalTestSuite extends Base {
	
	public static final Logger LOG = Logger.getLogger(YapyzalTestSuite.class);
	String testDataPath = System.getProperty("user.dir")+ "\\src\\main\\java\\com\\yp\\test\\data\\Yapyzal.xlsx";
			
	public Xls_Reader xls = new Xls_Reader(testDataPath);

	
	/*@Test(description = "signup", dataProvider = "getsignup", priority = 0)
	public void Signup(DataInt dataInt) throws Exception {
			signup = driverhome.getsignup();
			signup.accountsignup(dataInt);
	}*/
	
	
	@Test(description = "Login", dataProvider = "getLogin",  priority = 0)
	public void Login(DataInt dataInt) throws Exception {
			login= driverhome.getLogin();
			login.accountlogin(dataInt);			
	}
	
    
	
	/*@Test(description = "Deal", dataProvider = "getdeal", priority = 1)
	public void Deal(DataInt dataInt) throws Exception {
			deal = driverhome.getdeal();
			deal.FBPOST(dataInt);
			deal.POSTSCHEDULE(dataInt);
			deal.filldetails(dataInt);
		    deal.filldelivery(dataInt);				
	}*/
	
	/*@Test(description = "Donatedynamic", dataProvider = "getdeal", priority = 2)
	public void DonateDynamic(DataInt dataInt) throws Exception {
			donatedynamic = driverhome.getdonatedynamic();
			donatedynamic.requesttodonatedynamic(dataInt);
			donatedynamic.POSTSCHEDULE(dataInt);
			donatedynamic.detailsdonate(dataInt);
			donatedynamic.imageupload(dataInt);
	}
		
	@Test(description = "Donatestatic", dataProvider = "getdeal", priority = 2)
	public void DonateStatic(DataInt dataInt) throws Exception {
			donatestatic = driverhome.getdonatestatic();
			donatestatic.requeststaticdonate(dataInt);
			donatestatic.staticdata(dataInt);
	}*/
	
	
	/*@Test(description = "FbLogin", dataProvider = "getLogin", priority = 3)
	public void fblogin(DataInt dataInt) throws Exception {
			fblogin= driverhome.getfblogin();
			fblogin.accountlogin(dataInt);			
	}*/
	
	
	/*@Test(description = "FacebookCheckoutDeal", dataProvider = "getcheckout", priority = 4)
	public void fbdeal(DataInt dataInt) throws Exception {
			fbdeal =driverhome.getfbDeal();
			fbdeal.facebookdeal(dataInt);
			fbdeal.shippinginfo(dataInt);
	}
	
	
	@Test(description = "FacebookCheckoutDonate", dataProvider = "getcheckout", priority = 5)
	public void fbdonate(DataInt dataInt) throws Exception {
		    fbdonate =driverhome.getfbDonate();
		    fbdonate.facebookdonate(dataInt);
		    fbdonate.billinginfo(dataInt);
	}
	*/
	
	
	
			@DataProvider
			public Iterator<Object[]> getsignup(){
				return Util.getsignup("Signup", xls).iterator();
			}

			@DataProvider
			public Iterator<Object[]> getLogin() {
				return Util.getLoginData("Login", xls).iterator();

			}
			
			@DataProvider
			public Iterator<Object[]> getdeal() {
				return Util.getdeal("Deal", xls).iterator();

			}
			
			@DataProvider
			public Iterator<Object[]> getcheckout() {
				return Util.getcheckout("Checkout", xls).iterator();

			}
			
}


