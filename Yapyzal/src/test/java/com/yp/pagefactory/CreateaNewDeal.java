package com.yp.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.yp.pageobjects.DealPageObjects;
import com.yp.datainitialization.DataInt;

public class CreateaNewDeal extends YPBase{
	
	public CreateaNewDeal(WebDriver driver) {
		super(driver);
	}
	
	public void FBPOST(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(8000);
			DealPageObjects.newpost(driver).click();
			Thread.sleep(2000);
			DealPageObjects.product(driver).click();
			Thread.sleep(7000);
			DealPageObjects.timelinephoto(driver).click();
			Thread.sleep(3000);	
			super.fileupload(imagepath + "\\Images\\TIMELINE.jpg");	
			Thread.sleep(2000);
			/*super.browsername();
			Thread.sleep(2000);
			if(browserName.equalsIgnoreCase("internet explorer")){
				Thread.sleep(2000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\TimelineImageIEBrowser.exe");
			}else if(browserName.equalsIgnoreCase("chrome")){
				Thread.sleep(2000);
				Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\TimelineImageChrome.exe");
			}else  {
				Thread.sleep(2000);
				Runtime.getRuntime().exec(AutoITpath  + "\\AutoIT\\TimelineImageFirefox.exe");
			}*/
			DealPageObjects.buybtnclose(driver).click();
			Thread.sleep(1000);
			DealPageObjects.productname(driver).click();
			Thread.sleep(1000);
			DealPageObjects.producttextarea(driver).sendKeys(dataInt.getProductName());
			Thread.sleep(1000);
			scrollPage();
			Thread.sleep(1000);
			DealPageObjects.doneediting(driver).click();
	
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	
			
	
	public void POSTSCHEDULE(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(3000);
			DealPageObjects.fbpost(driver).click();
			Thread.sleep(2000);
			DealPageObjects.onadate(driver).click();
			Thread.sleep(1000);
			super.getfuturedate();
			Thread.sleep(1000);
			DealPageObjects.autorefreshyes(driver).click();
			Thread.sleep(2000);
			DealPageObjects.startdateclick(driver).click();
			Thread.sleep(1000);
			super.systemdateselect();
			Thread.sleep(2000);
			super.servertime();
			Thread.sleep(1000);
			new Select(DealPageObjects.minute(driver)).selectByVisibleText("45");
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}
	
	public void filldetails(DataInt dataInt) throws Exception {
		 try {
			 	Thread.sleep(3000);
			 	DealPageObjects.details(driver).click();
				Thread.sleep(3000);
				DealPageObjects.tax(driver).click();
				Thread.sleep(1000);
				DealPageObjects.taxarea(driver).sendKeys(dataInt.getTax());
				Thread.sleep(3000);
				DealPageObjects.price(driver).click();
				Thread.sleep(1000);
				DealPageObjects.pricearea(driver).sendKeys(dataInt.getPrice());
				Thread.sleep(1000);
				DealPageObjects.pricedone(driver).click();
				Thread.sleep(3000);
				DealPageObjects.inventory(driver).click();
				Thread.sleep(3000);
				DealPageObjects.img1(driver).click();
				Thread.sleep(3000);
				super.browsername();
				Thread.sleep(2000);
				if(browserName.equalsIgnoreCase("internet explorer")){
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DealImage1IE.exe");
				}else if(browserName.equalsIgnoreCase("chrome")){
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DealImage1Chrome.exe");
				}else  {
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath  + "\\AutoIT\\DealImage1Firefox.exe");
				}
				Thread.sleep(3000);
				scrollPage();
				Thread.sleep(2000);
				DealPageObjects.img2(driver).click();	
				Thread.sleep(3000);
				this.browsername();
				Thread.sleep(2000);
				if(browserName.equalsIgnoreCase("internet explorer")){
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DealImage2IE.exe");
				}else if(browserName.equalsIgnoreCase("chrome")){
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DealImage2Chrome.exe");
				}else {
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath  + "\\AutoIT\\DealImage2Firefox.exe");
				}
				Thread.sleep(5000);
				DealPageObjects.img3(driver).click();
				Thread.sleep(3000);
				super.browsername();
				Thread.sleep(2000);
				if(browserName.equalsIgnoreCase("internet explorer")){
					Thread.sleep(3000);
					Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DealImage3IE.exe");
					
				}else if(browserName.equalsIgnoreCase("chrome")){
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DealImage3Chrome.exe");
					
				}else{
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath  + "\\AutoIT\\DealImage3Firefox.exe");
				}
				Thread.sleep(2000);
				DealPageObjects.img4(driver).click();
				Thread.sleep(3000);
				super.browsername();
				Thread.sleep(2000);
				if(browserName.equalsIgnoreCase("internet explorer")){
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DealImage4IE.exe");
					
				}else if(browserName.equalsIgnoreCase("chrome")){
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath + "\\AutoIT\\DealImage4Chrome.exe");
					
				}else{
					Thread.sleep(2000);
					Runtime.getRuntime().exec(AutoITpath  + "\\AutoIT\\DealImage4Firefox.exe");
				}
				Thread.sleep(2000);
				DealPageObjects.productdescription(driver).click();
				Thread.sleep(1000);
				DealPageObjects.producttextarea1(driver).sendKeys(dataInt.getProductDescription());
				Thread.sleep(1000);
				DealPageObjects.doneediting1(driver).click();
				Thread.sleep(5000);
				DealPageObjects.details(driver).click();
				Thread.sleep(2000);
				DealPageObjects.variants(driver).click();
				Thread.sleep(4000);
				DealPageObjects.type(driver).sendKeys(dataInt.getTyoe());
				DealPageObjects.color(driver).sendKeys(dataInt.getColor());
				super.browsername();
				Thread.sleep(2000);
				if(browserName.equalsIgnoreCase("firefox")){
					((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)","");
				}else
				Thread.sleep(3000);
				DealPageObjects.size(driver).sendKeys(dataInt.getSize());
				Thread.sleep(5000);
				DealPageObjects.savevariant(driver).click();
		
			} catch (Exception e) {
				excep = e.toString();
				Assert.fail(excep);

			}
		}	
				
			
		public void filldelivery(DataInt dataInt) throws Exception {
			try {
			Thread.sleep(4000);
			DealPageObjects.delivery(driver).click();
			Thread.sleep(3000);
			DealPageObjects.storepickup(driver).click();
			Thread.sleep(2000);
			DealPageObjects.shiptocust(driver).click();
			Thread.sleep(1000);
			DealPageObjects.stanadard(driver).click();
			Thread.sleep(3000);
			DealPageObjects.weight(driver).sendKeys(dataInt.getWeight());
			Thread.sleep(1000);
			DealPageObjects.length(driver).sendKeys(dataInt.getLength());
			Thread.sleep(1000);
			DealPageObjects.hight(driver).sendKeys(dataInt.getHight());
			DealPageObjects.width(driver).sendKeys(dataInt.getWidth());
			Thread.sleep(2000);
			DealPageObjects.ground(driver).click();
			Thread.sleep(1000);
			DealPageObjects.nextdayair(driver).click();
			scrollPage();
			Thread.sleep(3000);
			DealPageObjects.delivery(driver).click();
			Thread.sleep(2000);
			DealPageObjects.flat(driver).click();
			Thread.sleep(2000);
			DealPageObjects.deliverymethod(driver).sendKeys(dataInt.getDeliveryMethod());
			Thread.sleep(1000);
			DealPageObjects.deliverytime(driver).sendKeys(dataInt.getDeliveryTime());
			Thread.sleep(1000);
			DealPageObjects.amount(driver).sendKeys(dataInt.getAmount());
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,60)","");
			Thread.sleep(3000);
			DealPageObjects.savedraft(driver).click();
			Thread.sleep(7000);
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	
}
