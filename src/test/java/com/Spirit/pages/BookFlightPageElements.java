package com.Spirit.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Spirit.testbase.BaseClass;

public class BookFlightPageElements {

	@FindBy(xpath="//a[@id='flight']")
	public WebElement flight;
	
	@FindBy(linkText="Round Trip")
	public WebElement roundTrip;
	
	@FindBy(xpath="//div[@class='custom-control custom-radio custom-control-inline ng-star-inserted']")
	public List<WebElement> trips;
	
	@FindBy(linkText="Multi-City")
	public WebElement multiCity;
	
	
	@FindBy(xpath="//input[@id='flight-OriginStationCode']")
	public WebElement fromBox;
	
	@FindBy(xpath="//*[@id=\"flight-panel\"]/app-flight-search/div/form/app-flight-search-input/div/div[1]/div/div/div[2]/div/app-station-picker-dropdown[1]/div/div/div[2]/div")
	public List <WebElement> fromList;
	
	@FindBy(xpath="//*[@id=\"flight-panel\"]/app-flight-search/div/form/app-flight-search-input/div/div[1]/div/div/div[2]/div/app-station-picker-dropdown[2]/div/div/div[2]/div")
	public List <WebElement> toBoxList;
	
	@FindBy(id="flight-DestinationStationCode")
	public WebElement toBox;
	
	@FindBy(xpath="//div[@class='modal-content']")
	public WebElement childAgeBox;
	
	@FindBy(id="flight-Date")
	public WebElement fDate;
	
	@FindBy(id="passengers")
	public WebElement passengers;
	
	@FindBy(xpath="//button[@class='btn btn-primary d-block']")
	public WebElement searchFlight;
	
	@FindBy(id="dateOfBirth1")
	public WebElement childBirtday;
	
	@FindBy(linkText="continue")
	public WebElement continueB;
	
	@FindBy(xpath="//label[@class='input-group-text blue small-print' and @for='flight-Date']")
	public WebElement calenderDropButton;
	
	@FindBy(xpath="//h2[@class='modal-title']")
	public WebElement youngTr;
	
	public BookFlightPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
