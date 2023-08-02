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

public class DragAndDropPage extends AndroidActions {
	
	AndroidDriver driver;
	
	public DragAndDropPage(AndroidDriver driver) {
		
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Drag & Drop']")
	private WebElement pageTitle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Back']")
	private WebElement backButton;
	
	@AndroidFindBy(accessibility="dropzone")
	private WebElement dropzone;
	
	@AndroidFindBy(accessibility="dragMe")
	private WebElement dragMe;
	
	@AndroidFindBy(accessibility="success")
	private WebElement successMessage;
	
	public String getPageTitle() {
		return pageTitle.getText();
		
	}
	
	public void clickBackButton() {
		backButton.click();
		
	}
	
	public void dragAndDrop() {
		dragAndDrop(dropzone, dragMe);
	}
	
	public String getSuccessMessage() {
		return successMessage.getText();
	}
}
