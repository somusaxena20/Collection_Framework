import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args)throws Exception {
        Properties p = new Properties();

        FileInputStream fis = new FileInputStream("map/abc.properties");

        p.load(fis);

        System.out.println(p);

        FileOutputStream fos = new FileOutputStream("map/abc.properties");

        p.setProperty("spring.company", "NTT");

        p.store(fos, "SOMU ADDED PROPERTY");

        System.out.println(p);
    }
}
