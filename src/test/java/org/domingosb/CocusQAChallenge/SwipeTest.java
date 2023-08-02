package org.domingosb.CocusQAChallenge;

import org.domingosb.CocusQAChallenge.pageObjects.CarouselPage;
import org.domingosb.CocusQAChallenge.pageObjects.LoginPage;
import org.domingosb.CocusQAChallenge.pageObjects.MenuPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class SwipeTest {
	
	MenuPage menuPage;
	CarouselPage carouselPage;
	
	@Given("I am on the swipe page")
	public void setUpPage() {
		LoginPage loginPage = new LoginPage(BaseTest.driver);
		loginPage.setActivity();
		loginPage.clickLoginButton();
		menuPage = new MenuPage(BaseTest.driver);
		menuPage.clickMenuItem("Carousel");
		carouselPage = new CarouselPage(BaseTest.driver);
		Assert.assertEquals("Carousel - Swipe left/right", carouselPage.getPageTitle());
	}
	
	@When("I swipe left from element 1")
	public void swipeLeftElement1() {
		Assert.assertEquals("1", carouselPage.getSwipeButtonText());
		carouselPage.swipe("left");
	}
	
	@When("I swipe right from element 3")
	public void swipeRightElement3() {
		Assert.assertEquals("1", carouselPage.getSwipeButtonText());
		carouselPage.swipe("right");
		Assert.assertEquals("3", carouselPage.getSwipeButtonText());
		carouselPage.swipe("right");
	}
	
	
	@And("I swipe left from element 2")
	public void swipeLeftElement2() {
		Assert.assertEquals("2", carouselPage.getSwipeButtonText());
		carouselPage.swipe("left");
	}
	
	@And("I swipe right from element 2")
	public void swipeRightElement2() {
		Assert.assertEquals("2", carouselPage.getSwipeButtonText());
		carouselPage.swipe("right");
	}
	
	@Then("I should see element 3")
	public void checkElement3() {
		Assert.assertEquals("3", carouselPage.getSwipeButtonText());
	}
	
	@Then("I should see element 1")
	public void checkElement1() {
		Assert.assertEquals("1", carouselPage.getSwipeButtonText());
	}
	
}
