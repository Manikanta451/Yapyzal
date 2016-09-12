package com.yp.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.yp.datainitialization.DataInt;
import com.yp.pageobjects.*;


	public class FacebookCheckoutDonate  extends FacebookCheckoutDeal{
		
		public FacebookCheckoutDonate(WebDriver driver) {
			super(driver);
		}
		
		
		
		

	public void facebookdonate(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(5000);
			/*switchbackToMainWindow();
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)","");
		    Thread.sleep(5000);
		    x=y.findElement(By.tagName("img"));
		    String z=x.getAttribute("src");
		    System.out.println(z);
		    Thread.sleep(5000);*/
			FbCheckoutPageDonateObjects.homepage(driver).click();
			Thread.sleep(6000);
			FbCheckoutPageObjects.pagename(driver).click();
			Thread.sleep(6000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,900)","");
			Thread.sleep(3000);
			FbCheckoutPageDonateObjects.donate(driver).click();
		    Thread.sleep(9000);
		    switchtonewtab();
		   /* switchToNewWindow(getTitle());
		    Thread.sleep(12000);*/
		    Thread.sleep(4000);
		    driver.switchTo().frame(0);
		    Thread.sleep(3000);
		    FbCheckoutPageDonateObjects.dynamicdata(driver).clear();
		    Thread.sleep(2000);
		    FbCheckoutPageDonateObjects.dynamicdata(driver).sendKeys("10");
		    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)","");
		    Thread.sleep(3000);
		    FbCheckoutPageDonateObjects.checkout(driver).click();
		    
		    
		} catch (Exception e) {
			  excep = e.toString();
			  Assert.fail(excep);
			}
		}
	
	public void billinginfo(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(6000);
			FbCheckoutPageDonateObjects.email(driver).sendKeys(dataInt.getEmail());
			FbCheckoutPageDonateObjects.phone(driver).sendKeys(dataInt.getPhone());
			FbCheckoutPageDonateObjects.fname(driver).sendKeys(dataInt.getFirstname());
			FbCheckoutPageDonateObjects.lname(driver).sendKeys(dataInt.getLastname());
			FbCheckoutPageDonateObjects.address(driver).sendKeys(dataInt.getAddress());
			FbCheckoutPageDonateObjects.city(driver).sendKeys(dataInt.getCity());
			new Select(FbCheckoutPageDonateObjects.state(driver)).selectByVisibleText("Tennessee");
			FbCheckoutPageDonateObjects.zip(driver).sendKeys(dataInt.getZip());
			Thread.sleep(1000);
			FbCheckoutPageDonateObjects.cardtype(driver).click();
			FbCheckoutPageDonateObjects.cardnumber(driver).sendKeys(dataInt.getCardnumber());
			FbCheckoutPageDonateObjects.cvv(driver).sendKeys(dataInt.getCvv());
			FbCheckoutPageDonateObjects.expdate(driver).sendKeys(dataInt.getExpirydate());
			FbCheckoutPageDonateObjects.expyear(driver).sendKeys(dataInt.getExpiryyear());
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)","");
			Thread.sleep(3000);
			FbCheckoutPageDonateObjects.placeorder(driver).click();
			Thread.sleep(6000);
			driver.switchTo().defaultContent();
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-350)","");
			
		      } catch (Exception e) {
			  excep = e.toString();
			  Assert.fail(excep);
			}
		}
	}