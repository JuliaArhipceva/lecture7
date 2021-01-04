package by.example.lecture14.domain;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    private transient String color;
    private String model;
    private double engineVolume;

    public Car() {
    }

    public Car(String color, String model, double engineVolume) {
        this.color = color;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

}
