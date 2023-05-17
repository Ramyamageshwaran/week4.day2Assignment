package week4.day2Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowAndColumnCount {

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
        //Print count of rows
	    System.out.println(rowcount.size());
        //Declare the column values in List
	    List<WebElement> columncount  = driver.findElements(By.xpath("//div[@class='render']/table[1]//tr/td"));
	    //Print count of columns
	    System.out.println(columncount.size());
	}

}
