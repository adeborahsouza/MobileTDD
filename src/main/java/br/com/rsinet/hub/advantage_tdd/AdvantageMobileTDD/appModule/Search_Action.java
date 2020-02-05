package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.appModule;

import java.time.Duration;

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Home_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Product_Page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;

public class Search_Action {
	static TouchAction action;

	public static void pesquisaLupa(AndroidDriver<MobileElement> driver) {
		action = new TouchAction(driver);

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Home_Page.bxLupa(driver).click();
		Home_Page.bxPesquisa(driver).sendKeys("HP Chromebook 14 G1(ES)");
		Home_Page.bxLupa(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Product_Page.prodNotebook(driver).click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
	}

	public static void pesquisaLupaInvalida(AndroidDriver<MobileElement> driver) {
		action = new TouchAction(driver);

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
		Home_Page.bxLupa(driver).click();
		Home_Page.bxPesquisa(driver).sendKeys("Televisão");
		Home_Page.bxLupa(driver).click();
	}
}