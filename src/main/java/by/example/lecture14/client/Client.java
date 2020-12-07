package by.example.lecture14.client;

import by.example.lecture14.domain.Car;
import by.example.lecture14.persistance.DB;

public class Client {

    public static void main(String[] args) {

        DB.loadDb();
        DB.showDb();

        System.out.println("New car is added.");
        DB.CARS.add(new Car("yellow", "Porsche", 3.6));
        DB.showDb();

        DB.saveDb();

    }

}
