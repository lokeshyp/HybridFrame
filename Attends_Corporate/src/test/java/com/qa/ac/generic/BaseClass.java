package com.qa.ac.generic;

import java.io.IOException;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public void openBrowser() throws IOException {
		getDataFromPropertyFIile dfp = new getDataFromPropertyFIile();
		String url = dfp.geturl();

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
