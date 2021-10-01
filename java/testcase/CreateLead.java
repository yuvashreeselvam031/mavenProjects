package testcase;



import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class CreateLead extends BaseLead{

	@Test
	public void createLead() {
		//clicking create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//entering company name 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//entering firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		//entering lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		//entering phone number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	    // clicking create lead button
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
}






