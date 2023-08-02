package org.domingosb.CocusQAChallenge;

import org.domingosb.CocusQAChallenge.pageObjects.LoginPage;
import org.domingosb.CocusQAChallenge.pageObjects.MenuPage;
import org.domingosb.CocusQAChallenge.pageObjects.SliderPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class SliderTest {
	
	MenuPage menuPage;
	SliderPage sliderPage;
	
	@Given("I am on the slider screen")
	public void setUpPage() {
		LoginPage loginPage = new LoginPage(BaseTest.driver);
		loginPage.setActivity();
		loginPage.clickLoginButton();
		menuPage = new MenuPage(BaseTest.driver);
		menuPage.clickMenuItem("Slider");
		sliderPage = new SliderPage(BaseTest.driver);
		Assert.assertEquals("Slider", sliderPage.getPageTitle());
	}
	
	@When("I drag the slider to the middle")
	public void slideToMiddle() {
		sliderPage.moveSlider(0.49);
	}
	
	@Then("the slider value should be updated to \"50\"")
	public void checkSlideInTheMiddle() {
		Assert.assertEquals("50.0", sliderPage.getSliderValue());
	}
	
	@When("I drag the slider to the left")
	public void slideToLeft() {
		sliderPage.moveSlider(0.49);
		sliderPage.moveSlider(0);
	}
	
	@Then("the slider value should be updated to \"0\"")
	public void checkSlideInTheLeft() {
		Assert.assertEquals("0.0", sliderPage.getSliderValue());
	}
	
	@When("I drag the slider to the right")
	public void slideToRight() {
		sliderPage.moveSlider(1);
	}
	
	@Then("the slider value should be updated to \"128\"")
	public void checkSlideInTheRight() {
		Assert.assertEquals("128.0", sliderPage.getSliderValue());
	}
	
	
	
}
