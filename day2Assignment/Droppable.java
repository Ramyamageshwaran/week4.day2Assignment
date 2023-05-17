package week4.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		//Declare the driver
		ChromeDriver driver=new ChromeDriver();	 
	    //Load the URL
	    driver.get("https://jqueryui.com/droppable/");
	    //maximize the browser
	    driver.manage().window().maximize();
	    //Provide duration of waiting time for overall process
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
	    //Switch the control to frame
	    driver.switchTo().frame(0);
	    //Declare source point
	    WebElement dragSource = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	    //Declare destination point
	    WebElement dropdes = driver.findElement(By.xpath("//p[text()='Drop here']"));
        Actions act=new Actions(driver);
        act.dragAndDrop(dragSource, dropdes).perform();
        //Verify the result
        String returnMsg = dropdes.getText();
        System.out.println(returnMsg);
        }

}
