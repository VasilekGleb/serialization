
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesUtil {
    public String getProperties() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("resources/app.properties");
        properties.load(fileInputStream);
        return properties.getProperty("pathFile");
    }
}
