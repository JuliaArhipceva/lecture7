package by.example.lecture21;

import java.util.Random;

@Annotation("value")
public class Cat implements Animal {

    private static final Random RANDOM = new Random();

    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    @Annotation(value = "name", age = 3)
    public void move() {
        System.out.println("I moved on " + generateStepsCount() + " steps");
    }

    private int generateStepsCount() {
        return RANDOM.nextInt(10);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
