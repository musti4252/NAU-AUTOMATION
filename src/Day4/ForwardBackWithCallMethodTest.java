package Day4;

import org.openqa.selenium.WebDriver;

public class ForwardBackWithCallMethodTest
{

    public static void main(String ibrahim[])
    {
        ForwardBackCallMethod allBrowser=new ForwardBackCallMethod();
        WebDriver driver=allBrowser.chrome();
        driver.get("http://www.amazon.com");
        driver.get("http://www.facebook");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        System.out.println("Current url:"+driver.getCurrentUrl());
    }
}
