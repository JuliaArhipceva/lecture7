package by.example.lecture14.app;

import by.example.lecture14.domain.Car;
import by.example.lecture14.util.DeserializationUtil;
import by.example.lecture14.util.SerializationUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static final String CAR_FILENAME = "src/main/resources/serialization/car.txt";
    private static final String CARS_FILENAME = "src/main/resources/serialization/cars.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("SERIALIZATION one car");
        Car car = new Car("black", "BMW", 4.4);
        System.out.println("Car before serialization");
        System.out.println(car);
        SerializationUtil.serializeObject(car, CAR_FILENAME);

        System.out.println("DESERIALIZATION one car");
        Object readObject = DeserializationUtil.deserializeObject(CAR_FILENAME);
        if (readObject instanceof Car) {
            Car carFromFile = (Car) readObject;
            System.out.println("Car after serialization");
            System.out.println(carFromFile);
        }

//        System.out.println("SERIALIZATION cars");
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("black", "BMW", 4.4));
//        cars.add(new Car("white", "Audi", 4.0));
//        cars.add(new Car("silver", "Mercedes", 6.3));
//        System.out.println("Cars before serialization");
//        System.out.println(cars);
//        SerializationUtil.serializeObject(cars, CARS_FILENAME);
//
//        System.out.println("DESERIALIZATION cars");
//        Object deserializedObject = DeserializationUtil.deserializeObject(CARS_FILENAME);
//        if (deserializedObject instanceof ArrayList) {
//            List<Car> carsFromFile = (ArrayList<Car>) deserializedObject;
//            System.out.println("Car after serialization");
//            System.out.println(carsFromFile);
//        }

//        non-compliant solution
//        System.out.println("SERIALIZATION car by car");
//        SerializationUtil.serializeUsingBuffer(cars.get(0));
//        SerializationUtil.serializeUsingBuffer(cars.get(1));
//        SerializationUtil.serializeUsingBuffer(cars.get(2));

    }

}
