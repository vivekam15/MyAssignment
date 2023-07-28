package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Viveka");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("vinoth");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9786245130");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Meenu");
		WebElement birthdayday = driver.findElement(By.xpath("//select[@title='Day']")); 
		Select op=new Select( birthdayday);
		op.selectByValue("1");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select op1=new Select (month);
		op1.selectByVisibleText("May");
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select op2=new Select(year);
		op2.selectByValue("1993");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		System.out.println("Birthday:"+birthdayday);
		System.out.println("BirthMonth:"+month);
		System.out.println("BirthYear:"+year);
		Thread.sleep(300);
		driver.close();
	}

}
