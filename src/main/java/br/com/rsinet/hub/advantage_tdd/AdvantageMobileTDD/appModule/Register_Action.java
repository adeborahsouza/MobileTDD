package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.appModule;

import java.time.Duration;

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Home_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Register_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.Constant;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;

public class Register_Action {

	static TouchAction action;

	public static void registrar(AndroidDriver<MobileElement> driver) throws InterruptedException {
		action = new TouchAction(driver);

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).perform();
		Home_Page.menuIcon(driver).click();

		Home_Page.loginIcon(driver).click();

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).perform();
		Home_Page.registerIcon(driver).click();

		Register_Page.bxUsername(driver).sendKeys(Constant.user);

		Register_Page.bxEmail(driver).sendKeys(Constant.email);

		Register_Page.bxPassword(driver).sendKeys(Constant.password);

		Register_Page.bxConfPassword(driver).sendKeys(Constant.confPassword);

		Register_Page.bxFirstName(driver).sendKeys(Constant.name);

		Register_Page.bxLastName(driver).sendKeys(Constant.lastname);
		Register_Page.bxLastName(driver).click();

		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		Register_Page.country(driver).click();

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Brazil" + "\").instance(0))")
				.click();

		Register_Page.bxPhoneNumber(driver).sendKeys(Constant.phone);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Register_Page.bxState(driver).click();
		Register_Page.bxState(driver).sendKeys(Constant.state);

		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		Register_Page.bxAdress(driver).sendKeys(Constant.address);
		Register_Page.bxAdress(driver).click();

		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		Register_Page.bxCep(driver).sendKeys(Constant.postalcode);

		Register_Page.bxCity(driver).click();
		Register_Page.bxCity(driver).sendKeys(Constant.city);

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "REGISTER" + "\").instance(0))")
				.click();
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
		Home_Page.menuIcon(driver).click();
		

	}

	public static void naoRegistrar(AndroidDriver<MobileElement> driver) throws InterruptedException {
		action = new TouchAction(driver);

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).perform();
		Home_Page.menuIcon(driver).click();

//		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
		Home_Page.loginIcon(driver).click();

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).perform();
		Home_Page.registerIcon(driver).click();

		Register_Page.bxUsername(driver).sendKeys(Constant.user);

		Register_Page.bxEmail(driver).sendKeys(Constant.email);

		Register_Page.bxPassword(driver).sendKeys(Constant.password);

		Register_Page.bxConfPassword(driver).sendKeys(Constant.confPassword);

		Register_Page.bxFirstName(driver).sendKeys(Constant.name);

		Register_Page.bxLastName(driver).sendKeys(Constant.lastname);
		Register_Page.bxLastName(driver).click();

		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		Register_Page.country(driver).click();

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Brazil" + "\").instance(0))")
				.click();

		Register_Page.bxPhoneNumber(driver).sendKeys(Constant.phone);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Register_Page.bxState(driver).click();
		Register_Page.bxState(driver).sendKeys(Constant.state);

		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		Register_Page.bxAdress(driver).sendKeys(Constant.address);
		Register_Page.bxAdress(driver).click();

		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		Register_Page.bxCep(driver).sendKeys(Constant.postalcode);

		Register_Page.bxCity(driver).click();
		Register_Page.bxCity(driver).sendKeys(Constant.city);

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "REGISTER" + "\").instance(0))")
				.click();

		Register_Page.bxAgree(driver).click();
		
		

	}
}
