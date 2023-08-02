package org.domingosb.CocusQAChallenge;

import org.domingosb.CocusQAChallenge.pageObjects.CarouselPage;
import org.domingosb.CocusQAChallenge.pageObjects.LoginPage;
import org.domingosb.CocusQAChallenge.pageObjects.MenuPage;
import org.domingosb.CocusQAChallenge.pageObjects.WheelPickerPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class WheelPickerTest {
	
	MenuPage menuPage;
	WheelPickerPage wheelPickerPage;
	
	@Given("I am on the color page")
	public void setUpPage() {
		LoginPage loginPage = new LoginPage(BaseTest.driver);
		loginPage.setActivity();
		loginPage.clickLoginButton();
		menuPage = new MenuPage(BaseTest.driver);
		menuPage.clickMenuItem("Wheel Picker");
		wheelPickerPage = new WheelPickerPage(BaseTest.driver);
		Assert.assertEquals("Wheel Picker Demo", wheelPickerPage.getPageTitle());
	}
	
	@When("I select \"Red\" from the color dropdown")
	public void pickRed() {
		wheelPickerPage.clickPickButton();
		wheelPickerPage.pickColor("red");
	}
	
	@When("I select \"Green\" from the color dropdown")
	public void pickGreen() {
		wheelPickerPage.clickPickButton();
		wheelPickerPage.pickColor("green");
	}
	
	@When("I select \"Blue\" from the color dropdown")
	public void pickBlue() {
		wheelPickerPage.clickPickButton();
		wheelPickerPage.pickColor("blue");
	}
	
	@When("I select \"Black\" from the color dropdown")
	public void pickBlack() {
		wheelPickerPage.clickPickButton();
		wheelPickerPage.pickColor("black");
	}
	
	@Then("the text should change to red")
	public void checkRed() {
		Assert.assertTrue(wheelPickerPage.getCurrentColor().contains("red"));
	}
	
	@Then("the text should change to green")
	public void checkGreen() {
		Assert.assertTrue(wheelPickerPage.getCurrentColor().contains("green"));
	}
	
	@Then("the text should change to blue")
	public void checkBlue() {
		Assert.assertTrue(wheelPickerPage.getCurrentColor().contains("blue"));
	}
	
	@Then("the text should change to black")
	public void checkBlack() {
		Assert.assertTrue(wheelPickerPage.getCurrentColor().contains("black"));
	}
	
}
