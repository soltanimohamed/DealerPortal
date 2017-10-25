package volvo.voc.dpPortal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DPPortalCustomerUpdateTest extends Parent{

	
	@BeforeClass
	public static void start() {
		init();
	}
	

	@Test
	public void updateCustomerEmail() throws InterruptedException {
		login("https://qa-voc.wirelesscar.net/voc/login", "English", "Sweden", "VCC_QA",  "volvo4life");
		customerSearch("mohamed soltani","mohamed_soltani@live.com");
		updateEmail("mohamed_soltani@live.com");
		logout();
	} 
	
	@Test
	public void updateCustomerAddress() throws InterruptedException {
		login("https://qa-voc.wirelesscar.net/voc/login", "English", "Sweden", "VCC_QA",  "volvo4life");
		customerSearch("mohamed soltani","mohamed_soltani@live.com");
		updateAddress("julaftonsgatan", 41514, "Gothenburg", "Sweden");
		logout();
	} 
	
	@Test
	public void updateCustomerPhone() throws InterruptedException {
		login("https://qa-voc.wirelesscar.net/voc/login", "English", "Sweden", "VCC_QA",  "volvo4life");
		customerSearch("mohamed soltani","mohamed_soltani@live.com");
		updateMobilePhone(700767562);
		logout();
	} 
	
	
	@AfterClass
	public static void close() {
		tearDown();
	}   
}
