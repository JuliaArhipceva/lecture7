package by.example.lecture14.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationUtil {

    public static Object deserializeObject(String filename) {
        Object returnObject = null;
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            returnObject = ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("An exception occurred during deserialization.");
            e.printStackTrace();
        }
        return returnObject;
    }

}
