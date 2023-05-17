package week4.day2Assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		//Maximize the window
	    driver.manage().window().maximize();
	    //Declare the URL
	    driver.get("https://www.leafground.com/drag.xhtml");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //Declare the source point where from the drag
	    WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
	    //Declare the destination point where to drop
        WebElement desc = driver.findElement(By.xpath("//p[text()='Drop here']"));
        //Instantiate Action Class
        Actions builder=new Actions(driver);
        //Use drag and drop method
        builder.dragAndDrop(source, desc).perform();
        //verification
        String text = desc.getText();
        System.out.println(text);
        //Declare drag and drop element in webelement
        WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Point location = drag.getLocation();
		//Get starting point to drag
		int x = location.getX();
		//Get ending point to drop
		int y = location.getY();
		//Print x-axis and y-axis
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		Actions dragact=new Actions(driver);
		//Set source and destination point
		dragact.dragAndDropBy(drag, 200, 100).perform();
		System.out.println(drag.getLocation().getX());
		System.out.println(drag.getLocation().getY());

	}

}

