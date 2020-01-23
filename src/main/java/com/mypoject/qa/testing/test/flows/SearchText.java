package com.mypoject.qa.testing.test.flows;

import org.testng.annotations.Test;

import com.myproject.qa.testing.framework.selenium.BaseWebDriver;
import com.myproject.qa.testing.pages.GooglePageTest;

public class SearchText extends BaseWebDriver{

	@Test(alwaysRun=true)
	public static void enterTextInGoogleSearchBarTest() throws Exception{
		GooglePageTest.enterTextInGoogleSearchBarTest("Google");
	}
	@Test(dependsOnMethods="enterTextInGoogleSearchBarTest", priority=1)
	public static void clickGoogleSearchButtonTest() throws Exception{
		GooglePageTest.clickGoogleSearchButtonTest();
		Thread.sleep(3000);
	}
}
