package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private Driver(){
        // Farkli objelerle erisimi engellemek icin private constructor olusturarak default constructor'i
        // iptal ettik.
    }

    /*
    => Butun class'lardan driver'i cagirip kullanabilmek icin oncelikle utilities package'i altinda Driver class'i
    olusturduk.
    =>  Class seviyesinde static WebDriver olusturduk ve daha sonra static getDriver methodu olusturarak
    test'lerden once yapmamiz gereken ayarlari bu methodun icinde yaptik.

    => Daha sonra driverClose() ve driverQuit methodlari olusturduk.

     */

    /*
    => Testlerimizi calistirdigimizda her seferinde yeni driver olusturdugu icin her test methodu
    icin yeni bir pencere (driver) aciyor. Eger driver'a bir deger atanmamissa yani driver==null ise
    bir kez driver'i calistir diyerek bir kere if icini calistiracak. Ve driver artik bir kere
    calistigi icin ve deger atandigi icin null olmayacak ve direk return edecek ve diger testlerimizi
    ayni pencere (driver) uzerinde calisacak.
     */

    static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null) {

            switch(ConfigReader.getProperty("browser")){
                // => Configuration.properties'de browser'a hangi value'yu atadiysak testlerimizi o browser'i
                // acarak yapar.

                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "headless-chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    // => Bu manager sayfa acmadan testlerimizi yapar
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        // => WebElement turunde method olusturdugumuz icin bizden bisey return etmemizi istedi.
        // Biz de driver'i return ettik.
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null) { // driver'a deger atanmissa
            driver.close();
            driver=null; // Kapandiktan sonraki acmalari garanti altina almak icin null yaptik.

        }
    }

    public static void quitDriver(){
        if (driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}
