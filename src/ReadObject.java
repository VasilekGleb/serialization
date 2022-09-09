import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public void read() {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\IDEtext\\serialization\\serialization.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person =(Person) objectInputStream.readObject();
            System.out.println(person);
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
