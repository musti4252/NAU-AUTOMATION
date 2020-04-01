package Day9;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSSelectorSubString
{
    public static void main(String args[]) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        Thread.sleep(1000);
//       CSS SEL. SUB STRING " ^ , $ , * "  Locator=         TagName[Attribute^='Value of Attribute']
        driver.findElement(By.cssSelector("input[type^='email']")).sendKeys("mustafap4252@gmail.com");
        Thread.sleep(1000);
 //       CSS SEL. SUB STRING "$"  Locator=         TagName[Attribute^='Value of Attribute']
        driver.findElement(By.cssSelector("input[id$='email']")).clear();

        Thread.sleep(1000);
//       CSS SEL. SUB STRING " * "  Locator=         TagName[Attribute^='Value of Attribute']
        driver.findElement(By.cssSelector("input[id*='email']")).sendKeys("with Star sign*");

        Thread.sleep(1000);
//       CSS SEL. SUB STRING "WITH ID ATTRIBUTE + ^,$,* "  Locator=  TagName#Value of Id[Attribute^='Value of Attribute']
        driver.findElement(By.cssSelector("input#email[data-testid='royal_email'")).clear();
    }
}
