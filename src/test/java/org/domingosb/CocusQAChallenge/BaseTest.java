package org.domingosb.CocusQAChallenge;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.domingosb.CocusQAChallenge.utils.AppiumUtils;
import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class BaseTest extends AppiumUtils {
	
	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;
	
	@BeforeAll
	public static void ConfigureAppium() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//org//domingosb//CocusQAChallenge//resources//data.properties");
		String ipAddress = System.getProperty("ipAddress") != null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
		prop.load(fis);
		String port = prop.getProperty("port");
			
		service = startAppiumServer(ipAddress, Integer.parseInt(port));
								
		UiAutomator2Options options = new UiAutomator2Options();
		//options.setDeviceName(prop.getProperty("AndroidDeviceNames")); //Emulator
		options.setDeviceName("Android Device"); // Real Device		
		options.setApp(System.getProperty("user.dir") + "\\src\\test\\resources\\appiumChallenge.apk");
		options.setAutoGrantPermissions(true);
					
		driver = new AndroidDriver(service.getUrl(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Handle permissions
		//driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		
		// Handle old Android version alert
		driver.findElement(By.id("android:id/button1")).click();
		
	}
	
	@AfterAll
	public static void tearDown() {
		
		driver.quit();
        service.stop();
        
	}

}
