package br.com.rsinet.hub.advantage_tdd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.automationFramework.Register_Test;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.automationFramework.SearchHome_Test;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.automationFramework.Search_Test;
import br.com.rsinet.hub.advantage_tdd.AdvantageMobileTDD.util.ExtentReport;

public class TestRunner {

	@RunWith(Suite.class)
	@SuiteClasses({ Register_Test.class, Search_Test.class, SearchHome_Test.class })
	public static class Runner {

		@BeforeClass
		public static void iniciaReport() {
			ExtentReport.iniciaReport();
		}

		@AfterClass
		public static void fecharReport() {
			ExtentReport.fechaReport();
		}

	}
}
