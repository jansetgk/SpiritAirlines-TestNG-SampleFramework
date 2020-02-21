package com.McMillen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.McMillen.utils.CommonMethods;

public class FineArtPage extends CommonMethods {
	public WebElement fineArt = driver.findElement(By.xpath("//li[@id='navc-2158']/a/span"));
}
