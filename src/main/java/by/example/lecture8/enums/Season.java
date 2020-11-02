package by.example.lecture8.enums;

public enum Season {

    WINTER,
    SPRING(10),
    SUMMER(25),
    FALL;

    private int temperature;

    Season() {

    }

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public static void method() {
        System.out.println("enum method");
    }

}
