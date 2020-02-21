package com.McMillen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.McMillen.utils.CommonMethods;

public class FacultyPagesPage extends CommonMethods{
	public WebElement facultyPages = driver.findElement(By.xpath("//li[@id='navc-2332']/a/span"));
}
