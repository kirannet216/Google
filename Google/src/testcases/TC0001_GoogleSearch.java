package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.GoogleHome;
import wrappers.LeafTapsWrappers;

public class TC0001_GoogleSearch extends LeafTapsWrappers{
	
	@BeforeClass
	public void setdata()
	{
		browserName ="chrome";
		testCaseName="TC0001_GoogleSearch";
		testDescription ="Search in google";
		dataSheetName = "TC001";
		URL ="https://www.google.co.in";
	}
    @Test(dataProvider="fetchdata")
	public void googlesearch(String search)	
	{
		new GoogleHome(driver, test).entergooglesearch(search).ClickGoogleSearch();
    	
	}
}
