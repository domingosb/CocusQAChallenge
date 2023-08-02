package org.domingosb.CocusQAChallenge;

import org.domingosb.CocusQAChallenge.pageObjects.DoubleTapPage;
import org.domingosb.CocusQAChallenge.pageObjects.LoginPage;
import org.domingosb.CocusQAChallenge.pageObjects.MenuPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class DoubleTapTest {
	
	MenuPage menuPage;
	DoubleTapPage doubleTapPage;
	
	@Given("I am on the double tap page")
	public void setUpPage() {
		LoginPage loginPage = new LoginPage(BaseTest.driver);
		loginPage.setActivity();
		loginPage.clickLoginButton();
		menuPage = new MenuPage(BaseTest.driver);
		menuPage.clickMenuItem("Double Tap");
		doubleTapPage = new DoubleTapPage(BaseTest.driver);
		Assert.assertEquals("Double Tap Demo", doubleTapPage.getPageTitle());
	}
	
	@When("I double tap \"Double Tap Me\" button")
	public void doubleTap() {
		doubleTapPage.doubleTap();
	}
	
	@Then("a successful message appears")
	public void checkMessage() {
		Assert.assertEquals("Double tap successful!", doubleTapPage.getMessage());
		doubleTapPage.clickOk();
	}
	
}
