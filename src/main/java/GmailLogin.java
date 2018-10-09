
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
public class GmailLogin 
{
    
    public void gmailLogin(WebDriver driver) throws InterruptedException
    {
        driver.get("https://mail.google.com/");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element;
        element = (WebElement) js.executeScript("return document.getElementById('identifierId');");
        element.sendKeys("neerajsah@qainfotech.com");
        js.executeScript("return document.getElementById('identifierNext').click();");
        Thread.sleep(5000);
        
        element = (WebElement) js.executeScript("return document.querySelector('input[type = \"password\"]');");
        element.sendKeys("password");
        js.executeScript("return document.getElementById('passwordNext').click();");
        Thread.sleep(2000);
       
    }
    
}
