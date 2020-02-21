package com.McMillen.testcases;

import org.testng.annotations.Test;

import com.McMillen.pages.HomePageElements;
import com.McMillen.utils.CommonMethods;

public class HomePageIcons extends CommonMethods {

	@Test
	public void clickHome() throws InterruptedException {
		HomePageElements home=new HomePageElements();
		Thread.sleep(6000);
		jsClick(home.parentPortalLogo);
		Thread.sleep(6000);
		
		
	}
}
