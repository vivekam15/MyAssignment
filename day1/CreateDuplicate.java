package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get( "http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Smart Way Secure");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Viveka");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MurugaPrabhu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Viveka");
		driver.findElement(By.name("departmentName")).sendKeys("Sales");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Demo SalesManager");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("viveka.m15@gmail.com");
		WebElement drop =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select op= new Select(drop);
		op.selectByVisibleText("Employee");
		WebElement drop1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select op1 =new Select(drop1);
		op1.selectByValue("9001");
		WebElement drop2=driver.findElement(By.name("ownershipEnumId"));
		Select op2=new Select(drop2);
		op2.selectByIndex(5);
		WebElement drop3=driver.findElement(By.name("generalCountryGeoId"));
		Select op3=new Select(drop3);
		op3.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Viveka M");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		
		
	}

}
