package week2;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Login {
		public static void main(String[] args) {
			 WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("http://leaftaps.com/opentaps/control/main");
			 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			 driver.findElement(By.id("password")).sendKeys("crmsfa");
			 driver.findElement(By.className("decorativeSubmit")).click();
			
			 String orgTitle="Leaftaps - Testleaf Automation Platform";
			 String title = driver.getTitle();
			 if (orgTitle.equals(title)) {
				 System.out.println("page landed up correctly");
				
			}
			 else
				 System.out.println("page not landed up correctly");
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 driver.findElement(By.linkText("Leads")).click();
			 driver.findElement(By.linkText("Create Lead")).click();
			 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuva");
			 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shree");
			// driver.findElement(By.className("smallSubmit")).click();
			 WebElement dd1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
			 Select drpdwn1 = new Select(dd1);
			 drpdwn1.selectByValue("LEAD_EMPLOYEE");
			 WebElement dd2	 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			 Select drpdwn2 = new Select(dd2);
			 drpdwn2.selectByValue("CATRQ_AUTOMOBILE");
			 WebElement dd3	 = driver.findElement(By.id("createLeadForm_industryEnumId"));
			 Select drpdwn3 = new Select(dd3);
			 drpdwn3.selectByValue("IND_AEROSPACE");
			 
			 WebElement dd4	 = driver.findElement(By.id("createLeadForm_currencyUomId"));
			 Select drpdwn4 = new Select(dd4);
			 drpdwn4.selectByValue("AFA");
			 
			 WebElement dd5	 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			 Select drpdwn5 = new Select(dd5);
			 drpdwn5.selectByVisibleText("Partnership");
			 
			 WebElement dd6	 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
			 Select drpdwn6 = new Select(dd6);
			 drpdwn6.selectByVisibleText("Argentina");
			 
			 
			 }
		

	}


