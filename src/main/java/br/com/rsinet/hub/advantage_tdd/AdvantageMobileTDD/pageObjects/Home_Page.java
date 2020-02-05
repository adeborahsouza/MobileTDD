package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Home_Page {

	static AndroidDriver<MobileElement> driver;

	public static MobileElement menuIcon(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewMenu");

	}

	public static MobileElement loginIcon(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/linearLayoutLogin");

	}

	public static MobileElement registerIcon(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewDontHaveAnAccount");

	}

	public static MobileElement categoriaFone(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView");
	}

	public static MobileElement bxPesquisa(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/editTextSearch");

	}

	public static MobileElement bxLupa(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewSearch");
	}

	public static MobileElement usuarioCad(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewMenuUser");
	}

}
