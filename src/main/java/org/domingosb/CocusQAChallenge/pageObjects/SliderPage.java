package org.domingosb.CocusQAChallenge.pageObjects;

import org.domingosb.CocusQAChallenge.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class SliderPage extends AndroidActions {
	
	AndroidDriver driver;
	
	public SliderPage(AndroidDriver driver) {
		
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Slider']")
	private WebElement pageTitle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Back']")
	private WebElement backButton;
	
	@AndroidFindBy(accessibility="slider")
	private WebElement slider;
	
	
	public String getPageTitle() {
		
		return pageTitle.getText();
		
	}
	
	public void clickBackButton() {
		
		backButton.click();
		
	}
	
	public void moveSlider(double d) {
		moveSlider(d, slider);
	}
	
	public String getSliderValue() {
		return slider.getText();
	}
}
