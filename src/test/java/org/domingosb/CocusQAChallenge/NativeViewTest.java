package org.domingosb.CocusQAChallenge;

import org.domingosb.CocusQAChallenge.pageObjects.LoginPage;
import org.domingosb.CocusQAChallenge.pageObjects.MenuPage;
import org.domingosb.CocusQAChallenge.pageObjects.NativeViewPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;

public class NativeViewTest {
	
	MenuPage menuPage;
	NativeViewPage nativeViewPage;
	
	@Given("I am on the Native View screen")
	public void setUpPage() {
		LoginPage loginPage = new LoginPage(BaseTest.driver);
		loginPage.setActivity();
		loginPage.clickLoginButton();
		menuPage = new MenuPage(BaseTest.driver);
		menuPage.clickMenuItem("Native View");
		nativeViewPage = new NativeViewPage(BaseTest.driver);
		Assert.assertEquals("Native View Demo", nativeViewPage.getPageTitle());
	}
	
	@Then("I should see \"View 1\" on the screen")
	public void checkView1() {
		Assert.assertEquals("Hello World, I'm View one ", nativeViewPage.getViewOne());
	}
	
	@And("I should see \"View 2\" on the screen")
	public void checkView2() {
		Assert.assertEquals("Hello World, I'm View two ", nativeViewPage.getViewTwo());
	}
	
	@And("I should see \"View 3\" on the screen")
	public void checkView3() {
		Assert.assertEquals("Hello World, I'm View three ", nativeViewPage.getViewThree());
	}
	
}
