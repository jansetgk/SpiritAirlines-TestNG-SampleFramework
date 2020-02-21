package com.McMillen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.McMillen.testbase.BaseClass;
import com.McMillen.utils.CommonMethods;

public class HomePageElements extends CommonMethods {

	@FindBy(xpath="//li[@id='navc-HP']/a/span[1]")
	public WebElement homeLogo;
	
//	public WebElement homeLogo=driver.findElement(By.xpath("//li[@id='navc-HP']/a/span[1]"));

	@FindBy(xpath="//li[@class='sw-channel-item cs-portal-icon channel-icon transition']/a/span[1]")
	public WebElement parentPortalLogo;
	
//	public WebElement parentPortalLogo=driver.findElement(By.xpath("//li[@class='sw-channel-item cs-portal-icon channel-icon transition']/a/span[1]"));
	
	public WebElement searchLogo = driver.findElement(By.xpath("//ul[@id='channel-navigation']/li[3]/a/span[1]"));
	
	
	
	public HomePageElements() {
		PageFactory.initElements(driver, this);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
