import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public void write(String name, int age) {
        Person person = new Person(name, age);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\IDEtext\\serialization\\serialization.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person);

            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
