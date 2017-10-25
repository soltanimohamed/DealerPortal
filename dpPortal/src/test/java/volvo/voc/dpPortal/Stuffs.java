package volvo.voc.dpPortal;

public class Stuffs {

	/*	 WebDriver driver ;
	JavascriptExecutor jse ;
	
	@Before
	public void init() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohamed.soltani\\Documents\\gecko\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
        driver.get("https://qa-voc.wirelesscar.net/voc/login");
	} 
	
	@Test
	public void testLogin() throws InterruptedException {
		 driver.findElement(By.id("login-language-selector")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id='login-language-selector']/ul/li[1]")).click();
         driver.findElement(By.id("select2-chosen-1")).click();
         Thread.sleep(2000);
        // WebElement countries = driver.findElement(By.id("select2-results-1"));
         //Thread.sleep(2000);
        // countries.click();
        // jse = (JavascriptExecutor) driver;
        // jse.executeScript("$(\"#select2-results-1\").animate({ scrollTop: \"600px\" })");
         // WebElement country = driver.findElement(By.xpath("//*[@id='select2-result-label-27']"));
        // Thread.sleep(2000);
         WebElement country = driver.findElement(By.xpath(".//*[@class ='select2-result-label'][contains(text(), 'Sweden')]"));
         country.click();
         driver.findElement(By.id("input-username")).sendKeys("VCC_QA");
         driver.findElement(By.id("password")).clear();
         driver.findElement(By.id("password")).sendKeys("volvo4life");
         driver.findElement(By.id("signInButton")).click();
         Thread.sleep(2000);
         String text = driver.findElement(By.xpath("//*[@id='page-wrapper']/div[4]/div[1]/div/h1[1]")).getText();
         assertEquals("Welcome!", text);
         driver.findElement(By.id("logout-link")).click();
 		WebElement logoutConfirmation = driver.findElement(By.xpath("//*[@id='login-form']/div[1]/div/div[1]/h4"));
 		assertEquals("You have been signed out.", logoutConfirmation.getText());
	}
	
	
	@After
	public void tearDown() {
		driver.close(); 
	} */
}
