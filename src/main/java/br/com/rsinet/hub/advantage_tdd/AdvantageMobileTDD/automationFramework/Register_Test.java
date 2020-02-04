package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.automationFramework;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.appModule.Register_Action;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Register_Test {
	private static AndroidDriver<MobileElement> driver;

	@BeforeClass
	public static void startDriver() throws MalformedURLException {
		driver = br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory.DriverManager.startDriver();
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