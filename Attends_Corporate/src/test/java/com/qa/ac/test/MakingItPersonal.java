package com.qa.ac.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.generic.ExpTitle;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurCompanyPom;

public class MakingItPersonal extends BaseClass {
	@Test
	public void verifyTitle() throws InterruptedException, IOException {
	Homepage hp = new Homepage(driver);
	hp.ourcompany.click();
	OurCompanyPom oc = new OurCompanyPom(driver);
	oc.getMakingItPersonal().click();
	
	ExpTitle e = new ExpTitle();
	Thread.sleep(2000);
	String expectedTitle = e.getExpTitle("MIPtitle");
	Thread.sleep(2000);
	String actualTitle = oc.actualTitle(driver);	
	Reporter.log(actualTitle,true);
	Assert.assertEquals(actualTitle, expectedTitle);
	
	
	}
}
