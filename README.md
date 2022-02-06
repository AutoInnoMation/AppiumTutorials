# AppiumTutorials
Mobile Automation using Appium

What is Singleton Design Pattern?
When we develop a class in such a way that it can have only instance(object) at any time, is called Singleton design pattern. It is very useful when you need to use same object of a class across all classes or framework(automation framework). Singleton class must return the same instance, if it is instantiated again and again.

Steps to implement singleton design pattern
1. Declare constructor of class as private so that no-one instantiate class outside of it.
2. Declare a static reference variable of class.
3. Declare a static method with return type as object of class which should check if class is already instantiated once.


Use of singleton desing pattern for automation
1. How to keep track of same driver instance throughout the execution
2. Database connectivity.
3. Loading external files like properties, excel etc once rather than loading again and again.
4. Logger.

For Example Here I have used Appium driver.
