import java.io.File;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {
        WriteObject writeObject = new WriteObject();
        writeObject.write("bob",19);
        ReadObject readObject = new ReadObject();
        readObject.read();
    }
}
