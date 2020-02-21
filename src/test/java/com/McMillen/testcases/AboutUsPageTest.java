package com.McMillen.testcases;

import org.testng.annotations.Test;

import com.McMillen.pages.AboutUsPage;
import com.McMillen.utils.CommonMethods;

public class AboutUsPageTest extends CommonMethods{

	@Test
	public void annualR() {
		AboutUsPage abUs=new AboutUsPage();
		jsClick(abUs.aboutUs);
		
		//abUs.aboutUs.click();
		abUs.annualReport.click();
	}
	
}
