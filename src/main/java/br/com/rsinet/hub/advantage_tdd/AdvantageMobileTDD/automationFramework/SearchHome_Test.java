package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.automationFramework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory.DriverManager;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Home_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Product_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.ExtentReport;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.Screenshot;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;

public class SearchHome_Test {
	private static AndroidDriver<MobileElement> driver;
	static TouchAction action;

	@Before
	public void startDriver() throws MalformedURLException {
		driver = br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory.DriverManager.startDriver();
	}

	ExtentTest test = ExtentReport.getTest();
	ExtentReports extent = ExtentReport.getExtent();

	@Test
	public void PesquisaHomeValido() throws InterruptedException, IOException {
		test = extent.startTest("Pesquisa Home válida");
		action = new TouchAction(driver);
		
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Home_Page.categoriaFone(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Product_Page.prodFone(driver).click();

		Assert.assertTrue(Product_Page.produtosTitle(driver).getText().contains("BEATS STUDIO"));
		String pathScreenshot = Screenshot.capture(driver, "PesquisaClickValido");
		test.log(LogStatus.PASS, "PASS" + test.addScreenCapture(pathScreenshot));
	}

	@Test
	public void PesquisaHomeInvalido() throws InterruptedException, IOException {
		test = extent.startTest("Pesquisa Home inválida");
		action = new TouchAction(driver);

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
		Home_Page.categoriaFone(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Product_Page.filter(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Product_Page.bx_compatibility(driver).click();
		Product_Page.comp_option(driver).click();
		Product_Page.bx_compatibility(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Product_Page.bx_conector(driver).click();
		Product_Page.conector_option(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Product_Page.bx_color(driver).click();
		Product_Page.color_option(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Product_Page.bx_apply(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
		Assert.assertTrue(Product_Page.noResults(driver).getText().contains("results"));
		String pathScreenshot = Screenshot.capture(driver, "PesquisaClickInvalido");
		test.log(LogStatus.PASS, "PASS" + test.addScreenCapture(pathScreenshot));
	}

	@After
	public void closeDriver() {
		DriverManager.closeApp(driver);
	}

}