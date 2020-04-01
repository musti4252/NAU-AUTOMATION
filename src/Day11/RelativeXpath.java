package Day11;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RelativeXpath
{
    public static void main(String args[]) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
//   Relative Xpath Formula        =  tagname of parent[@Attribute='Value of Attribute']/Tag Names of childs
        driver.findElement(By.xpath("//form[@id='gcw-packages-form-hp-package']/section/div/div/div/div/label/input")).sendKeys("Atlanta");
        Thread.sleep(2000);

        for(int i=0; i<=3; i++)
        {
            driver.findElement(By.xpath("//form[@id='gcw-packages-form-hp-package']/section/div/div/div/div/label/input")).sendKeys(Keys.ARROW_DOWN);
        }
        driver.findElement(By.xpath("//form[@id='gcw-packages-form-hp-package']/section/div/div/div/div/label/input")).click();
        Thread.sleep(1000);
        driver.quit();
    }

}
