package Day11;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FallowingXpath
{
    public static void main(String args[]) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.google.com");
        Thread.sleep(2000);
//   Following Xpath  Formul=         right click copyxpath//following::tagname which interest value
        driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/style//following::input")).sendKeys("facebook");

    }
}
