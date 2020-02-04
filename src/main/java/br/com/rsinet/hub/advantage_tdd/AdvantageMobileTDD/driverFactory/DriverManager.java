package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> startDriver() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.Advantage.aShopping");
		capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

		driver = new AndroidDriver<MobileElement>(url, capabilities);

		return driver;

	}

	public static void closeApp(WebDriver driver) {
		if (driver != null)

			driver.close();
		driver.quit();

	}
}