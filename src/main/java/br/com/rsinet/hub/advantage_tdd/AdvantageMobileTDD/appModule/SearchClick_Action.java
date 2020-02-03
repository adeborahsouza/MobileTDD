package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.appModule;

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Home_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Product_Page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchClick_Action {

	public static void pesquisa(AndroidDriver<MobileElement> driver) {
		Home_Page.categoriaFone(driver).click();
		Product_Page.prodFone(driver).click();
	}


}
