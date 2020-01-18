package com.mypoject.qa.testing.test.flows;

import org.testng.annotations.Test;

import com.myproject.qa.testing.pages.GooglePageTest;

public class SearchText {

	@Test(alwaysRun=true)
	public static void enterTextInGoogleSearchBarTest() throws Exception{
		GooglePageTest.enterTextInGoogleSearchBarTest("Google");
		Thread.sleep(3000);
	}
}
