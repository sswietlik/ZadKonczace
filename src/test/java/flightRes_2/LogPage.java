package flightRes_2;

import net.bytebuddy.asm.Advice;
import org.junit.After;
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
import java.util.concurrent.Delayed;

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
                .to("https://www.phptravels.net/m-flights");

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
//            WebElement emptySpace = driver.findElement((By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div")));
//            emptySpace.click();
//
        WebElement roundFlight = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div[2]/label"));
        roundFlight.click();


        WebElement fromBTN = driver.findElement(By.xpath("//*[@id=\"s2id_location_from\"]/a"));
            fromBTN.click();
            fromBTN.sendKeys("WAW");
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

//            WebElement fromSelect = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div"));
//            robot.keyPress(KeyEvent.VK_ENTER);
//            Thread.sleep(3000);


            WebElement destinyBTN = driver.findElement(By.xpath("//*[@id=\"s2id_location_to\"]/a"));
            destinyBTN.click();
            destinyBTN.sendKeys("JFK");
            Thread.sleep(300);
             robot.keyPress(KeyEvent.VK_ENTER);
             robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(300);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("Start Poszukiwanie lotu ");                                                                  //NUMEROWANIE Z WYŚWIETLENIEM W KONSOLI ZASTOSOWAŁEM DO TEGO ABY SPRAWDZIĆ W KTORYM MOMENCIE KODU MOŻE WYSTĄPIĆ JAKIŚ PROBLEM
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



//        WebElement MyCountryBTN = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/a"));
//        MyCountryBTN.click();
        WebElement MyCountryText = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/div/div/input"));
        MyCountryText.sendKeys("Poland");
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
 //       ------------------------------------------------------------------------------------------------------------------------------


        WebElement firstNameBILL = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        firstNameBILL.sendKeys("Marek");
        firstNameBILL.click();
        

        WebElement lastNameBILL = driver.findElement(By.id("surname"));
        lastNameBILL.sendKeys("Aureliusz");
        lastNameBILL.click();

        WebElement mailAdBILL = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        mailAdBILL.sendKeys("maurel@gmail.com");
        mailAdBILL.click();

        WebElement mobilePhoneBILL = driver.findElement(By.id("phone[]"));
        mobilePhoneBILL.sendKeys("+48 666 666 666");
        mobilePhoneBILL.click();


        WebElement dobBILL= driver.findElement(By.id("birthday"));
        dobBILL.sendKeys("1984-04-01");
        dobBILL.click();

        WebElement passPort= driver.findElement(By.id("cardno"));
        passPort.sendKeys("DO9549451");
        passPort.click();

        WebElement passportExp= driver.findElement(By.id("expiration"));
        passportExp.sendKeys("2025-01-01");
        passportExp.click();

        WebElement nationality = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]"));
        nationality.click();

//        System.out.println("przed przerwaą");
//        Thread.sleep(2000);
//        System.out.println("Po przerwie");



//        System.out.println("robot wciska ESCAPE");
//
//        robot.keyPress(KeyEvent.VK_ESCAPE);
//        System.out.println("Wciśnęto ESC");
//        Thread.sleep(300);
//
//        System.out.println("6");
//        Thread.sleep(300);
//
//        WebElement K2_select = driver.findElement(By.id("FlightsDateEnd"));
//        K2_select.click();
    }
        @After
        public void accountLogina()
        {
            System.out.println("Koniec @Test");
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
