import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class GmailJS
{
    WebDriver driver;
    GmailLogin login= new GmailLogin();
    UnreadMessages unread= new UnreadMessages();
    ReadMails mails= new ReadMails();
    
    @BeforeClass
    public void launchBrowser()
    { 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\neerajsah\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        
    }
    
    @Test
    public void login() throws InterruptedException
    {
       login.gmailLogin(driver);
    }   
     
    @Test(dependsOnMethods="login")
    public void unread() throws InterruptedException
    {
        unread.unreadmessages(driver);
    }
    
    @Test(dependsOnMethods="unread")
    public void readmails() throws InterruptedException
    {
        mails.readmails(driver);
        
    }
    
    
    @Test(dependsOnMethods="readmails")
    public void unreadAgain() throws InterruptedException
    {
        unread.unreadmessages(driver);
 
    }
    
    @AfterClass
    public void closeBrowser() throws InterruptedException
    {   Thread.sleep(2000);
        driver.quit();
    }
    
}