package org.domingosb.CocusQAChallenge;

import org.domingosb.CocusQAChallenge.pageObjects.LoginPage;
import org.domingosb.CocusQAChallenge.pageObjects.MenuPage;
import org.domingosb.CocusQAChallenge.pageObjects.VerticalSwipingPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class VerticalSwipingTest {
	
	MenuPage menuPage;
	VerticalSwipingPage verticalSwipingPage;
	
	@Given("I am on the Vertical Swiping screen")
	public void setUpPage() {
		LoginPage loginPage = new LoginPage(BaseTest.driver);
		loginPage.setActivity();
		loginPage.clickLoginButton();
		menuPage = new MenuPage(BaseTest.driver);
		menuPage.clickMenuItem("Vertical swiping");
		verticalSwipingPage = new VerticalSwipingPage(BaseTest.driver);
		Assert.assertEquals("Vertical swiping", verticalSwipingPage.getPageTitle());
	}
	
	@When("I scroll down until the end")
	public void scrollDown() {
		verticalSwipingPage.clickMenuItem("Karma");
	}
	
	@Then("the last option is visible")
	public void checkLastOptionIsVisible() {
		Assert.assertEquals(true, verticalSwipingPage.isLastOptionVisible());
	}
	
}
