package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrlMainVeriableMethod
{

    public static void main (String args[])
    {
        String url="https://www.mercedes.com";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        chrome(url,driver);
        System.out.print("Validation:"+urlValidation(url,driver));

    }
    public static void chrome(String url,WebDriver driver)
    {
        driver.get(url);
    }
    public static boolean urlValidation(String url,WebDriver driver)
    {
        return url.equals(driver.getCurrentUrl());
    }

}
