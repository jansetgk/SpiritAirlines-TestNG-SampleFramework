package com.McMillen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.McMillen.utils.CommonMethods;

public class AcademicsPage extends CommonMethods {
	public WebElement academics = driver.findElement(By.xpath("//li[@id='navc-2156']/a/span"));
}
