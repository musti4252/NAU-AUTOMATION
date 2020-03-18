package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvocationForloopWhileLoop
{

    public static void main(String args[])
    {
        for(int i=1; i<4; i++){
            chrome();
            firefox();
        }
        int k=1;
        while(k<4)
        {
            chrome();
            firefox();
            k++;
        }

    }
    public static void chrome()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver mustafachromedriver=new ChromeDriver();
        mustafachromedriver.get("http://www.amazon.com");
    }
    public static void firefox()
    {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Musti\\Documents\\geckodriver-v0.26.0-win64-1\\geckodriver.exe");
        WebDriver mustafafirefoxdriver=new FirefoxDriver();
        mustafafirefoxdriver.get("http://www.google.com");

    }
}
