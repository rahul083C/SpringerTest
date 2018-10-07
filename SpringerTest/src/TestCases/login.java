package TestCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * This test script will access the springer home page and will login to the user account
 * 
 */

public class login extends Main {

@Test

public  void logintest() {
	String expected = "Log in";
	
	
//Click on login button
	
	driver.findElement(By.id("auth")).click();
	
		
	//Enter Email ID and Password
		
	driver.findElement(By.name("IDToken1")).sendKeys("rahul083@gmail.com");
	driver.findElement(By.name("IDToken2")).sendKeys("rahul@123");
	String actual = driver.findElement(By.xpath("//*[@id=\"login-box\"]/div/div[3]/button")).getText();
	Assert.assertEquals(actual, expected);
	
	System.out.println("Login page is displayed successfully");
    
	driver.findElement(By.xpath("//*[@id=\"login-box\"]/div/div[3]/button")).click();
	
	
	
}

}

