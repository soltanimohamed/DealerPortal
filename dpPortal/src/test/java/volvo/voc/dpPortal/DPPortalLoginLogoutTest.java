package volvo.voc.dpPortal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DPPortalLoginLogoutTest extends Parent{


	
	@Before
	public void start() {
		init();
	}
	
	@Test
	public void testLogin_Logout_Sweden() throws InterruptedException {
		
		loginLogout("https://qa-voc.wirelesscar.net/voc/login", "English", "Sweden", "VCC_QA",  "volvo4life");
	}
	
	@Test
	public void testLogin_Logout_USA() throws InterruptedException {
		loginLogout("https://qa-voc-na.wirelesscar.net/voc/", "English", "United States", "vcc-usa-dealer", "volvo4life");
	}
	
	@Test
	public void testLogin_Logout_China() throws InterruptedException {
		loginLogout("http://qa-voc-cn.wirelesscar.net/voc/", "English", "China", "vcc-cn-dealer", "volvo4life");
	}
	
	@After
	public void close() {
		tearDown();
	}
	
	

}
