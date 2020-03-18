package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlCheckValidation
{

    public static String url="http://www.amazon.com";
    public static WebDriver driver;
    public static void main (String args [])
    {
        chrome(url);
        boolean result=urlValidation(url);
        System.out.println("Validation :"+result);
    }
    public static void chrome (String url)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
    }
    public static boolean urlValidation(String url)
    {
        System.out.println("Current url:"+driver.getCurrentUrl());
        System.out.println("Request:"+url);
        if(url.equals(driver.getCurrentUrl()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
