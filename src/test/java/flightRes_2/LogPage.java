package flightRes_2;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.Screenshot;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;


public class LogPage {





    private WebDriver driver;
    Robot robot = new Robot();


    public LogPage() throws AWTException {
    }

    @Before
    public void setUp() {
        System.out.println("Start programu");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/WebDriver/chromedriver");
        driver = new ChromeDriver();
        driver
                .manage()
                .window()
                .maximize();

      }



//    Screenshot screenshot = new Asshot().takeScreenshot(driver);
//        ImageIO.write(screenshot.getImage(), "jpg", new File("src/main/resources/pics/fullimage.jpg"));


    @Test
    public void accountLogin() throws InterruptedException {
        System.out.println("Start @Test");
        driver
                .navigate()
                .to("https://www.phptravels.net/m-flights");

//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("src/main/resources/pics/pic.jpg"));

        //TEST ZBUDOWANY W CELU UZUPEŁNIENIA STAŁYCH DANYCH DO KONTA - NIESTETY TECHNICZNIE PRZYCISKK ZAPISANIA DANYCH  !!!NIE DZIAŁA!!!@#
        //JEST TO      !@#$ STRONA DEMO !@#$%
//            //V//UDALO SIE OGARNAC KOPIOWANIE XPATH -
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

//            WebElement flightsBTN = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul/li[3]/a"));         //PRZEJŚCIE DO ACCOUNT - WYŁĄCZONE w celu przyspieszenia logowania do strony
//            flightsBTN.click();
//        System.out.println("Koniec zmian w arkuszu @Test");
//------------------------------------------------------------------------------------------------------------------------------//
//
//            WebElement emptySpace = driver.findElement((By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div")));      //BYŁA TO PRÓBA KLIKNIĘCIA W JAKIEŚ PUSTE MIEJSCE NA STROIE
//                                                                                                                                                      W CELU SPRAWDZENIA REAKCJI CZYSCZENIA BŁĘDU W WYŚWIETLANIU SIĘ KALENDARZA.
//            emptySpace.click();
//
        WebElement roundFlight = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div[2]/label"));
        roundFlight.click();

        Thread.sleep(300);

        WebElement fromBTN = driver.findElement(By.xpath("//*[@id=\"s2id_location_from\"]/a"));
        fromBTN.click();
        fromBTN.sendKeys("WAW");
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB);                                                                                                            /* KAROL -MENTOR WARSZAWA NIE POLECAŁ UŻYWANIA FUNKCJI ROBOTA */
        robot.keyRelease(KeyEvent.VK_TAB);                                                                                                          /* BARDZO FAJNA BIBLIOTEKA FUNKCJI - TAK MAM ŚWIADOMOŚĆ ŻE UŻYCIE "TAB" MOŻE POWODOWAĆ PROBLEMY  /*
                                                                                                                                                        /* ALE CZAS NAGLI ;) "LEPSZY BYL BY ENTER"  */
//            WebElement fromSelect = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div"));
//            robot.keyPress(KeyEvent.VK_ENTER);
//            Thread.sleep(3000);

        /* KOLEJNY RAZ ZASTOSOWAŁEM ROBOTA PONIEWAŻ MIAŁEM JAKIEŚ PROBLEMY Z POPRAWNYM KLIKNIĘCIEM W CELU
         * ODWIESZENIA DZIALANIA STRONY, A ROBOT WYDAWAŁ SIĘ NA TYLE POPRAWNYM SZALEŃSTWEM DO ZASYMULOWANIA
         * WKURZONEGO USERA WALĄCEGO W MYSZKĘ I KLAWIATURĘ :)   */

        WebElement destinyBTN = driver.findElement(By.xpath("//*[@id=\"s2id_location_to\"]/a"));
        destinyBTN.click();
        destinyBTN.sendKeys("JFK");
        Thread.sleep(300);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(300);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("Start Poszukiwanie lotu ");                                                                  //NUMEROWANIE Z WYŚWIETLENIEM W KONSOLI ZASTOSOWAŁEM DO TEGO ABY SPRAWDZIĆ DODATKOWO W  KTORYM MOMENCIE KODU MOŻE WYSTĄPIĆ JAKIŚ PROBLEM
        WebElement departDate = driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]"));
        departDate.click();
        System.out.println("1");
        Thread.sleep(300);

        WebElement nextMnt_1 = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]"));
        nextMnt_1.click();
        System.out.println("2");
        Thread.sleep(300);

        WebElement nextMnt_2 = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]"));
        nextMnt_2.click();
        System.out.println("3");
        Thread.sleep(300);

        WebElement dayDep = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/div/div/div[2]/div[27]"));
        dayDep.click();
        System.out.println("4");
        Thread.sleep(300);

        WebElement dayDepart = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[8]/div/div/div[2]/div[34]"));
        dayDepart.click();
        System.out.println("5");
        Thread.sleep(300);

        WebElement flightSearch = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[2]/div[4]/button"));
        flightSearch.click();

//------------------------------------------------------------------------------------------------------------------------------//

        WebElement reserveFlight = driver.findElement(By.xpath("//*[@id=\"LIST\"]/li[1]/div/div[1]/div[2]/form[1]/div[2]/div/button"));
        reserveFlight.click();

//------------------------------------------------------------------------------------------------------------------------------//
        /* W TEJ SEKCJI PONIŻEJ POJAWIŁO SIĘ SPORO OZNACZEŃ: ID, NAME  ITP, */

        WebElement reserveAsGuest = driver.findElement(By.id("guesttab"));
        reserveAsGuest.click();

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[1]/div/input"));
        firstName.sendKeys("Marek");
        firstName.click();

        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[2]/input"));
        lastName.sendKeys("Aureliusz");
        lastName.click();

        WebElement mailAd = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[1]/input"));
        mailAd.sendKeys("maurel@gmail.com");
        mailAd.click();

        WebElement mailAdConfirm = driver.findElement(By.name("confirmemail"));
        mailAdConfirm.sendKeys("maurel@gmail.com");
        mailAdConfirm.click();

        WebElement mobilePhone = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[3]/div/input"));
        mobilePhone.sendKeys("+48 666 666 666");
        mobilePhone.click();

        WebElement MyAddressBTN = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[4]/div/input"));
        MyAddressBTN.sendKeys("ul.Blotna nr_zachlapany, Sosnowieś");
        MyAddressBTN.click();


        //PONIŻSZY ZAPIS POWINIEN DZIALAC POPRAWNIE ALE WYSTEPUJE PODKRESLENIE POD "copyFile"
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("src/main/resources/pics/pic.png"));


        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_PRINTSCREEN);
        robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
        System.out.println("PROGRAM WYKONAL PRINTSCREEN");
    }
        //       ------------------------------------------------------------------------------------------------------------------------------
        //ZAKLADKA ODPOWIEDZIALNA ZA DANE PLACACEGO  - WYMAGA POPRAWEK

////
//        WebElement firstNameBILL = driver.findElement(By.xpath("//*[@id=\"name\"]"));
//        firstNameBILL.sendKeys("Marek");
//        firstNameBILL.click();
//
//
//        WebElement lastNameBILL = driver.findElement(By.id("surname"));
//        lastNameBILL.sendKeys("Aureliusz");
//        lastNameBILL.click();
//
//        WebElement mailAdBILL = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        mailAdBILL.sendKeys("maurel@gmail.com");
//        mailAdBILL.click();
//
//        WebElement mobilePhoneBILL = driver.findElement(By.id("phone[]"));
//        mobilePhoneBILL.sendKeys("+48 666 666 666");
//        mobilePhoneBILL.click();
//
//
//        WebElement dobBILL = driver.findElement(By.id("birthday"));
//        dobBILL.sendKeys("1984-04-01");
//        dobBILL.click();
//
//        WebElement passPort = driver.findElement(By.id("cardno"));
//        passPort.sendKeys("DO9549451");
//        passPort.click();
//
//        WebElement passportExp = driver.findElement(By.id("expiration"));
//        passportExp.sendKeys("2025-01-01");
//        passportExp.click();
//
//        WebElement nationality = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]"));
//        nationality.click();
 //       ------------------------------------------------------------------------------------------------------------------------------



    @After
    public void accountLogina() {
        System.out.println("Koniec @Test");
    }
}