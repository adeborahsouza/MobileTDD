package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.appModule;

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Home_Page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchHome_Action {

	public static void pesquisaLupa(AndroidDriver<MobileElement> driver) {
		Home_Page.bxPesquisa(driver).sendKeys("HP Chromebook 14 G1(ES)");
	}
}
