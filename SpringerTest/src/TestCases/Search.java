package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/*
 * This test will perform a search using a search text provided and then close the browser
 * 
 */
public class Search extends Main {

	@Test
	public void SearchTest() throws Exception {
		
		//click on search text box and search with a keyword test
		
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("test");
		driver.findElement(By.className("search-submit")).click();
		Thread.sleep(2000);
		
		//verify search functionality worked

		boolean searchWorked = driver.findElement(By.xpath("//h2[@class='heading']")).isDisplayed();
						
		
				if(searchWorked==true) {
			
			System.out.println("Serach returned results");
		} else {
			
		System.out.println("Search operation failed");	
		}
		
}
	
}