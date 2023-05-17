package week4.day2Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLibraryValues {

	public static void main(String[] args) {
	         	//Declare the driver
				ChromeDriver driver=new ChromeDriver();	 
			    //Load the URL
			    driver.get("https://html.com/tags/table/");
			    //maximize the browser
			    driver.manage().window().maximize();
			    //Provide duration of waiting time for overall process
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
			    //Declare the row values in List
			    List<WebElement> rowcount  = driver.findElements(By.xpath("//div[@class='render']/table[1]//tr"));
		        System.out.println("Absolute Usage");
		        //Condition checking 
			    for(int i=2;i<=rowcount.size();i++)
			    {
			     String text = driver.findElement(By.xpath("//div[@class='render']/table[1]//tr[2]/td["+i+"]")).getText();
		        if(text!="")
		        {
		        	System.out.println(text);
		        }
			    
			    }
		        

	}

}
