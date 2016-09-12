package com.yp.pagefactory;


import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.yp.datainitialization.DataInt;
import com.yp.pageobjects.*;

public class RequestDynamicDonation extends CreateaNewDeal {
	
	public RequestDynamicDonation(WebDriver driver) {
		super(driver);
	}
	  
	
	
	
	
	public void requesttodonatedynamic(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(12000);
			DynamicDonateObjects.newpost(driver).click();
			Thread.sleep(1000);
			DynamicDonateObjects.donate(driver).click();
			Thread.sleep(8000);
			DynamicDonateObjects.uploadimage(driver).click();
			Thread.sleep(3000);
			this.browsername();
			if(browserName.equalsIgnoreCase("internet explorer")){
				Thread.sleep(4000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\TimelineimgDonateIE.exe");
			}else if(browserName.equalsIgnoreCase("chrome")){
				Thread.sleep(2000);				   
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\TimelineimgDonateChrome.exe");
			}else{
				Thread.sleep(4000);
				Runtime.getRuntime().exec(AutoITpath  + "\\AutoIT\\TimelineimgDonateFirefox.exe");
			}
			Thread.sleep(2000);
			DealPageObjects.buybtnclose(driver).click();
			Thread.sleep(2000);
			DynamicDonateObjects.causeclick(driver).click();
			Thread.sleep(1000);
			DynamicDonateObjects.causearea(driver).sendKeys(dataInt.getCausename());
			Thread.sleep(1000);
			DynamicDonateObjects.doneediting(driver).click();
			
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	
	
	
	public void POSTSCHEDULE(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(2000);
			DealPageObjects.fbpost(driver).click();
			Thread.sleep(2000);
			DynamicDonateObjects.onadateclick(driver).click();
			Thread.sleep(1000);
			DynamicDonateObjects.datesending(driver).click();
			DynamicDonateObjects.auto(driver).click();
			Thread.sleep(1000);
			DynamicDonateObjects.startdate(driver).click();
			Thread.sleep(1000);
			super.systemdateselect();
			Thread.sleep(2000);
			new Select(DynamicDonateObjects.hour(driver)).selectByVisibleText("13");
			Thread.sleep(1000);
			new Select(DynamicDonateObjects.minute(driver)).selectByVisibleText("45");
		
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	

			
	  public void detailsdonate(DataInt dataInt) throws Exception {
			try {
			Thread.sleep(1000);
			DynamicDonateObjects.details(driver).click();
			Thread.sleep(2000);
			DynamicDonateObjects.donatedesc(driver).click();
			Thread.sleep(1000);
			DynamicDonateObjects.donatearea(driver).sendKeys(dataInt.getDonationdescription());
			Thread.sleep(2000);
			DynamicDonateObjects.doneediting1(driver).click();
			Thread.sleep(2000);
			DynamicDonateObjects.swithuser(driver).click();
			Thread.sleep(1000);
			DynamicDonateObjects.minamt(driver).sendKeys(dataInt.getMinimum());
			Thread.sleep(1000);
			DynamicDonateObjects.maxamt(driver).sendKeys(dataInt.getMaximum());
			Thread.sleep(3000);
			} catch (Exception e) {
				excep = e.toString();
				Assert.fail(excep);

			}
		}	
			
	  public void imageupload(DataInt dataInt) throws Exception {
			try {
			DynamicDonateObjects.img1(driver).click();
			Thread.sleep(5000);
			this.browsername();
			if(browserName.equalsIgnoreCase("chrome")){
				Thread.sleep(2000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DonateImg1Chrome.exe");
			}else if(browserName.equalsIgnoreCase("firefox")){
				Thread.sleep(3000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DonateImg1Firefox.exe");
			}else{
				Thread.sleep(3000);
				Runtime.getRuntime().exec(AutoITpath  + "\\AutoIT\\DonateImg1IE.exe");
			}			
			Thread.sleep(3000);
			scrollPage();
			Thread.sleep(2000);
			DynamicDonateObjects.img2(driver).click();
			Thread.sleep(4000);
			this.browsername();
			if(browserName.equalsIgnoreCase("chrome")){
				Thread.sleep(2000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DonateImg2Chrome.exe");
				
			}else if(browserName.equalsIgnoreCase("firefox")){
				Thread.sleep(3000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DonateImg2Firefox.exe");
				
			}else {
				Thread.sleep(4000);
				Runtime.getRuntime().exec(AutoITpath  + "\\AutoIT\\DonateImg2IE.exe");
			}
			Thread.sleep(5000);
			DynamicDonateObjects.img3(driver).click();
			Thread.sleep(4000);
			this.browsername();
			if(browserName.equalsIgnoreCase("chrome")){
				Thread.sleep(2000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DonateImg3Chrome.exe");
				
			}else if(browserName.equalsIgnoreCase("firefox")){
				Thread.sleep(4000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DonateImg3Firefox.exe");
				
			}else {
				Thread.sleep(4000);
				Runtime.getRuntime().exec(AutoITpath  + "\\AutoIT\\DonateImg3IE.exe");
			}		
			Thread.sleep(3000);
			DynamicDonateObjects.img4(driver).click();
			Thread.sleep(3000);
			this.browsername();
			if(browserName.equalsIgnoreCase("chrome")){
				Thread.sleep(1000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DonateImg4Chrome.exe");
			}else if(browserName.equalsIgnoreCase("firefox")){
				Thread.sleep(4000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DonateImg4Firefox.exe");
				
			}else {
				Thread.sleep(4000);
				Runtime.getRuntime().exec(AutoITpath  + "\\AutoIT\\DonateImg4IE.exe");
			}			
			Thread.sleep(4000);
			DynamicDonateObjects.savedraft(driver).click();
			Thread.sleep(18000);
			
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	
}
