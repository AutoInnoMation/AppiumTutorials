package com.examples.java;

import io.appium.java_client.AppiumDriver;

public class RunnerClass {
	public static void main(String[] args) {
		ExamplesAppiumSingleton examples  = ExamplesAppiumSingleton.getInstanceOfAppiumDriverFactory();
		
		AppiumDriver driver = examples.getDriver();
		
		ExamplesAppiumSingleton examples1  = ExamplesAppiumSingleton.getInstanceOfAppiumDriverFactory();
		AppiumDriver driver1 = examples1.getDriver();
		
		
		
		driver.quit();
		
	}
}
