import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite  {
    public <T> boolean objectWrite (T object) {
        boolean result = true;
        try (FileOutputStream fileOutputStream = new FileOutputStream(new PropertiesUtil().getProperties());
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){

            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            result = false ;
        }
        return result;
    }
}
