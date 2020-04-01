package Day11;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class XpathParent
{
    public static  void main(String args[]) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        for(int i=0; i<11; i++)
        {
            driver.findElement(By.xpath("//*[@id='package-returning-hp-package']")).sendKeys(Keys.BACK_SPACE);
        }

        Thread.sleep(2000);
// Parent Xpath Code Formula        =     right clik copy xpath of child //parent::tagname of parent
        driver.findElement(By.xpath("//*[@id='package-returning-hp-package']//parent::label")).sendKeys("07/10/2020");
    }
}
