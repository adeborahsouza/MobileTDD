package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.automationFramework;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.appModule.Register_Action;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Register_Test {
	private static AndroidDriver<MobileElement> driver;

	@BeforeClass
	public static void startDriver() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.Advantage.aShopping");
		capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@Test
	public void RegisterValid() throws InterruptedException {
		Register_Action.registrar(driver);
	}

	@AfterClass
	public static void closeDriver() {
		driver.close();
	}
}