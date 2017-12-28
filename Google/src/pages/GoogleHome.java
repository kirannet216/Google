package pages;

import static org.testng.Assert.fail;

import java.util.StringJoiner;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class GoogleHome extends LeafTapsWrappers {

	public GoogleHome (RemoteWebDriver driver,ExtentTest test ){
		
		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("Google"))
		{
			reportStep("This is not google home Page", "FAIL");
		}
	}
	
	public GoogleHome entergooglesearch(String search)
	{
		enterById("Googlesearch", "lst-ib");
		return this;
	}
	
	public void ClickGoogleSearch()
	{
		clickByXpath("//*[@name ='btnK']");
		return;
		
	}
}







