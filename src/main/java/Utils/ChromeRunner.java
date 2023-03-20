package Utils;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeMethod
    public void setUp(){
        System.setProperty("selenide.browserSize", "1980x1080");
        open("https://www.amazon.com/");


    }

    @AfterMethod
    public void tearDoun(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}

