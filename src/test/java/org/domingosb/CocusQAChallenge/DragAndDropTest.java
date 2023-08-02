package org.domingosb.CocusQAChallenge;

import org.domingosb.CocusQAChallenge.pageObjects.DragAndDropPage;
import org.domingosb.CocusQAChallenge.pageObjects.LoginPage;
import org.domingosb.CocusQAChallenge.pageObjects.MenuPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class DragAndDropTest {
	
	MenuPage menuPage;
	DragAndDropPage dragAndDropPage;
	
	@Given("I am on the drag and drop page")
	public void setUpPage() {
		LoginPage loginPage = new LoginPage(BaseTest.driver);
		loginPage.setActivity();
		loginPage.clickLoginButton();
		menuPage = new MenuPage(BaseTest.driver);
		menuPage.clickMenuItem("Drag & Drop");
		dragAndDropPage = new DragAndDropPage(BaseTest.driver);
		Assert.assertEquals("Drag & Drop", dragAndDropPage.getPageTitle());
	}
	
	@When("I drag element \"Drag Me!\" and drop it onto element \"Drop here!\"")
	public void dragAndDrop() {
		dragAndDropPage.dragAndDrop();
	}
	
	@Then("the element is dropped")
	public void checkSuccessMessage() {
		Assert.assertEquals("Circle dropped", dragAndDropPage.getSuccessMessage());
	}
	
}
