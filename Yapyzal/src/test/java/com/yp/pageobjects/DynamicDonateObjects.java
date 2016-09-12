package com.yp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.yp.pagefactory.YPBase;

public class DynamicDonateObjects extends YPBase {

	protected DynamicDonateObjects(WebDriver driver) {
		super(driver);
	}
	public static WebElement newpost(WebDriver driver){
		webelement = driver.findElement(By.xpath("//div[6]/div/div/ul/li"));
        return webelement;
        } 
	
	public static WebElement donate(WebDriver driver){
		webelement = driver.findElement(By.xpath("//a[2]/li"));
        return webelement;
        } 	  
	
	public static WebElement uploadimage(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/div[4]/a"));
        return webelement;
        } 	      
	
	public static WebElement causeclick(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/div[6]/p/span"));
        return webelement;
        }  
	public static WebElement causearea(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/div[6]/div[2]/textarea"));
        return webelement;
        }   
	
	public static WebElement doneediting(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/div[6]/div[2]/div[2]/div[1]/a[2]"));
        return webelement;
        } 
	
	public static WebElement donatedesc(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div[4]/span"));
        return webelement;
        }    
	
	public static WebElement donatearea(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div[4]/div[2]/textarea"));
        return webelement;
        } 
	
	public static WebElement doneediting1(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/samp[2]/input"));
        return webelement;
        } 
	
	public static WebElement swithuser(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div[2]/div[1]/input"));
        return webelement;
        } 
	
	public static WebElement minamt(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div[2]/div[2]/ul/li[1]/input"));
        return webelement;
        } 
	public static WebElement maxamt(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div[2]/div[2]/ul/li[2]/input"));
        return webelement;
        } 
	
	
	public static WebElement details(WebDriver driver){
		webelement = driver.findElement(By.linkText("Details"));
        return webelement;
        } 
	
	public static WebElement img1(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[1]/div[2]/div[1]/div[1]/div/i"));
        return webelement;
        } 
	
	public static WebElement img2(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[1]/div[2]/div[2]/ul/li[2]/a/img"));
        return webelement;
        } 
	public static WebElement img3(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[1]/div[2]/div[2]/ul/li[3]/a/img"));
        return webelement;
        } 
	
	public static WebElement img4(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[1]/div[2]/div[2]/ul/li[4]/a/img"));
        return webelement;
        } 
	public static WebElement savedraft(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[2]/div/div[3]/input[8]"));
        return webelement;
        } 

	public static WebElement onadateclick(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/a[2]"));
        return webelement;
        } 
	
	public static WebElement datesending(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[11]/table/tbody/tr[5]/td[5]/a"));
        return webelement;
        } 
	
	public static WebElement auto(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/input[2]"));
        return webelement;
        }     
	
	public static WebElement startdate(WebDriver driver){
		webelement = driver.findElement(By.id("refresh_startdate"));
        return webelement;
        } 
	
	public static WebElement startdateselect(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[11]/table/tbody/tr[3]/td[2]/a"));
        return webelement;
        } 
	
	public static WebElement hour(WebDriver driver){
		webelement = driver.findElement(By.id("refresh_hoursvalue"));
        return webelement;
        } 
	

	public static WebElement minute(WebDriver driver){
		webelement = driver.findElement(By.id("refresh_minutsvalue"));
        return webelement;
        } 
	
	public static WebElement poststoprefresh(WebDriver driver){
		webelement = driver.findElement(By.id("on"));
        return webelement;
        } 
	
	public static WebElement poststoprefreshend(WebDriver driver){
		webelement = driver.findElement(By.id("refresh_enddatevalue"));
        return webelement;
        } 
	
	
	
}
