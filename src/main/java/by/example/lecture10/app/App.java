package by.example.lecture10.app;

import by.example.lecture10.domain.Cat;

public class App {

    public static void main(String[] args) {

        Cat cat = new Cat("Fluffy", 3, 27);
        System.out.println(cat);
        cat.showNextYearAge();
        cat.showCatLifecyclesCount();
        System.out.println();

        cat = new Cat(null, 3, 27);
        System.out.println(cat);
        cat.showNextYearAge();
        cat.showCatLifecyclesCount();
        System.out.println();

        cat = new Cat(null, 0, 27);
        System.out.println(cat);
        cat.showNextYearAge();
        cat.showCatLifecyclesCount();
        System.out.println();

        cat = new Cat(null, null, 27);
        System.out.println(cat);
        cat.showNextYearAge();
        cat.showCatLifecyclesCount();

    }

}
