package org.domingosb.CocusQAChallenge.pageObjects;

import org.domingosb.CocusQAChallenge.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NativeViewPage extends AndroidActions {
	
	AndroidDriver driver;
	
	public NativeViewPage(AndroidDriver driver) {
		
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Native View Demo']")
	private WebElement pageTitle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Back']")
	private WebElement backButton;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@content-desc=\"textView\"])[1]")
	private WebElement viewOne;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@content-desc=\"textView\"])[2]")
	private WebElement viewTwo;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@content-desc=\"textView\"])[3]")
	private WebElement viewThree;
	
	public String getPageTitle() {
		
		return pageTitle.getText();
		
	}
	
	public void clickBackButton() {
		
		backButton.click();
		
	}
	
	public String getViewOne() {
		return viewOne.getText();
	}
	
	public String getViewTwo() {
		return viewTwo.getText();
	}
	
	public String getViewThree() {
		return viewThree.getText();
	}
}
