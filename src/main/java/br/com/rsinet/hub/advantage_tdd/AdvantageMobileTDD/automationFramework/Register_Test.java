package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.automationFramework;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.appModule.Register_Action;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory.DriverManager;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Home_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Register_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.Constant;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.ExtentReport;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.Screenshot;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Register_Test {
	private static AndroidDriver<MobileElement> driver;

	@Before
	public void startDriver() throws MalformedURLException {
		driver = br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory.DriverManager.startDriver();
	}

	ExtentTest test = ExtentReport.getTest();
	ExtentReports extent = ExtentReport.getExtent();

	@Test
	public void RegisterValido() throws InterruptedException, IOException {
		test = extent.startTest("Registro válido");
		Register_Action.registrar(driver);
		Assert.assertTrue(Home_Page.usuarioCad(driver).getText().contains(Constant.user));
		String pathScreenshot = Screenshot.capture(driver, "RegisterValidO");
		test.log(LogStatus.PASS, "PASS" + test.addScreenCapture(pathScreenshot));
	}

	@Test
	public void RegisterInvalido() throws InterruptedException, IOException {
		test = extent.startTest("Registro inválido");
		Register_Action.naoRegistrar(driver);
		Assert.assertFalse(Register_Page.bxAgree(driver).isSelected());
		String pathScreenshot = Screenshot.capture(driver, "RegisterInvalido");
		test.log(LogStatus.PASS, "PASS" + test.addScreenCapture(pathScreenshot));
	}

	@After
	public void closeDriver() {
		DriverManager.closeApp(driver);
	}
}