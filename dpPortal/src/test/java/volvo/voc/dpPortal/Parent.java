package volvo.voc.dpPortal;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parent {
 
	static WebDriver driver;
	int language_id = 0;
	public static void init() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohamed.soltani\\Documents\\gecko\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	} 
	public void login(String url, String language, String country, String dealer_id, String dealer_password) throws InterruptedException {
		driver.get(url);
		if (language.equals("English")) {
			language_id = 1;
		}
		else if(language.equals("Svenska")) {
			language_id = 13;
		}
		driver.findElement(By.id("login-language-selector")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='login-language-selector']/ul/li[" +language_id+ "]")).click();
        driver.findElement(By.id("select2-chosen-1")).click();
        Thread.sleep(2000);
        WebElement country_element = driver.findElement(By.xpath(".//*[@class ='select2-result-label'][contains(text(), '" +country+ "')]"));
        country_element.click();
        driver.findElement(By.id("input-username")).sendKeys(dealer_id);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(dealer_password);
        driver.findElement(By.id("signInButton")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//*[@id='page-wrapper']/div[4]/div[1]/div/h1[1]")).getText();
        assertEquals("Welcome!", text);
	}
	
	public void customerSearch(String name, String email) throws InterruptedException {
		
		driver.findElement(By.id("customerSearchRadio")).click();
		driver.findElement(By.id("email")).sendKeys("mohamed_soltani@live.com");
		driver.findElement(By.id("search-customer-btn")).click();
		Thread.sleep(2000);
		WebElement volvo_id = driver.findElement(By.xpath("//*[@id='vehicle-name']/div/div[2]/a/div[2]/div[2]/p[2]"));
		assertEquals(email, volvo_id.getText()); 
		volvo_id.click();
		WebElement customer_name = driver.findElement(By.xpath("//*[@id='page-wrapper']/div[4]/div/div/h1"));
		assertEquals(name,customer_name.getText() );
	} 
	
	public void updateEmail(String newEmail) throws InterruptedException {
		driver.findElement(By.id("btn-edit-customer")).click();
		Thread.sleep(2000);
		WebElement emailBox = driver.findElement(By.id("contact-email"));
		emailBox.clear();
		emailBox.sendKeys(newEmail);
		driver.findElement(By.id("btn-save-customer")).click();
		Thread.sleep(2000);
		WebElement emailElement = driver.findElement(By.xpath(".//*[@id='customer-details-wrapper']/div[1]/div[3]/p"));
		assertTrue(emailElement.getText().contains(newEmail));
	}
	
	public void updateAddress(String addressLine1, int postCode, String city, String country) throws InterruptedException {
		driver.findElement(By.id("btn-edit-customer")).click();
		Thread.sleep(2000);
		WebElement addressElement = driver.findElement(By.id("address-line1"));
		addressElement.clear();
		addressElement.sendKeys(addressLine1);
		WebElement postElement = driver.findElement(By.id("post-code"));
		postElement.clear();
		postElement.sendKeys(Integer.toString(postCode));
		WebElement cityElement = driver.findElement(By.id("city"));
		cityElement.clear();
		cityElement.sendKeys(city);
		WebElement countryElement = driver.findElement(By.id("select2-chosen-2"));
		countryElement.click();
		WebElement country_element = driver.findElement(By.xpath(".//*[@class ='select2-result-label'][contains(text(), '" +country+ "')]"));
		country_element.click();
		driver.findElement(By.id("btn-save-customer")).click();
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.xpath("//*[@id='customer-details-wrapper']/div[2]/div[1]/p[2]"));
		assertEquals(addressLine1 , address.getText());
	}
	
	public void updateMobilePhone(int tlfNumber) throws InterruptedException {
		driver.findElement(By.id("btn-edit-customer")).click();
		Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.id("mobilePhone"));
		mobile.clear();
		mobile.sendKeys(Integer.toString(tlfNumber));
		driver.findElement(By.id("btn-save-customer")).click();
		Thread.sleep(2000);
		WebElement newTlfNum = driver.findElement(By.className("phone-number-resolve"));
		assertTrue(newTlfNum.getText().contains(Integer.toString(tlfNumber)));
	}
	
	
	public void logout() {
		driver.findElement(By.id("logout-link")).click();
		WebElement logoutConfirmation = driver.findElement(By.xpath("//*[@id='login-form']/div[1]/div/div[1]/h4"));
		assertEquals("You have been signed out.", logoutConfirmation.getText());
	}
	public void loginLogout(String url, String language, String country, String dealer_id, String dealer_password) throws InterruptedException {
	  login(url, language, country, dealer_id, dealer_password);
	  logout();
      
			
	}
	
	public static void tearDown() {
		driver.close(); 
	}
	
	
}
