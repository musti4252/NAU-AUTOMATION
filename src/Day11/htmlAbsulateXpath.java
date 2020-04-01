package Day11;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class htmlAbsulateXpath
{
    public static void main(String args[]) throws InterruptedException
    {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.google.com");
        Thread.sleep(2000);
//   Ancestor Xpath  Formul=         //ancestor::html// right click copyxpath
        driver.findElement(By.xpath("//ancestor::html//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("facebook");

    }
}
