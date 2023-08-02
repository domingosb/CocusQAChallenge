package org.domingosb.CocusQAChallenge.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AndroidActions extends AppiumUtils {
	
	AndroidDriver driver;
	
	public AndroidActions(AndroidDriver driver) {
		
		this.driver = driver;
	}
	
	public void longPressAction(WebElement ele) {
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	
	public void doubleClickAction(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()
		));
	}
	

	public void scrollToEndAction() {
		boolean canScrollMore;
		do
		{
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			    
			));
		}while(canScrollMore);
	}
	
	public void scrollToText(String text) {
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));"));
	
	}
	
	
	public void swipeAction(WebElement ele, String direction) {
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 1
			));
	}
	
	public void moveSlider(double d, WebElement slider) {
		int start = slider.getLocation().getX();
        int y = slider.getLocation().getY();
        int end = start + slider.getSize().getWidth();
        
        TouchAction action = new TouchAction(driver);
        
        int moveTo = (int) (end * d);
        
        action.longPress(PointOption.point(start, y))
        	  .moveTo(PointOption.point(moveTo, y))
        	  .release().perform();
	}
	
	public void dragAndDrop(WebElement dropzone, WebElement dragMe) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) dragMe).getId(),
			    "endX", dropzone.getRect().getPoint().getX() + 500,
			    "endY", dropzone.getRect().getPoint().getY() + 100
			));
	}
}
