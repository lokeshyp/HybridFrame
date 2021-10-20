package com.qa.ac.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurCompanyPom {

	  public OurCompanyPom(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	@FindBy(xpath = "(//a)[5]")
	private WebElement ourBusiness;
	
	@FindBy(xpath = "(//a)[6]")
	private WebElement ourPresence;
	
	@FindBy(xpath="(//a)[7]")
	private WebElement makingItPersonal;
	
	@FindBy(xpath = "(//a)[8]")
	private WebElement ourLeaders;
	
	@FindBy(xpath = "(//a)[9]")
	private WebElement ourPortfolio;
	
	@FindBy(xpath ="(//a)[10]")
	private WebElement ourHistory;

	public WebElement getOurHistory() {
		return ourHistory;
	}

	public WebElement getOurBusiness() {
		return ourBusiness;
	}

	public WebElement getOurPresence() {
		return ourPresence;
	}

	public WebElement getMakingItPersonal() {
		return makingItPersonal;
	}

	public WebElement getOurLeaders() {
		return ourLeaders;
	}

	public WebElement getOurPortfolio() {
		return ourPortfolio;
	}
	public String actualTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}
}
