package org.domingosb.CocusQAChallenge.pageObjects;

import org.domingosb.CocusQAChallenge.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CarouselPage extends AndroidActions {
	
	AndroidDriver driver;
	
	public CarouselPage(AndroidDriver driver) {
		
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Carousel - Swipe left/right']")
	private WebElement pageTitle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Back']")
	private WebElement backButton;
	
	@AndroidFindBy(xpath="//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement swipeButton;
	
	@AndroidFindBy(xpath="//android.widget.HorizontalScrollView//android.view.ViewGroup//android.view.ViewGroup//android.view.ViewGroup//android.widget.TextView")
	private WebElement swipeButtonText;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[1]/android.widget.TextView[contains(@text,'/')]")
	private WebElement number;
	
	public String getPageTitle() {
		
		return pageTitle.getText();
		
	}
	
	public void clickBackButton() {
		
		backButton.click();
		
	}
	
	public String getSwipeButtonText() {
		
		return swipeButtonText.getText();
		
	}
	
	public String getNumber() {
		
		return number.getText();
		
	}
	
	public void swipe(String direction) {
		swipeAction(swipeButton, direction);
	}
	
}
