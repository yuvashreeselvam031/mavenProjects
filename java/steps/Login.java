package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public ChromeDriver driver;
	
	@Given("open the chrome browser")
	public void opebBrowser() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@And("Load the application url")
	public void loadApplicationURL(){
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@And("enter user name as Demosalesmanager")
	public void enterUserName() {
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	
	@And("enter password as crmsfa")
	public void enterPassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
    @When("click on login button")
	public void ClickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	}
    
    @Then("homepage should be displayed")
	public void verifyHomePage()
	{
		System.out.println("HomePage");
	}
	
}
