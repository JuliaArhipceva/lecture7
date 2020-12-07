package by.example.lecture14.persistance;

import by.example.lecture14.domain.Car;
import by.example.lecture14.util.DeserializationUtil;
import by.example.lecture14.util.SerializationUtil;

import java.util.ArrayList;

public class DB {

    public static ArrayList<Car> CARS = new ArrayList<>();

    private static final String DB_FILENAME = "src/main/resources/serialization/db.txt";

    public static void loadDb() {
        Object deserializedObject = DeserializationUtil.deserializeObject(DB_FILENAME);
        if (deserializedObject instanceof ArrayList) {
            CARS = (ArrayList<Car>) deserializedObject;
            System.out.println("DB was loaded.");
        }
    }

    public static void saveDb() {
        SerializationUtil.serializeObject(CARS, DB_FILENAME);
        System.out.println("DB was saved.");
    }

    public static void showDb() {
        CARS.forEach(System.out::println);
    }

}
