package flightRes_3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountMBR
{

    private WebDriver driver;                           //   !@#!@#!# private WebDriver = driver; NIE UŻYWAĆ znaku = //

    @Before
    public void setUp()
    {

        System.setProperty("webdriver.chrome.driver","src/main/resources/WebDriver/chromedriver");
//        driver = new ChromeDriver();
        driver
                .manage()
                .window()
                .maximize();
    }

    @Test
    public void flighsBTN_account()
    {
      WebElement flighsBTN_account = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul/li[3]/a"));
      flighsBTN_account.click();
    }
}
