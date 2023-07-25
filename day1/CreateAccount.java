package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get( "http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("VivekaMurugaPrabhu");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Viveka");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("200000");
		WebElement drop= driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select op= new Select(drop);
		op.selectByVisibleText("S-Corporation");
		WebElement drop2=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select op2 =new Select(drop2);
		op2.selectByVisibleText("Computer Software");
		WebElement drop1=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select op1 =new Select(drop1);
		op1.selectByValue("9000");
		WebElement drop3= driver.findElement(By.id("generalStateProvinceGeoId"));
		Select op3= new Select(drop3);
		op3.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		

		
		
		
		
		
	}

}
