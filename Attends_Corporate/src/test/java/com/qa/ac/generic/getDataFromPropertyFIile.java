package com.qa.ac.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getDataFromPropertyFIile {

	public String geturl() throws IOException {
		FileInputStream fis = new FileInputStream("./TestData/propertyFIle.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		return url;
	}
	public String HPtitle() throws IOException {
		FileInputStream fis = new FileInputStream("./TestData/propertyFIle.property");
		Properties p = new Properties();
		p.load(fis);
		String HPtitle = p.getProperty("TitleOFHomepage");
		return HPtitle;
}
}
