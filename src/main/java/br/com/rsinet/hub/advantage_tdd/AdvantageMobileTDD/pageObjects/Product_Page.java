package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Product_Page {

	static AndroidDriver<MobileElement> driver;

	public static MobileElement prodFone(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]");
	}

	public static MobileElement prodNotebook(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/RelativeLayoutProductControl");
	}

	public static MobileElement produtosTitle(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewProductName");
	}

	public static MobileElement noResults(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewNoProductsToShow");
	}

}
