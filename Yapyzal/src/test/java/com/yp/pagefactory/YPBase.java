package com.yp.pagefactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import com.yp.utilities.PropertiesFileReader;


/**
 * 
 * 
 * This Class is the base class for the entire script the driver is initialized here
 * 
 * 
 */

public class YPBase {
	
	public String timeStamp;
	public String browserName;
	public String sikulipath = System.getProperty("user.dir");
	public String screenshot = System.getProperty("user.dir") + "_Screenshot";
	public String imagepath  = System.getProperty("user.dir");
	public String AutoITpath = System.getProperty("user.dir");
	public String str;
	public String snum;
	public String excep;
	public String order;
	public String string;	
	public static Properties CONFIG = null;
	public static WebDriver driver;
	public static WebElement webelement = null;
	public Screen s = new Screen();
	public WebDriverWait dwait;
	String[] dialog;
	protected String url = null;
	protected String browser;
	public final int elementTimeOut = Integer.parseInt(PropertiesFileReader.getproperty("element.time.out"));
	public int windowTimeOut = Integer.parseInt(PropertiesFileReader.getproperty("window.time.out"));
			
	
	// YP Base File
	
	

	public static final Logger LOG = Logger.getLogger(YPBase.class);

	@SuppressWarnings("static-access")//to suppress warnings relative to incorrect static access
	protected YPBase(WebDriver driver) {
		if (this.driver == null) {
			this.driver = driver;
		}
		dwait = new WebDriverWait(driver, 20);
	}


	public YPBase(String url, String browser) {

		createWebDriver(url, browser);

	}
	

	public void createWebDriver(String url, String browser) {

		try {
			this.url = url;
			driver = initDriver(url, browser);
			driver.manage().timeouts().implicitlyWait(elementTimeOut, TimeUnit.SECONDS);
					
		} catch (Exception exec) {

		}
	}
	

	public WebDriver initDriver(String url, String browser) throws Exception {
		if (browser.equalsIgnoreCase("ie")|| browser.equalsIgnoreCase("internet explorer")) {
			// Create the DesiredCapability object of InternetExplorer
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			//Capability that defines to ignore ot not browser protected mode settings during starting by IEDriverServer.Setting this capability will make your tests unstable and hard to debug.
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,false);
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			//This will move the mouse pointer to the location where the operation is being performed on screen.
			capabilities.setCapability("requireWindowFocus", false);//Capability that defines to focus to browser window or not before operation.
			capabilities.setCapability("enablePersistentHover", false);//Capability that defines to use persistent hovering or not.
			System.setProperty(
					"webdriver.ie.driver",
					System.getProperty("user.dir")
							+ System.getProperty("file.separator")
							+ "BrowserDrivers"
							+ System.getProperty("file.separator")
							+ "IEDriverServer.exe");
			driver = new InternetExplorerDriver(capabilities);
			driver.get(url);

		} else if (browser.equalsIgnoreCase("firefox")||browser.equalsIgnoreCase("mozilla")||browser.equalsIgnoreCase("mozilla firefox")) {
			System.setProperty(
					"webdriver.gecko.driver",
					System.getProperty("user.dir")
					+ System.getProperty("file.separator")
					+ "BrowserDrivers"
					+ System.getProperty("file.separator")
					+ "geckodriver.exe");
			driver = new FirefoxDriver(FirefoxDriverProfile());
			driver.get(url);

		} else if (browser.equalsIgnoreCase("chrome")||browser.equalsIgnoreCase("google chrome")) {
			System.setProperty(
					"webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ System.getProperty("file.separator")
							+ "BrowserDrivers"
							+ System.getProperty("file.separator")
							+ "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);

		}else if (browser.equalsIgnoreCase("safari")||browser.equalsIgnoreCase("apple safari")) {
			System.setProperty("webdriver.safari.driver",
					System.getProperty("user.dir")
					       + System.getProperty("file.separator")
					       + "BrowserDrivers"
					       + System.getProperty("file.separator")
					       +"SafariDriver.safariextz ");
			driver = new SafariDriver();
			driver.get(url);
			
		}else if (browser.equalsIgnoreCase("microsoft edge")||browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir")
					       + System.getProperty("file.separator")
					       + "BrowserDrivers"
					       + System.getProperty("file.separator")
					       +"MicrosoftWebDriver.exe ");
			//System.setProperty("webdriver.edge.driver","C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
			driver =new EdgeDriver();
			driver.get(url);
			          	
		}else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
     	driver.manage().window().maximize();
		return driver;
	}

	
	public static FirefoxProfile FirefoxDriverProfile() throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("browser.download.dir",System.getProperty("user.dir") + "_Downloads");
		profile.setPreference(
				"browser.helperApps.neverAsk.openFile",
				"application/octet-stream;application/pdf,text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference(
				"browser.helperApps.neverAsk.saveToDisk",
				"application/octet-stream;application/pdf,text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("plugin.scan.Acrobat", "99.0");
		profile.setPreference("plugin.scan.plid.all", false);
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting",false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete",false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		return profile;

	}

	
	public void quitDriver() {
		driver.close();
	}
	
	
	public int switchToNewWindow(String sTitle) {

		String parentWindow = driver.getWindowHandle();		//To get the window handle of the current window
		Set<String> allWindows = driver.getWindowHandles(); //To get the window handle of all the current windows.
		for (String childWindows : allWindows) {
			if (!childWindows.equals(parentWindow)) {
				driver.switchTo().window(childWindows);
				break;
			}
		}
		return 0;
	}

	
	
	public void switchWindowUsingTitle(String title) {

		String handle = driver.getWindowHandle();

		for (int i = 1; i <= windowTimeOut; i++) {
			for (String windowHandler : driver.getWindowHandles()) {
				driver.switchTo().window(windowHandler);
				if (driver.getTitle().contains(title)) {
				return;
				}
			}
			if (i == windowTimeOut) {
				driver.switchTo().window(handle);
				throw new NoSuchElementException(
						"No window available with given title : " + title);
			}
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException ie) {

				throw new RuntimeException("Exception occured in sleep method");
			}
		}
	}
	

	public void scrollPage() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500,0)");

	}

	
	public void switchbackToMainWindow() {

		Set<String> windowIterator = driver.getWindowHandles();
		Object[] handles = windowIterator.toArray();
		driver.switchTo().window(handles[0].toString());
	}

	
	@SuppressWarnings("static-access")//to suppress warnings relative to incorrect static access
	public WebElement findElement(By by) throws Exception {
		WebElement element = null;
		for (int i = 1; i <= elementTimeOut; i++) {
			try {
				element = this.driver.findElement(by);
			} catch (WebDriverException e) {
				if (i == elementTimeOut) {
					throw e;
				}

				try {
					Thread.sleep(1000L);
				} catch (InterruptedException ie) {

					throw new RuntimeException(
							"Exception occured in sleep method");
				}
			}
		}
		if (element != null) {
			return element;
		} else {
			throw new WebDriverException("Cannot find element with "
					+ by.getClass());
		}

	}
	
	
	public boolean isElementExist(WebElement elemetName) {

		boolean present = true;
		try {
			elemetName.isDisplayed();
			present = true;

		} catch (NoSuchElementException e) {
			present = false;
		}

		return present;
	}

	
	
	public static boolean hasTextContainsString(String actual, String expected) throws Exception {
		
			boolean result = false;
				if (actual.contains(expected)) {
			result = true;
		}
		return result;
	}
	

	public String getTitle() {
		return driver.getTitle();
	}

	
	public void clickButtoninputValueContaintext(String text) throws Exception {
		findElement(By.xpath("//input[@value='" + text + "']")).click();
	}

	
	public WebElement waitforElementToAppear(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
		return ele;
	}
	

	public void mouseOver(WebElement parentElement, WebElement childElement) throws Exception {
			
		LOG.info("Inside the Mouse Over Method");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(parentElement).perform();
		action.moveToElement(childElement).perform();

	}

	
	public boolean checkAlert() {
		try {

			str = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			return true;

		} catch (NoAlertPresentException Ex) {

		}
		return false;

	}
	

	public void browsername() {

		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		browserName = cap.getBrowserName().toLowerCase();
		System.out.println(browserName);
		/*LOG.info("BrowserName is" + browserName);
		String os = cap.getPlatform().toString();
		LOG.info("OS is" + os);
		String v = cap.getVersion().toString();
		LOG.info("OS version is" + v);*/

	}
	

	
	public String gettimestamp() {
		timeStamp = new SimpleDateFormat("HH").format(new Date());
		LOG.info("TimeStamp" + timeStamp);
		return timeStamp;
	}

	
	
	

	
	public void robot() throws Exception {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_DELETE);
		robot.keyRelease(KeyEvent.VK_DELETE);
	}
	


	
	public Boolean waitforElementTotype(WebElement con, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		Boolean tr = wait.until(ExpectedConditions.textToBePresentInElement(
				con, text));
		return tr;
	}

	
	public Boolean switchtonewtab() {
		try {
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			return true;
		} catch (Exception e) {
			
		}
		return false;
	}
	

	public Boolean switchbacktotab() {
		try {
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.close();
			driver.switchTo().window(tabs2.get(0));
			return true;
			
		} catch (Exception e) {
			
		}
		return false;

	}
	

	public boolean getscreenshot() {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File browseFile = new File((screenshot + File.separator + getnum() + ".png"));
			FileUtils.moveFile(scrFile, browseFile);
			return true;
		} catch (Exception e) {
			
		}
		return false;

	}

	
	public String getnum() {
		order = driver.findElement(By.id("orderNumber")).getText();
		return order;
	}
	
		
		public boolean getFailedScreenshot() {
			try {
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File browseFile = new File((screenshot + File.separator + gettimestamp() + ".png"));
				FileUtils.moveFile(scrFile, browseFile);
				return true;
			} catch (Exception e) {
				
			}
			return false;

		}
		
		
		
		
					//------------------- File upload with Robot Keys-------------------------//
		
		public static void fileupload(String string) {
			
		    	StringSelection stringSelection = new StringSelection(string);////StringSelection is a class that can be used for copy and paste operations.
		    	Toolkit.getDefaultToolkit().getSystemClipboard() .setContents(stringSelection, null);//When you do a cut or copy of text in the operating system, the text is  stored in the clipboard 
		    	
		            
		    		try {
		    			Robot robot = new Robot();
		    			robot.delay(1000);
		    			robot.keyPress(KeyEvent.VK_CONTROL);//This is for pressing  ctrl button  of Keyboard
		    			robot.keyPress(KeyEvent.VK_V); //This is for pressing  v button of keyboard
		    			robot.keyRelease(KeyEvent.VK_V); //This is for releasing the ctrl button of KeyBoard
		    			robot.keyRelease(KeyEvent.VK_CONTROL); //This is for releasing V button of keyBoard
		    			robot.delay(2000);
		    			robot.keyPress(KeyEvent.VK_TAB);
		    			robot.keyRelease(KeyEvent.VK_TAB);
		    			robot.keyPress(KeyEvent.VK_ENTER); 
		    			robot.keyRelease(KeyEvent.VK_ENTER); 
			 
		    			} catch (AWTException e) {
		    				e.printStackTrace();
		    			}
					}
	
		
		
		//------------System Present Date select ------//
		
		
		public static void systemdateselect(){
			
			try {
				DateFormat dateformat = new SimpleDateFormat("d"); //date format
	            Date date = new Date();					
	            String today = dateformat.format(date);   
	            WebElement dateWidget = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']")); //find the calendar
	            List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  
	            //comparing the text of cell with today's date and clicking it.
	            for (WebElement cell : columns)
	            {
	               if (cell.getText().equals(today))
	               {
	                  cell.click();
	                  break;
	               }
	            }
			} catch (Exception e) {
				
			}
		}
		
		
		//------------------ server time selection after two hours-----------//
		
	public   void servertime(){
			
			try {
				DateFormat dateformat = new SimpleDateFormat("HH"); //time format in hours
	            Date date = new Date();					
	            String systemtime = dateformat.format(date);//present time
	            int presenttime =Integer.parseInt(systemtime);
	            int futuretime =presenttime+2;
	            String finaltime = String.valueOf(futuretime);
	            WebElement timeWidget = driver.findElement(By.id("refresh_hoursvalue")); //find the dropdown list
	            List<WebElement> columns=timeWidget.findElements(By.tagName("option"));  
	            //comparing the text of cell with present's time and clicking it.
	            for (WebElement cell : columns)
	            {	
	               if (cell.getText().equals(finaltime)){
	            
	            	new Select(driver.findElement(By.id("refresh_hoursvalue"))).selectByVisibleText(finaltime);
	                  break;
	               }
	            	   
	            }	
			} catch (Exception e) {
				
			}
	}
						//-------------- Element HighLighter Code-----------------//
		
	public static void HighLightElement(WebElement element){
		
			JavascriptExecutor js=(JavascriptExecutor)driver; 
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid orange;');", element);
		 
				try {
					Thread.sleep(1000);
					} 
					catch (InterruptedException e) {
					}
					js.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", element); 
					}	
		
		
		//--------------------- Future Date Select----------------//
		
		public static void futuredateselection(){
			
			try {
				DateFormat dateformat = new SimpleDateFormat("d"); //date format
	            Date date = new Date();					
	            String today = dateformat.format(date); 
	            int dateselectfuture=Integer.parseInt(today);
	            int future=dateselectfuture + 2;
	            String futuredate=String.valueOf(future);
	            WebElement dateWidget = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']")); //find the calendar
	            List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  
	            //comparing the text of cell with today's date and clicking it.
	            for (WebElement cell : columns)
	            {
	            	
	               if (cell.getText().equals(futuredate)){
	              
	                  cell.click();
	                 
	                  break;
	                
	               } 
	            }
	            
			} catch (Exception e) {
			}
		}

		
		public String getfuturedate() {
			   Date tomorrow = new Date(System.currentTimeMillis()+ (1000 * 60 * 60 * 24 * 7));
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			   String s = formatter.format(tomorrow);
			   System.out.println(s);
			return s;

			}
		
		


		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				//------------------------------------//
				
		/*public static void monthselect(){
			
			Object updatedate;
			try{
				Calendar cal = Calendar.getInstance();
				//System.out.println(new SimpleDateFormat("MMM").format(cal.getTime()));
				String[] monthname ={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
				   int[] year      ={31,28,31,30,31,30,31,31,30,31,30,31};   



			for(int i=0;i<monthname.length;i++){  //loop 12 times   

    			 if(cal.equals(monthname[i])){  //march.equals to march  2
  
				int numberofmonth=i;   //position tells 2
    			 }
				}

		DateFormat dateformat = new SimpleDateFormat("d"); //date format
	            Date date = new Date();					
	            String today = dateformat.format(date); 
	            int dateselectfuture=Integer.parseInt(today);

		int numberofmonth;
		int dayInMonth= year[numberofmonth];// select month of days   
		int dateSelctfuture;
		Object futuredate = dateSelctfuture+1;
 		WebElement dateWidget = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']")); //find the calendar
	            List<WebElement> columns=dateWidget.findElements(By.tagName("td"));
 
	            //comparing the text of cell with today's date and clicking it.
  			 if(futuredate<=dayInMonth)  {   

   		futuredate = dateSelctfuture+1;;   ///32

        	

               	for (WebElement cell : columns)
	            {
	            	
	               if (cell.getText().equals(updatedate))
                  {
	                  cell.click();
	                 
	                  break;
	               }
	            }

                  }
              else {
  
            	  monthnext.click();
            	  Thread.sleep(1000);

	WebElement dateWidget1 = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']")); //find the calendar
	            List<WebElement> columns1=dateWidget.findElements(By.tagName("td")); 
                    updatedate =1;

                for (WebElement cell : columns)
	            {
	            	
	               if (cell.getText().equals(updatedate))
         {
	                  cell.click();
	                 
	                  break;
	               }
	            }

                       }

} else { 


	monthnext.click();
	  Thread.sleep(1000);
	
 		WebElement dateWidget = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']")); //find the calendar
	            List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  



 		updatedate =2;

 		for (WebElement cell : columns)
	            {
	            	
	               if (cell.getText().equals(updatedate))
         {
	                  cell.click();
	                 
	                  break;
	               }
	            }

}
				
				
				
			} catch (Exception e) {
			
					}
			
		
*/
		
		
		
		
		// Used to translate the Month value of a JQuery calendar to the month value expected by a Calendar.
		private static final Map<String,Integer> MONTH_TO_CALENDAR_INDEX = new HashMap<String,Integer>();
		static {
		    MONTH_TO_CALENDAR_INDEX.put("January",  0);
		    MONTH_TO_CALENDAR_INDEX.put("February",1);
		    MONTH_TO_CALENDAR_INDEX.put("March",2);
		    MONTH_TO_CALENDAR_INDEX.put("April",3);
		    MONTH_TO_CALENDAR_INDEX.put("May",4);
		    MONTH_TO_CALENDAR_INDEX.put("June",5);
		    MONTH_TO_CALENDAR_INDEX.put("July",6);
		    MONTH_TO_CALENDAR_INDEX.put("August",7);
		    MONTH_TO_CALENDAR_INDEX.put("September",8);
		    MONTH_TO_CALENDAR_INDEX.put("October",9);
		    MONTH_TO_CALENDAR_INDEX.put("November",10);
		    MONTH_TO_CALENDAR_INDEX.put("December",11);
		}
		        public void setCalendarPicker(By byOpen, By byPicker, Calendar targetDate) {

		            // Open the JQuery calendar.
		            /*WebElement opener = driver.findElement(byOpen);
		            opener.click();*/

		            // Locate the JQuery calendar.
		            WebElement picker = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']"));

		            // Calculate the target and current year-and-month as an integer where value = year*12+month.
		            // The difference between the two is the number of months we have to move ahead or backward.
		            int targetYearMonth = targetDate.get(Calendar.YEAR) * 12 + targetDate.get(Calendar.MONTH);
		            int currentYearMonth = Integer.valueOf(picker.findElement(By.className("ui-datepicker-year")).getText()) * 12
		                    + Integer.valueOf(MONTH_TO_CALENDAR_INDEX.get(picker.findElement(By.className("ui-datepicker-month")).getText()));
		            // Calculate the number of months we need to move the JQuery calendar.
		            int delta = targetYearMonth - currentYearMonth;
		            // As a sanity check, let's not allow more than 10 years so that we don't inadvertently spin in a loop for zillions of months.
		            if (Math.abs(delta) > 120) throw new AssertionError("Target date is more than 10 years away");

		            // Push the JQuery calendar forward or backward as appropriate.
		            if (delta > 0) {
		                while (delta-- > 0) picker.findElement(By.className("ui-icon-circle-triangle-e")).click();
		            } else if (delta < 0 ){
		                while (delta++ < 0) picker.findElement(By.className("ui-icon-circle-triangle-w")).click();
		            }

		            // Select the day within the month.
		           /* String dayOfMonth = String.valueOf(targetDate.get(Calendar.DAY_OF_MONTH));
		            WebElement tableOfDays = picker.findElement(By.cssSelector("tbody:nth-child(2)"));
		            for (WebElement we : tableOfDays.findElements(By.tagName("td"))) {
		                if (dayOfMonth.equals(we.getText())) {
		                    we.click();

		                    // Send a tab to completely leave this control.  If the next control the user will access is another CalendarPicker,
		                    // the picker might not get selected properly if we stay on the current control.
		                    opener.sendKeys("\t");

		                    return;
		                }
		            }

		            throw new AssertionError(String.format("Unable to select specified day"));
		        }*/
}

}






		