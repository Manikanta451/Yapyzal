package com.yp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.yp.pagefactory.YPBase;

public class DealPageObjects extends YPBase {

	protected DealPageObjects(WebDriver driver) {
		super(driver);
	}
	
	
	
	public static WebElement newpost(WebDriver driver){
		webelement = driver.findElement(By.linkText("Create a New Post"));
        return webelement;
        }
	
	public static WebElement product(WebDriver driver){
		webelement = driver.findElement(By.linkText("Sell a Product"));
        return webelement;
        }
		  
	
	public static WebElement timelinephoto(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/div[4]/a"));
        return webelement;
        }
		  
	public static WebElement buybtnclose(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/div[4]/div[2]/div/a"));
        return webelement;
        }
	
	public static WebElement productname(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/div[6]/p"));
        return webelement;
        }
	
	public static WebElement producttextarea(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/div[6]/div[2]/textarea"));
        return webelement;
        }
	
	public static WebElement doneediting(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/div[6]/div[2]/div[2]/div[1]/a[2]"));
        return webelement;
        }
	
	public static WebElement tax(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[1]/div/input[2]"));
        return webelement;
        }
	public static WebElement taxarea(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[1]/div/div[1]/input"));
        return webelement;
        }        

	public static WebElement img1(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[1]/div[2]/div[1]/div[1]/div/i"));
        return webelement;
        } 
	
	public static WebElement img2(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[1]/div[2]/div[2]/ul/li[2]/a/img"));
        return webelement;
        }
	
	public static WebElement img3(WebDriver driver){
		webelement = driver.findElement(By.id("preview_img3"));
        return webelement;
        }		
	
	public static WebElement img4(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[1]/div[2]/div[2]/ul/li[4]/a/img"));
        return webelement;
        }  
	
	public static WebElement productdescription(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[1]/div[3]/div/p/span"));
        return webelement;
        } 
	public static WebElement producttextarea1(WebDriver driver){
		webelement = driver.findElement(By.xpath("html/body/form/div[4]/div/div[3]/div[1]/div[3]/div/div/textarea"));
        return webelement;
        } 
	public static WebElement doneediting1(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[1]/div[3]/div/div/div[2]/div[1]/a[2]"));
        return webelement;
        } 
	public static WebElement price(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[2]/div[2]/div[1]/span"));
        return webelement;
        }           
	public static WebElement pricearea(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[2]/div[2]/div[2]/div[1]/textarea"));
        return webelement;
        } 
		   
	public static WebElement pricedone(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[1]/input[2]"));
        return webelement;
        } 
	public static WebElement onadate(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/a[2]"));
        return webelement;
        } 
	
	public static WebElement date(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[11]/table/tbody/tr[5]/td[2]/a"));
        return webelement;
        } 
	
	public static WebElement expdate(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[11]/table/tbody/tr[5]/td[7]/a"));
        return webelement;
        } 
	
	public static WebElement autorefreshyes(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/input[2]"));
        return webelement;
        }  
	
	public static WebElement startdateclick(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div[2]/ul/li[2]/p[1]/input"));
        return webelement;
        } 
	public static WebElement startdateselect(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[11]/table/tbody/tr[3]/td[1]/a"));
        return webelement;
        } 
	public static WebElement hour(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div[2]/ul/li[2]/p[2]/span/samp/select"));
        return webelement;
        } 
	public static WebElement minute(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div[2]/ul/li[2]/p[3]/span[1]/samp/select"));
        return webelement;
        } 
	
	public static WebElement details(WebDriver driver){
		webelement = driver.findElement(By.linkText("Details"));
        return webelement;
        } 
	public static WebElement delivery(WebDriver driver){
		webelement = driver.findElement(By.xpath("//div[2]/ul/li[3]/a"));
        return webelement;
        } 
	    
	public static WebElement fbpost(WebDriver driver){
		webelement = driver.findElement(By.linkText("FB Post"));
        return webelement;
        } 
	public static WebElement inventory(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div/div/samp[2]/input"));
        return webelement;
        } 
	
	public static WebElement variants(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[2]/div[3]/div[3]/div[1]/samp/input[1]"));
        return webelement;
        } 
	
	public static WebElement type(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[2]/div[3]/div[3]/div[2]/ul/li[1]/input"));
        return webelement;
        } 
	
	public static WebElement color(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[2]/div[3]/div[3]/div[2]/ul/li[2]/input"));
        return webelement;
        } 
	
	public static WebElement size(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[2]/div[3]/div[3]/div[2]/ul/li[3]/input"));
        return webelement;
        } 
	public static WebElement savevariant(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[2]/div[3]/div[3]/div[2]/ul/li[5]/div/samp[1]/input"));
        return webelement;
        } 
	
	public static WebElement anothervariant(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[3]/div[2]/div[3]/div[3]/div[1]/samp/input[1"));
        return webelement;
        }    
	public static WebElement storepickup(WebDriver driver){
		webelement = driver.findElement(By.xpath("//div[5]/div/div/input"));
        return webelement;
        } 
	public static WebElement shiptocust(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/input[3]"));
        return webelement;
        } 
	public static WebElement stanadard(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[4]/input[1]"));
        return webelement;
        } 
	
	public static WebElement weight(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[5]/ul[1]/li[1]/input"));
        return webelement;
        } 
	
	public static WebElement length(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[5]/ul[1]/li[2]/input"));
        return webelement;
        } 	
	public static WebElement hight(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[5]/ul[1]/li[3]/input"));
        return webelement;
        } 
		
	public static WebElement width(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[5]/ul[1]/li[4]/input"));
        return webelement;
        } 
	public static WebElement ground(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[5]/ul[2]/li[1]/span[1]/label"));
        return webelement;
        } 
	public static WebElement nextdayair(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[5]/ul[2]/li[2]/span[2]/label"));
        return webelement;
        } 
	
	public static WebElement flat(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[4]/input[4]"));
        return webelement;
        } 
	
	public static WebElement deliverymethod(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[6]/ul/li[2]/ul/li/p[1]/input"));
        return webelement;
        } 
	
	public static WebElement deliverytime(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[6]/ul/li[2]/ul/li/p[2]/input"));
        return webelement;
        } 
	
	public static WebElement amount(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[6]/ul/li[2]/ul/li/p[3]/input"));
        return webelement;
        } 
	
	public static WebElement addanother(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div[6]/div[1]/p[2]/input"));
        return webelement;
        } 
	
	public static WebElement yapyzal(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[3]/div[1]/ul/li[1]/a/span"));
        return webelement;
        }          
	
	public static WebElement savedraft(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[2]/div[1]/div[4]/input[1]"));
        return webelement;
        } 
}
