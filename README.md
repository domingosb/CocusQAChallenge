# CocusQAChallenge

These tests were created to test the "appiumChallenge.apk" application. This was achieved by using Appium, Java 8, Cucumber and JUnit. To locate the elements of the application Appium Inspector was used. Android Studio was installed to use its development kit and to use their emulators. The code was also tested using a real mobile device, my Xiaomi Redmi Note 8.

## Steps to run

Simply clone the repository and in the terminal run "mvn clean install" and then "mvn -Dtest=testRunner test". These tests were also run multiple times through the Cucumber plugin in Eclipse.

## Cucumber report

I make available the last Cucumber report that was generated during my tests, however the report is set to be generated in "target/cucumber-reports/report.html".

## Properties

In "src/main/resources" there is a file called "data.properties" where some properties can be set related to the Appium server initialization.

## Dependencies

Appium Java Client - https://mvnrepository.com/artifact/io.appium/java-client/8.5.1
JUnit - https://mvnrepository.com/artifact/junit/junit/4.13.2
Cucumber JVM: Java - https://mvnrepository.com/artifact/io.cucumber/cucumber-java
Cucumber JVM: JUnit 4 - https://mvnrepository.com/artifact/io.cucumber/cucumber-junit
Selenium Support - https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-support/4.11.0

