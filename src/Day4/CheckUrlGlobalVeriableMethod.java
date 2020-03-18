package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrlGlobalVeriableMethod
{
    public static WebDriver driver;
    public static void main(String args [])
    {
        String url="http://www.amazon.com";
        chrome(url);
        System.out.print("Validation:"+urlValidation(url));
    }
    public static void chrome(String url)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
    }
    public static boolean urlValidation(String url)

    {
        return url.equals(driver.getCurrentUrl());
    }
}
