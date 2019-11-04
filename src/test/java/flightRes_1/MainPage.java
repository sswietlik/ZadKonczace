package flightRes_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage
{

    private WebDriver driver;

            @Before
                public void setUp()
            {

                    System.setProperty("webdriver.chrome.driver","src/main/resources/WebDriver/chromedriver");
                    driver = new ChromeDriver();
                    driver
                            .manage()
                            .window()
                            .maximize();
            }
            @Test
                public void accountLog()
            {
                    driver
                            .navigate()
                            .to("https://www.phptravels.net/");



            }

            @After
                public void MPfinish()
            {

//            assert equals();
            }
}
