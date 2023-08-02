package org.domingosb.CocusQAChallenge.pageObjects;

import org.domingosb.CocusQAChallenge.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WheelPickerPage extends AndroidActions {
	
	AndroidDriver driver;
	
	public WheelPickerPage(AndroidDriver driver) {
		
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Wheel Picker Demo']")
	private WebElement pageTitle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Back']")
	private WebElement backButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Current Color:')]")
	private WebElement currentColor;
	
	@AndroidFindBy(className="android.widget.Spinner")
	private WebElement pickButton;
	
	public String getPageTitle() {
		return pageTitle.getText();
		
	}
	
	public void clickBackButton() {
		backButton.click();
		
	}
	
	public String getCurrentColor() {
		System.out.println(currentColor.getCssValue("color"));
		return currentColor.getText();
	}
	
	public void clickPickButton() {
		pickButton.click();
	}
	
	public void pickColor(String color) {
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='" + color + "']")).click();
	}
	
}
