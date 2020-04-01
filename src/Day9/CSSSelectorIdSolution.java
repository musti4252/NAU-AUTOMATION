package Day9;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSSelectorIdSolution
{
    public static void main(String args []) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        Thread.sleep(1000);
//                 CSS ID Locator=         TagName#Value of Id[Any Attribute='Value of Attribute']
        driver.findElement(By.cssSelector("input#email[type='email']")).sendKeys("mustafap4252@gmail.com");
    }
}
