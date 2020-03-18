package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xpathLocatorWithCallMethod
{
    public static void main(String args[]) throws InterruptedException
    {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http:/www.skyscanner.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        driver.quit();
    }



}
