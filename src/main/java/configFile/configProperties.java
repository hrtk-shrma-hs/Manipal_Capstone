package configFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configProperties {

    public static Properties property;
    public static String configFilePath = "src/main/java/configFile/config.properties";

    public static void initializePropertyFile() {
        property = new Properties();
        try {
            InputStream instm = new FileInputStream(configFilePath);
            property.load(instm);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}