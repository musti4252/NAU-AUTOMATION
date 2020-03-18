package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvocationChromeAndFirefox
{

    public static void main(String args[])
    {
        chrome();
        firefox();

    }
    public static void chrome()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromedriver=new ChromeDriver();
        chromedriver.get("http://www.amazon.com");
    }
    public static void firefox()
    {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Musti\\Documents\\geckodriver-v0.26.0-win64-1\\geckodriver.exe");
        WebDriver firefoxdriver=new FirefoxDriver();
        firefoxdriver.get("http://www.google.com");

    }

}
