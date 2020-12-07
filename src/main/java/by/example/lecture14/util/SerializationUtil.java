package by.example.lecture14.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Non-compliant solution
public class SerializationUtil {

    private static final String FILENAME = "src/main/resources/serialization/file.txt";
    private static ObjectOutputStream OOS;

    static {
        try {
            OOS = new ObjectOutputStream(new FileOutputStream(FILENAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializeObject(Object object, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(object);
        } catch (IOException e) {
            System.out.println("An exception occurred during serialization.");
            e.printStackTrace();
        }
    }

    public static void serializeUsingBuffer(Object object) {
        try {
            OOS.writeObject(object);
        } catch (IOException e) {
            System.out.println("An exception occurred during serialization.");
            e.printStackTrace();
        }
    }

}
