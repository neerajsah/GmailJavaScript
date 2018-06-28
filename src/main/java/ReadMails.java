
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neerajsah
 */
public class ReadMails 
{
    
    
    @Test
    public void readmails(WebDriver driver) throws InterruptedException
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        List<WebElement> rows = (List<WebElement>) js.executeScript("return document.getElementsByTagName('tr');");
        
        
           /*List<WebElement> rows = driver.findElements(By.tagName("tr"));
//           System.out.println(rows.get(0).getAttribute("class"));*/
           for (WebElement row : rows) 
           {
	       String classType = row.getAttribute("class");
	       if (classType.equals("zA zE")) 
               {
                 System.out.println(row);
                 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                 row.click();
                 driver.navigate().back();
                 
                 break;
               }
              
                
           }
            
       
    }
}
