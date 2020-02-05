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

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.appModule.SearchClick_Action;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory.DriverManager;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Product_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.ExtentReport;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.Screenshot;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchHome_Test {
	private static AndroidDriver<MobileElement> driver;

	@Before
	public void startDriver() throws MalformedURLException {
		driver = br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory.DriverManager.startDriver();
	}

	ExtentTest test = ExtentReport.getTest();
	ExtentReports extent = ExtentReport.getExtent();

	@Test
	public void PesquisaHomeValido() throws InterruptedException, IOException {
		test = extent.startTest("Pesquisa Home válida");
		SearchClick_Action.pesquisa(driver);
		Assert.assertTrue(Product_Page.produtosTitle(driver).getText().contains("BEATS STUDIO"));
		String pathScreenshot = Screenshot.capture(driver, "PesquisaClickValido");
		test.log(LogStatus.PASS, "PASS" + test.addScreenCapture(pathScreenshot));
	}

	@After
	public void closeDriver() {
		DriverManager.closeApp(driver);
	}

}