import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead {

    public <T> T objectRead(Class<T> type) {
        T obj;
        try {
            FileInputStream fileInputStream = new FileInputStream(new MyProperties().properties());
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            obj = type.cast(objectInputStream.readObject());
            System.out.println();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
}
