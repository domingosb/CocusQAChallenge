package org.domingosb.CocusQAChallenge;

import org.domingosb.CocusQAChallenge.pageObjects.LoginPage;
import org.domingosb.CocusQAChallenge.pageObjects.MenuPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class LoginTest {
	
	LoginPage loginPage;
	MenuPage menuPage;
	
	@Given("I am on the login screen")
	public void setUpPage() {
		loginPage = new LoginPage(BaseTest.driver);
		loginPage.setActivity();
	}
	
	@When("I enter a valid username and password")
	public void fillLoginInfo() {
		loginPage.setUsernameField("admin");
		loginPage.setPasswordField("admin");
	}
	
	@And("I click the login button")
	public void clickLoginButton() {
		loginPage.clickLoginButton();
	}
	
	@Then("I should be redirected to the menu screen")
	public void checkCurrentPageIsMenu() {
		menuPage = new MenuPage(BaseTest.driver);
		Assert.assertEquals("Samples List", menuPage.getPageTitle());
	}
	
	@When("I enter an invalid username or password")
	public void fillWrongLoginInfo() {
		loginPage.setUsernameField("user");
		loginPage.setPasswordField("wrongpassword");
	}
	
	@Then("I should see an alert with an error message")
	public void checkErrorMessage() {
		Assert.assertEquals("Invalid  Credentials", loginPage.getMessage());
		loginPage.clickOkButton();
	}
	
}
