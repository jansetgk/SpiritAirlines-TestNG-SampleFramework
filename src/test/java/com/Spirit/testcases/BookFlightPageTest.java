package com.Spirit.testcases;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Spirit.pages.BookFlightPageElements;
import com.Spirit.testbase.BaseClass;
import com.Spirit.utils.CommonMethods;

public class BookFlightPageTest extends CommonMethods {

	
	@Test
	public void choseAFlight() throws InterruptedException {
		BookFlightPageElements bookF=new BookFlightPageElements();
		bookF.flight.click();
		bookF.fromBox.click();

		for(WebElement element:bookF.fromList) {
			String text=element.getText();
			
			if(text.equals("Chicago, IL - O'Hare (ORD)")) 
			{
			element.click();
			System.out.println("found");}	
		}		
	
		bookF.toBox.click();
			
		for(WebElement element:bookF.toBoxList) {
			String text=element.getText();
			
			if(text.equals("New York, NY - LaGuardia (LGA)")) 
			{
			element.click();
			System.out.println("found to");}	
		}		
		
		bookF.fDate.sendKeys("05/21/2020");
		bookF.passengers.sendKeys("2 Adults, 1 Child");
		bookF.searchFlight.submit();
		//System.out.println(bookF.youngTr.getText());
	
		Set<String>chidW=BaseClass.driver.getWindowHandles();
		System.out.println(chidW.size());
	}
}
