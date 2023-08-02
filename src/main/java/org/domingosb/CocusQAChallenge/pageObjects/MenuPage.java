package org.domingosb.CocusQAChallenge.pageObjects;

import org.domingosb.CocusQAChallenge.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MenuPage extends AndroidActions {
	
	AndroidDriver driver;
	
	public MenuPage(AndroidDriver driver) {
		
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Samples List']")
	private WebElement pageTitle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Back']")
	private WebElement backButton;
	
	public String getPageTitle() {
		
		return pageTitle.getText();
		
	}
	
	public void clickBackButton() {
		
		backButton.click();
		
	}
	
	public void clickMenuItem(String menuItem)  {
		
		scrollToText(menuItem);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"" + menuItem + "\"]")).click();
		
	}

}
