package week4.day2Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableList {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //Load the URL
	    driver.get("https://jqueryui.com/sortable//");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //Switch the control to first frame
	    driver.switchTo().frame(0);
	    //Declare all the items in webElement	    
	    WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	    WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
	    WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	    WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	    //WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
	    //WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
	    //WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
        Actions item=new Actions(driver);
        //Exchange the order
        item.dragAndDrop(item2, item1).dragAndDrop(item3, item4).perform();
        Thread.sleep(5000);
        
	}	

}