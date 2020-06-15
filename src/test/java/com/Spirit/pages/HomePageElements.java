package com.Spirit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Spirit.testbase.BaseClass;


public class HomePageElements {

	@FindBy(linkText="Deals")
	public WebElement deals;
	
	
	
	@FindBy(linkText="Help")
	public WebElement help;
	
	@FindBy(linkText="Contact Us")
	public WebElement contactUs;
	
	@FindBy(xpath="//img[@class='logo']")
	public WebElement logo;
	
	

	
	
	
	
	
	
	public HomePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
