package org.domingosb.CocusQAChallenge.pageObjects;

import org.domingosb.CocusQAChallenge.utils.AndroidActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends AndroidActions {
	
	AndroidDriver driver;
	
	public LoginPage(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Login']")
	private WebElement pageTitle;
	
	@AndroidFindBy(className="android.widget.ImageView")
	private WebElement logo;
	
	@AndroidFindBy(accessibility="username")
	private WebElement usernameField;
	
	@AndroidFindBy(accessibility="password")
	private WebElement passwordField;
	
	@AndroidFindBy(className="android.widget.Button")
	private WebElement loginButton;
	
	@AndroidFindBy(id="android:id/message")
	private WebElement message;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement okButton;

	public String getPageTitle() {
		return pageTitle.getText();
	}

	public boolean logoExists() {
		return logo.isDisplayed();
	}

	public void setUsernameField(String username) {
		usernameField.sendKeys(username);
		driver.hideKeyboard();
	}

	public void setPasswordField(String password) {
		passwordField.sendKeys(password);
		driver.hideKeyboard();
	}

	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void setActivity() {
		Activity activity = new Activity("com.vodqareactnative", "com.vodqareactnative.MainActivity");
		driver.startActivity(activity);
	}
	
	public void clickOkButton() {
		okButton.click();
	}
	
	public String getMessage() {
		return message.getText();
	}
	
}
