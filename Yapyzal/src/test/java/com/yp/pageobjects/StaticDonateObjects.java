package com.yp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.yp.pagefactory.YPBase;

public class StaticDonateObjects  extends YPBase{

	protected StaticDonateObjects(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement addamount(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div[1]/h3"));
        return webelement;
        } 
	
	public static WebElement textarea(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div[1]/div[3]/textarea"));
        return webelement;
        } 
	public static WebElement doneediting(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/input[2]"));
        return webelement;
        } 
	
	
}
