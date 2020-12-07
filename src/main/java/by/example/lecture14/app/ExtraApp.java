package by.example.lecture14.app;

import by.example.lecture14.domain.Motorcycle;

import java.io.*;

public class ExtraApp {

    private static final String FILENAME = "src/main/resources/serialization/file.txt";


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME));
        Motorcycle motorcycle = new Motorcycle("Jawa", "red");
        System.out.println(motorcycle);

        motorcycle.writeExternal(oos);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME));
        Motorcycle newMoto = new Motorcycle();
        newMoto.readExternal(ois);

        System.out.println(newMoto);

    }

}
