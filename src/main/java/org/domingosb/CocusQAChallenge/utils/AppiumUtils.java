package org.domingosb.CocusQAChallenge.utils;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public abstract class AppiumUtils {

	public static AppiumDriverLocalService service;
	
	public static AppiumDriverLocalService startAppiumServer(String ipAddress,int port, String nodeJsLocation) {
		
		service = new AppiumServiceBuilder().withAppiumJS(new File(nodeJsLocation))
					.withIPAddress(ipAddress).usingPort(port).build();
		service.start();
		return service;
		
	}
	
}
