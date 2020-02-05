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

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.appModule.Search_Action;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory.DriverManager;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Product_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.ExtentReport;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.Screenshot;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Search_Test {
	private static AndroidDriver<MobileElement> driver;

	@Before
	public void startDriver() throws MalformedURLException {
		driver = br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory.DriverManager.startDriver();
	}

	ExtentTest test = ExtentReport.getTest();
	ExtentReports extent = ExtentReport.getExtent();

	@Test
	public void PesquisaValida() throws InterruptedException, IOException {
		test = extent.startTest("Pesquisa válida");
		Search_Action.pesquisaLupa(driver);
		Assert.assertTrue(Product_Page.produtosTitle(driver).getText().contains("CHROMEBOOK 14"));
		String pathScreenshot = Screenshot.capture(driver, "PesquisaValida");
		test.log(LogStatus.PASS, "PASS" + test.addScreenCapture(pathScreenshot));
	}

	@Test
	public void PesquisaInvalida() throws InterruptedException, IOException {
		test = extent.startTest("Pesquisa inválida");
		Search_Action.pesquisaLupaInvalida(driver);
		Assert.assertTrue(Product_Page.noResults(driver).getText().contains("results"));
		String pathScreenshot = Screenshot.capture(driver, "PesquisaInvalida");
		test.log(LogStatus.PASS, "PASS" + test.addScreenCapture(pathScreenshot));

	}

	@After
	public void closeDriver() {
		DriverManager.closeApp(driver);
	}
}