package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator
{
    public static WebDriver mustafa;
    public static void main(String args[])
    {
        invokechromeDriver();
        mustafa.get("http://wwww.facebook.com");
        mustafa.findElement(By.name("firstname")).sendKeys("Mustafa");
        mustafa.findElement(By.name("lastname")).sendKeys("poyraz");

    }
    public static void invokechromeDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        mustafa=new ChromeDriver();
    }
}
