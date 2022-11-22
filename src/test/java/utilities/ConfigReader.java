package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
    // => Properties class'ini kullanmak icin bu class'dan obje olusturduk. Ancak her yerden ulasmak
    // icin class seviyesinde, public ve static olusturduk.

    static{
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis); // fis'in okudugu bilgileri propereties'e yuklemis olduk.

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // => configuration.properties dosyasini akisa sunmak dosya yolunu alip icin FileInputStream'e atadik.
    // method signature'da gorunmemesi icin FileNotFoundException try blogu icine aldik
    // => Class seviyesinde olusturdugumuz properties objesini tanimladik ve load() methodu ile dosya yolunu
    // atadigimiz fis'i icine yazdik. load()'la cikan IO Exception uyarisini yine try blogu icine aldik
    // IO daha kapsamli oldugu icin FileNotFoundException blogunu sildik.
    // => Bu islemler her seyden once calismasi icin static blogu icinde olusturduk.


    public static String getProperty(String key){
        /*
        => configuration.properties class'inda tanimladigimiz key'lere ait value'leri test class'imiza
        getirmesi icin String data turunde public static bir method olusturduk.
        Ve istedigimiz key'in value'sunu getirmesi icin Poperty class'indan olusturdugumuz
        properties objesi vasitasiyla getProperty(key) methodununun icine istedigimiz key'i yazarak
        return etmesini sagladik.
         */

        return properties.getProperty(key);
    }


}
