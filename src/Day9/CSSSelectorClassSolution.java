package Day9;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSSelectorClassSolution
{
    public static void main(String args []) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");
        Thread.sleep(1000);
//                      CSS CLASS LOCATOR=   Tagname.Value of Class[Any Attribute='Value of Attribute']
        driver.findElement(By.cssSelector("input.nav-input[name='field-keywords']")).sendKeys("airpods");
    }
}
