package by.example.lecture8.generics;

import java.util.UUID;

public class Model {

    private String name;
    private int number;

    public Model() {
        name = UUID.randomUUID().toString();
        number = (int) (Math.random() * 10);
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

}
