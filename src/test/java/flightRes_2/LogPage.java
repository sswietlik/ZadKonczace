package flightRes_2;

import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LogPage
{

    private WebDriver driver;
    Robot robot = new Robot();


    public LogPage() throws AWTException {
    }

    @Before
    public void setUp()
    {
        System.out.println("Start programu");
        System.setProperty("webdriver.chrome.driver","src/main/resources/WebDriver/chromedriver");
        driver = new ChromeDriver();
        driver
                .manage()
                .window()
                .maximize();

    }
    @Test
    public void accountLogin() throws InterruptedException {
        System.out.println("Start @Test");
            driver
                    .navigate()
                    .to("https://www.phptravels.net/login");

//            //V//UDALO SIE OGARNAC KOPIOWANIE XPATH - PROBLEM TKWIŁ W USTAWIENIACH NARZĘDZI - MUSZĘ SIĘ DOPYTAĆ BARTKA O KONKRETNIE PRZYDATNE NARZĘDZIA I ICH WYWOŁYWANIE BO CZASEM JEST TO
//            //MOCNO ZAKOPANE W SIECI
//            WebElement remMeChBx = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/form/div[1]/div/div[2]/div/div/div[3]/div/div[3]/label"));
//            remMeChBx.click();
//
//            WebElement BTNmail = driver.findElement(By.xpath ("/html/body/div[1]/div[1]/div[1]/div[1]/form/div[1]/div/div[2]/div/div/div[3]/div/div[1]/input"));
//            BTNmail.clear();
//            BTNmail.sendKeys("maurel@gmail.com");
//
//            WebElement BTNpass = driver.findElement(By.name("password"));
//            BTNpass.clear();
//            BTNpass.sendKeys("Qwerty12345");
//
//            WebElement LoginBTN = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/form/button"));
//            LoginBTN.click();
//
//            Thread.sleep(1000);

//            WebElement myProf = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"));
//            myProf.click();
//
//            WebElement accountPas1 = driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div/div[2]/div[2]/div/input"));
//            accountPas1.clear();
//            accountPas1.sendKeys("Qwerty12345");
//
//            WebElement accountPas2 = driver.findElement(By.name("confirmpassword"));
//            accountPas2.clear();
//            accountPas2.sendKeys("Qwerty12345");
//
//            WebElement accountaddress1 = driver.findElement(By.name("address1"));
//            accountaddress1.clear();
//            accountaddress1.sendKeys("ul.Blotna, nr zachlapany");
//
//            WebElement accountaddress2 = driver.findElement(By.name("address2"));
//            accountaddress2.clear();
//            accountaddress2.sendKeys("xYz");
//
//            WebElement cityName = driver.findElement(By.name("city"));
//            cityName.clear();
//            cityName.sendKeys("Łódź miasto meneli");
//
//            WebElement stateName = driver.findElement(By.name("state"));
//            stateName.clear();
//            stateName.sendKeys("Dzielnica Sosnowca");
//
//            WebElement ZIPnr = driver.findElement(By.name("zip"));
//            ZIPnr.clear();
//            ZIPnr.sendKeys("00-001");
//
//            //Problem z kliknięciem w wybrane państwo
//            //Problem z działaniem przycisku SUBMIT

            WebElement flightsBTN = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul/li[3]/a"));
            flightsBTN.click();
        System.out.println("Koniec zmian w arkuszu @Test");
//------------------------------------------------------------------------------------------------------------------------------//
//
//            WebElement emptySpace = driver.findElement((By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div")));
//            emptySpace.click();
//
//            WebElement fromBTN = driver.findElement(By.xpath("//*[@id=\"s2id_location_from\"]/a/span[1]"));
//            fromBTN.click();
//            fromBTN.sendKeys("WAW");
//            Thread.sleep(3000);

//            WebElement destinyBTN = driver.findElement(By.xpath("//*[@id=\"s2id_location_to\"]/a/span[1]"));
//            destinyBTN.click();
//            destinyBTN.sendKeys("NYC");
//            Thread.sleep(3000);
        System.out.println("Start Poszukiwanie lotu ");                                                                  //NUMEROWANIE Z WYŚWIETLENIEM W KONSOLI ZASTOSOWAŁEM DO TEGO ABY SPRAWDZIĆ W KTORYM MOMENCIE KODU MOŻE WYSTĄPIĆ JAKIŚ PROBLEM
            WebElement departDate = driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]"));
            departDate.click();
        System.out.println("1");
            WebElement nextMnt_1 = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]"));
            nextMnt_1.click();
        System.out.println("2");
            WebElement nextMnt_2 = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]"));
            nextMnt_2.click();
        System.out.println("3");
            WebElement dayDep = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/div/div/div[2]/div[27]"));
            dayDep.click();
        System.out.println("4");
            WebElement dayDepart = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]"));
            dayDepart.click();
        System.out.println("5");

            System.out.println("przed przerwaą");
            Thread.sleep(2000);
            System.out.println("Po przerwie");

//            robot.keyPress(KeyEvent.VK_ESCAPE);
//
//
//
//            WebElement emptySpace = driver.findElement((By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div")));            /*klikniecie w pustą przestrzen*/
//            emptySpace.click();
//
//            WebElement returnDate = driver.findElement(By.xpath("//*[@id=\"airDatepickerRange-flight\"]/div[2]/div/div[2]"));                              /*Ponowny wybór kalendarza */
//            returnDate.click();
//            WebElement dayRetu = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/div/div/div[2]/div[34]"));                          /*Wybór dnia*/
//            dayRetu.click();
//
//            Robot presESC = robot;
//                    robot.keyPress(KeyEvent.VK_ESCAPE);

            //    jeżeli tekst miesiąca kalendarza Kal_2    == nazwa miesiaca K_1

//        import java.awt.Robot;
//import java.awt.event.KeyEvent;
//
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ESCAPE);
//        robot.keyRelease(KeyEvent.VK_ESCAPE);



//          WebElement returnDate = driver.findElement(By.xpath("//*[@id=\"airDatepickerRange-flight\"]/div[2]/div/div[2]"));
//          returnDate.click();
//            WebElement nextMnt_1 =driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]"));
//            nextMnt_1.click();
//            WebElement nextMnt_2 =driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]"));
//            nextMnt_2.click();


//            departDate.sendKeys("2020-01-21");
//            WebElement yearSel = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/div/div[3]/div/div[12]"));
//            yearSel.click();






//            String month = "December 2019";
////            String day = "5";
//
//            while (true)
//            {
//                String text = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav")).getText();
//                if(text.equals(month))
//                {
//                    break;
//                }
//
//                else
//                {
//                    driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]/svg/path")).click();
//                }
//            }





    //        WebElement CountrySel = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/form/div/div/div[4]/div[2]/div/div[2]"));
    //        CountrySel.isEnabled();


    //        WebElement CountryText = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/form/div/div/div[4]/div[2]/div/div[2]/div/div/input"));
    //        CountryText.sendKeys("Poland");
    //
    //        driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div/div[4]/div[2]/div/div[2]/div/ul/li[2]/em"));
    //        CountryTextClick.isSelected();





    //V// Działa wyszukiwanie po text ale znalazło inny Login niż potrzeba ;)
    //        WebElement LoginBTN = driver.findElement(By.linkText("Login"));
    //        LoginBTN.click();



    }
}
