package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.generic.ExpTitle;
import com.qa.ac.generic.getDataFromPropertyFIile;
import com.qa.ac.pom.Homepage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OurCompany extends BaseClass {

	@Test
	public void ourCompany() throws IOException, InterruptedException {

		getDataFromPropertyFIile dfp = new getDataFromPropertyFIile();
		Homepage h = new Homepage(driver);
		Thread.sleep(2000);
		h.getOurcompany().click();
		ExpTitle e = new ExpTitle();
		Thread.sleep(2000);
		String expectedTitle = e.getExpTitle("HPtitle");
		Thread.sleep(2000);
		String actualTitle = h.actualTitle(driver);	
		Reporter.log(actualTitle,true);
		Assert.assertEquals(actualTitle, expectedTitle);

	}

}
