package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.automationFramework;

import java.io.IOException;
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
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.Constant;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.ExcelUtils;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.ExtentReport;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.Screenshot;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;

public class Search_Test {
	private static AndroidDriver<MobileElement> driver;
	static TouchAction action;

	@Before
	public void startDriver() throws Exception {
		driver = br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.driverFactory.DriverManager.startDriver();
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
	}

	ExtentTest test = ExtentReport.getTest();
	ExtentReports extent = ExtentReport.getExtent();

	@Test
	public void PesquisaValida() throws Exception {
		test = extent.startTest("Pesquisa válida");
		action = new TouchAction(driver);

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Home_Page.bxLupa(driver).click();
		Home_Page.bxPesquisa(driver).sendKeys(ExcelUtils.getCellData(1, 0));
		Home_Page.bxLupa(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Product_Page.prodNotebook(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();

		Assert.assertTrue(Product_Page.produtosTitle(driver).getText().contains("CHROMEBOOK"));
		String pathScreenshot = Screenshot.capture(driver, "PesquisaValida");
		test.log(LogStatus.PASS, "PASS" + test.addScreenCapture(pathScreenshot));
	}

	@Test
	public void PesquisaInvalida() throws InterruptedException, IOException {
		test = extent.startTest("Pesquisa inválida");
		action = new TouchAction(driver);
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Home_Page.bxLupa(driver).click();
		Home_Page.bxPesquisa(driver).sendKeys("Televisão");
		Home_Page.bxLupa(driver).click();
		Assert.assertTrue(Product_Page.noResults(driver).getText().contains("results"));
		String pathScreenshot = Screenshot.capture(driver, "PesquisaInvalida");
		test.log(LogStatus.PASS, "PASS" + test.addScreenCapture(pathScreenshot));

	}

	@After
	public void closeDriver() {
		DriverManager.closeApp(driver);
	}
}