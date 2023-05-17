package week4.day2Assignment;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StockMarket {

	public static void main(String[] args) throws InterruptedException {
		        //Declare the driver
				ChromeDriver driver=new ChromeDriver();	 
			    //Load the URL
			    driver.get("https://www.chittorgarh.com/");
			    //maximize the browser
			    driver.manage().window().maximize();
			    //Provide duration of waiting time for overall process
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
			    //Click Stock Market Button
			    driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
			    //Declare the column values in List
			    List <WebElement> securityNames= driver.findElements(By.xpath("//table[contains(@class,'table table-bordered table')]//tr//td[1]"));
                //Convert WebElement into ArrayList
			    List <String> nameList = new ArrayList<String>();
			    System.out.println(securityNames.size());
                for(int i=0;i<securityNames.size()-1;i++)
                {
                nameList.add(securityNames.get(i).getText());
                }
                //Declare the List Value in Set to avoid duplicate
                Set<String> output=new TreeSet<String>(nameList);
                System.out.println(output);
                driver.quit();
                
	}

}
