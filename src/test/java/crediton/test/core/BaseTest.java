package crediton.test.core;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    private static final String URL = "https://www.crediton.ua";
    protected static final int sizeService = 5;

    protected BaseTest(){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/chromedriver.exe");
    }

    @BeforeMethod
    public void init(){
        open(URL);
    }

    @AfterMethod
    public void dispose(){
        close();
    }

    protected static void sleep(long mills){
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
