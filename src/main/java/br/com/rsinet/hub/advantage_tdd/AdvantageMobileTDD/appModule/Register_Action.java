package br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.appModule;

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Home_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.pageObjects.Register_Page;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.Constant;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Register_Action {

	public static void registrar(AndroidDriver<MobileElement> driver) throws InterruptedException {
		Thread.sleep(3000);
		Home_Page.menuIcon(driver).click();

		Home_Page.loginIcon(driver).click();

		Home_Page.registerIcon(driver).click();

		Register_Page.bxUsername(driver).sendKeys(Constant.user);

		Register_Page.bxEmail(driver).sendKeys(Constant.email);

		Register_Page.bxPassword(driver).sendKeys(Constant.password);

		Register_Page.bxConfPassword(driver).sendKeys(Constant.confPassword);

		Register_Page.bxFirstName(driver).sendKeys(Constant.name);

		Register_Page.bxLastName(driver).sendKeys(Constant.lastname);

		Register_Page.bxPhoneNumber(driver).sendKeys(Constant.phone);

		Register_Page.country(driver).sendKeys(Constant.country);

		Register_Page.bxState(driver).sendKeys(Constant.city);

		Register_Page.bxAdress(driver).sendKeys(Constant.address);

		Register_Page.bxCity(driver).sendKeys(Constant.state);

		Register_Page.bxCep(driver).sendKeys(Constant.postalcode);

		Register_Page.btnConfRegister(driver).click();

	}
}
