package com.selenium.module.test;
import com.selenium.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase{

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		signInModule.clickOnYourTripLink();
		signInModule.clickOnSignIn();
		signInModule.clickOnPopUpSignIn();
		String errorText = signInModule.getErrorText();
		Assert.assertTrue(errorText.contains("There were errors in your submission"));

	}
}