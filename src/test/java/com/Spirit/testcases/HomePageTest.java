package com.Spirit.testcases;

import org.testng.annotations.Test;

import com.Spirit.pages.HomePageElements;
import com.Spirit.utils.CommonMethods;


public class HomePageTest extends CommonMethods{

	
	
	
	
	@Test(priority=1)
	public void Deals() throws InterruptedException {
		Thread.sleep(3000);
		HomePageElements homeP=new HomePageElements();
		homeP.deals.click();
	}
	
	//@Test
	public void Help() throws InterruptedException {
		Thread.sleep(3000);
		HomePageElements homeP=new HomePageElements();
		homeP.help.click();
	}
	
	@Test
	public void ContactUs() {
		HomePageElements homeP=new HomePageElements();
		homeP.contactUs.click();
	}
	
	@Test(priority=2)
	public void logoValidation() {
		HomePageElements homeP=new HomePageElements();
		homeP.logo.isDisplayed();
	}
	
}
