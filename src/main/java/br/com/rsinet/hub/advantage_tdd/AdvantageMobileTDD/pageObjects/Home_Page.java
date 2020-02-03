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
				"[{\"key\":\"elementId\",\"value\":\"f9b60a58-5ebd-4d65-8ac8-0ee02a447b65\",\"name\":\"elementId\"},{\"key\":\"index\",\"value\":\"0\",\"name\":\"index\"},{\"key\":\"package\",\"value\":\"com.Advantage.aShopping\",\"name\":\"package\"},{\"key\":\"class\",\"value\":\"android.widget.ImageView\",\"name\":\"class\"},{\"key\":\"text\",\"value\":\"\",\"name\":\"text\"},{\"key\":\"resource-id\",\"value\":\"com.Advantage.aShopping:id/imageViewCategory\",\"name\":\"resource-id\"},{\"key\":\"checkable\",\"value\":\"false\",\"name\":\"checkable\"},{\"key\":\"checked\",\"value\":\"false\",\"name\":\"checked\"},{\"key\":\"clickable\",\"value\":\"true\",\"name\":\"clickable\"},{\"key\":\"enabled\",\"value\":\"true\",\"name\":\"enabled\"},{\"key\":\"focusable\",\"value\":\"true\",\"name\":\"focusable\"},{\"key\":\"focused\",\"value\":\"false\",\"name\":\"focused\"},{\"key\":\"long-clickable\",\"value\":\"false\",\"name\":\"long-clickable\"},{\"key\":\"password\",\"value\":\"false\",\"name\":\"password\"},{\"key\":\"scrollable\",\"value\":\"false\",\"name\":\"scrollable\"},{\"key\":\"selected\",\"value\":\"false\",\"name\":\"selected\"},{\"key\":\"bounds\",\"value\":\"[0,788][1080,1234]\",\"name\":\"bounds\"},{\"key\":\"displayed\",\"value\":\"true\",\"name\":\"displayed\"}]");
	}
	
	public static MobileElement bxPesquisa(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/editTextSearch");

	}
	
	
	
	
}
