package Day11;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathChildPseudoCode
{
    public static void main(String args[]) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(1000);
// Child Pseudo Code Formula        =     right clik copy xpath of parent /child::tagname of child
        driver.findElement(By.xpath("//*[@id='package-departing-wrapper-hp-package']/label/child::input")).sendKeys("05/05/2020");
    }
}
