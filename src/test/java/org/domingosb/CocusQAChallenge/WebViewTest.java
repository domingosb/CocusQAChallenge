package org.domingosb.CocusQAChallenge;

import org.domingosb.CocusQAChallenge.pageObjects.LoginPage;
import org.domingosb.CocusQAChallenge.pageObjects.MenuPage;
import org.domingosb.CocusQAChallenge.pageObjects.WebViewPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class WebViewTest {
	
	MenuPage menuPage;
	WebViewPage webViewPage;
	
	@Given("I am on the menu page")
	public void setUpPage() {
		LoginPage loginPage = new LoginPage(BaseTest.driver);
		loginPage.setActivity();
		loginPage.clickLoginButton();
		menuPage = new MenuPage(BaseTest.driver);
		Assert.assertEquals("Samples List", menuPage.getPageTitle());
	}
	
	@When("I open the web view page")
	public void doubleTap() {
		menuPage.clickMenuItem("Web View");
		webViewPage = new WebViewPage(BaseTest.driver);
		Assert.assertEquals("Webview", webViewPage.getPageTitle());
	}
	
	@Then("the web page \"Hacker News\" open")
	public void checkWebPageTitle() {
		Assert.assertEquals("Hacker News", webViewPage.getSiteTitle());
	}
	
}
