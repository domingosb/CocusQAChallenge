package org.domingosb.CocusQAChallenge;

import org.domingosb.CocusQAChallenge.pageObjects.LoginPage;
import org.domingosb.CocusQAChallenge.pageObjects.LongPressPage;
import org.domingosb.CocusQAChallenge.pageObjects.MenuPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class LongPressTest {
	
	MenuPage menuPage;
	LongPressPage longPressPage;
	
	@Given("I am on the long press page")
	public void setUpPage() {
		LoginPage loginPage = new LoginPage(BaseTest.driver);
		loginPage.setActivity();
		loginPage.clickLoginButton();
		menuPage = new MenuPage(BaseTest.driver);
		menuPage.clickMenuItem("Long Press");
		longPressPage = new LongPressPage(BaseTest.driver);
		Assert.assertEquals("Long Press Demo", longPressPage.getPageTitle());
	}
	
	@When("I long press \"Long Press Me\" button")
	public void doubleTap() {
		longPressPage.longPress();
	}
	
	@Then("a message appears")
	public void checkMessage() {
		Assert.assertEquals("you pressed me hard :P", longPressPage.getMessage());
		longPressPage.clickOk();
	}
	
}
