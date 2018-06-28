
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neerajsah
 */
public class UnreadMessages {
    
    public void unreadmessages(WebDriver driver) throws InterruptedException
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element;
       element = 
             (WebElement) js.executeScript("return document.querySelector('a[class=\"J-Ke n0\"]');");
       String name= element.getAttribute("title");
        
//        String name=driver.findElement(By.xpath("//a[@class='J-Ke n0']")).getAttribute("title");
        String unreadMessages=name.substring(7,name.length()-1);
        System.out.println("Unread Messages= "+unreadMessages);
    }
}