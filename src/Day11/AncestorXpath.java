package Day11;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AncestorXpath
{
    public static void main(String args[]) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.google.com");
        Thread.sleep(2000);
//   Ancestor Xpath  Formul=         //ancestor::tagname which interest value of parent or Grand parent// right click copyxpath
        driver.findElement(By.xpath("//ancestor::body//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("facebook");

    }
}
