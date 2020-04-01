package Day11;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrecedingXpath
{

    public static void main(String args[]) throws InterruptedException
    {
        ChromeBrowser myBrowser = new ChromeBrowser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.google.com");
// Preceding Xpath    =   for calculate  how many there are Tagname (travers from html to the current tag name) before current Tag Name formul =  right clig xpath copy //preceding::Tag Name
        driver.findElement(By.xpath("//preceding::div//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("div");
    }

}
