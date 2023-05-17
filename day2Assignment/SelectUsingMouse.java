package week4.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectUsingMouse {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //Load the URL
	    driver.get("https://jqueryui.com/selectable/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //Switch to frame
	    driver.switchTo().frame(0);
	    //Declare the items in webelement
	    WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	    WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
	    WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	    WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	    WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
	    WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
	    WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
        Actions item=new Actions(driver);
        //Select which item to get mouse action
        item.click(item1).click(item5).click(item7).click(item2).click(item4).click(item3).click(item6).release().perform();
        Thread.sleep(1000);    
        //Select the items using Keyboard actions 
        item.keyDown(Keys.CONTROL).click(item1).keyDown(Keys.CONTROL).perform();
        driver.quit();
	}

}
