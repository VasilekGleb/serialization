import java.util.Properties;

public class MyProperties {
    public String properties(){
        Properties prop = new Properties();
        prop.setProperty("pathFile","C:\\IDEtext\\serialization\\serialization.txt");
        return prop.getProperty("pathFile");
    }
}
