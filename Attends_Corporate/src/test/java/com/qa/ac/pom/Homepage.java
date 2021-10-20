package com.qa.ac.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	@FindBy(xpath="(//a[@class='nav-link dropdown-toggle'])[1]")
	public WebElement ourcompany;
	

	public WebElement getOurcompany() {
		return ourcompany;
	}
	
	public String actualTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
