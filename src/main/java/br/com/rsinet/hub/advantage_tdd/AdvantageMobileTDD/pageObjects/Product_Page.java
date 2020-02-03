package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Product_Page {

	static AndroidDriver<MobileElement> driver;

	public static MobileElement prodFone(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"[{\"key\":\"elementId\",\"value\":\"1d887aa3-1dad-43e6-98ae-24249d2e7bb9\",\"name\":\"elementId\"},{\"key\":\"index\",\"value\":\"0\",\"name\":\"index\"},{\"key\":\"package\",\"value\":\"com.Advantage.aShopping\",\"name\":\"package\"},{\"key\":\"class\",\"value\":\"android.widget.RelativeLayout\",\"name\":\"class\"},{\"key\":\"text\",\"value\":\"\",\"name\":\"text\"},{\"key\":\"resource-id\",\"value\":\"com.Advantage.aShopping:id/RelativeLayoutProductControl\",\"name\":\"resource-id\"},{\"key\":\"checkable\",\"value\":\"false\",\"name\":\"checkable\"},{\"key\":\"checked\",\"value\":\"false\",\"name\":\"checked\"},{\"key\":\"clickable\",\"value\":\"true\",\"name\":\"clickable\"},{\"key\":\"enabled\",\"value\":\"true\",\"name\":\"enabled\"},{\"key\":\"focusable\",\"value\":\"false\",\"name\":\"focusable\"},{\"key\":\"focused\",\"value\":\"false\",\"name\":\"focused\"},{\"key\":\"long-clickable\",\"value\":\"false\",\"name\":\"long-clickable\"},{\"key\":\"password\",\"value\":\"false\",\"name\":\"password\"},{\"key\":\"scrollable\",\"value\":\"false\",\"name\":\"scrollable\"},{\"key\":\"selected\",\"value\":\"false\",\"name\":\"selected\"},{\"key\":\"bounds\",\"value\":\"[0,349][540,1017]\",\"name\":\"bounds\"},{\"key\":\"displayed\",\"value\":\"true\",\"name\":\"displayed\"}]");
	}
	

}