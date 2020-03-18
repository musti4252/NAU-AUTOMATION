package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstInvocation {

    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver mustafa=new ChromeDriver();
        mustafa.get("http://www.amazon.com");

    }
}
