package com.qa.ac.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.generic.ExpTitle;
import com.qa.ac.generic.getDataFromPropertyFIile;
import com.qa.ac.pom.Homepage;

public class VerifyHomepage extends BaseClass {

	@Test
	public void verifyTitle() throws IOException, InterruptedException {
		Homepage hp = new Homepage(driver);
		ExpTitle e = new ExpTitle();
		Thread.sleep(2000);
		String expectedTitle = e.getExpTitle("HPtitle");
		Thread.sleep(2000);
		String actualTitle = hp.actualTitle(driver);
		Reporter.log(actualTitle,true);
		Assert.assertEquals(actualTitle, expectedTitle);

	}

}
