package wag;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    protected User user;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/elena/Downloads/chromedriver-2");
        driver = new ChromeDriver();
        driver.get("https://wagwalking.com/");
        System.out.println("Start");

        user = new User("abe@gmail.com", "1234567a", "Abe", "Wag", "6461234567");
        }

    @After
    public void finish() {
//        driver.quit();
        System.out.println("Finish");
    }
}
