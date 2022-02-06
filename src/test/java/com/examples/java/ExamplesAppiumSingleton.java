package com.examples.java;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ExamplesAppiumSingleton {
	    /** Declare a static reference variable of class **/
		private static ExamplesAppiumSingleton instanceOfAppiumDriver = null;
		private AppiumDriver driver;

		/**
		 * Declaring constructor as private to restrict object creation outside of class
		 **/
		 private ExamplesAppiumSingleton() {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "android");
			capabilities.setCapability("device", "98TAY1724K");
			capabilities.setCapability("appPackage", "net.skyscanner.android.main");
			capabilities.setCapability("appActivity", "net.skyscanner.app.presentation.view.splash.SplashActivity");
			capabilities.setCapability("automationName", "UIAutomator2");
			capabilities.setCapability("noReset", "true");
			//AppiumDriver driver;
			
			
			try {
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
				//System.out.println("Driver Initiated...");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		
		}

		/**
		 * Declare a static method with return type as object of class which should check if class is already instantiated once. 
		 * @return
		 */
		public static ExamplesAppiumSingleton getInstanceOfAppiumDriverFactory() {
			if (instanceOfAppiumDriver == null) {
				System.out.println("New Driver Initilized!");
				instanceOfAppiumDriver = new ExamplesAppiumSingleton();
			}else {
				System.out.println("Driver already initialized!");
			}
				

			return instanceOfAppiumDriver;
		}

		// To get driver
		public AppiumDriver getDriver() {
			
			return driver;
		}
}
