package org.domingosb.CocusQAChallenge.pageObjects;

import org.domingosb.CocusQAChallenge.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LongPressPage extends AndroidActions {
	
	AndroidDriver driver;
	
	public LongPressPage(AndroidDriver driver) {
		
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Long Press Demo']")
	private WebElement pageTitle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Back']")
	private WebElement backButton;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"longpress\"]/android.widget.TextView")
	private WebElement longPressButton;
	
	@AndroidFindBy(id="android:id/message")
	private WebElement message;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement okButton;
	
	public String getPageTitle() {
		return pageTitle.getText();
		
	}
	
	public void clickBackButton() {
		backButton.click();
		
	}
	
	public void longPress() {
		longPressAction(longPressButton);
	}
	
	public String getMessage() {
		return message.getText();
	}
	
	public void clickOk() {
		okButton.click();
	}
}
