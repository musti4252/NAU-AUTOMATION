package Day9;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSSelectorAttributeSolution
{
    public static void main(String args []) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");
        Thread.sleep(1000);
//                CSS ATTRIBUTE locator =  Tagname.value of class[Attribute='Value']
        driver.findElement(By.cssSelector("input.nav-input[name='field-keywords']")).sendKeys("airpods");
        Thread.sleep(1000);
        driver.navigate();

        driver.get("http://www.amazon.com");
        Thread.sleep(1000);
//                CSS ATTRIBUTE locator =  Tagname#value of Id[Attribute='Value']
        driver.findElement(By.cssSelector("input#twotabsearchtextbox[tabindex='19']")).sendKeys("iphone");

    }
}
