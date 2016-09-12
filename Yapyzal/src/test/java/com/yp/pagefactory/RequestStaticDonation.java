package com.yp.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.yp.datainitialization.DataInt;
import com.yp.pageobjects.*;

public class RequestStaticDonation extends RequestDynamicDonation {
	
	public RequestStaticDonation(WebDriver driver) {
		super(driver);
	}

	
	public void requeststaticdonate(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(3000);
			this.requesttodonatedynamic(dataInt);
			this.POSTSCHEDULE(dataInt);
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}		
	
	public void staticdata(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(7000);
			DynamicDonateObjects.details(driver).click();
			Thread.sleep(2000);
			DynamicDonateObjects.donatedesc(driver).click();
			Thread.sleep(1000);
			DynamicDonateObjects.donatearea(driver).sendKeys(dataInt.getDonationdescription());
			Thread.sleep(2000);
			DynamicDonateObjects.doneediting1(driver).click();
			Thread.sleep(2000);
			StaticDonateObjects.addamount(driver).click();
			Thread.sleep(1000);
			StaticDonateObjects.textarea(driver).sendKeys(dataInt.getAddamount());
			Thread.sleep(1000);
			DynamicDonateObjects.doneediting(driver).click();
			Thread.sleep(3000);
			this.imageupload(dataInt);
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}		
}
