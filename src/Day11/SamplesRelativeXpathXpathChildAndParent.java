package Day11;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SamplesRelativeXpathXpathChildAndParent
{
    public static void main(String args[]) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(5000);
//   Relative Xpath Formula        = "// tagname of parent[@Attribute='Value of Attribute']/Tag Names of childs"
        driver.findElement(By.xpath("//form[@id='gcw-packages-form-hp-package']/section/div/div/div/div/label/input")).sendKeys("Atlanta");
        Thread.sleep(2000);
        for(int i=1; i<=3; i++)
        {
            driver.findElement(By.xpath("//form[@id='gcw-packages-form-hp-package']/section/div/div/div/div/label/input")).sendKeys(Keys.ARROW_DOWN);
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='autocomplete-dropdown']/ul/div/li[3]/a")).click();
        Thread.sleep(2000);
//   Child Pseudo Code Formula  =  right clik copy xpath of parent /child::tagname of child
        driver.findElement(By.xpath("//*[@id='gcw-packages-form-hp-package']/section/div[1]/div[2]/div/div[1]/label/child::input")).sendKeys("Las Vegas");
        Thread.sleep(2000);
        for(int i=1; i<=3; i++)
        {
            driver.findElement(By.xpath("//*[@id='gcw-packages-form-hp-package']/section/div[1]/div[2]/div/div[1]/label/child::input")).sendKeys(Keys.ARROW_DOWN);
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='gcw-packages-form-hp-package']/section/div[1]/div[2]/div/div[1]/label/child::input")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //   Parent Xpath Code Formula        =     right clik copy xpath of child //parent::tagname of parent
        driver.findElement(By.xpath("//*[@id='package-departing-hp-package']//parent::label")).sendKeys("05/25/2020");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='package-departing-wrapper-hp-package']/div/div/div[1]/button//parent::div")).click();
        Thread.sleep(4000);

        for(int i=1; i<30; i++)
        {
            driver.findElement(By.xpath("//*[@id='package-returning-hp-package']")).sendKeys(Keys.BACK_SPACE);
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='package-returning-wrapper-hp-package']/div/div/div[3]/table/tbody/tr[1]/td[2]/button")).sendKeys("06/01/2020");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='package-returning-wrapper-hp-package']/div/div/div[3]/table/tbody/tr[1]/td[2]/button")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='search-button-hp-package']//parent::label")).click();
    }
}
