package by.example.lecture10;

import by.example.lecture10.exceptions.ExampleCheckedException;
import by.example.lecture10.exceptions.ExampleUncheckedException;

import java.util.Objects;
import java.util.UUID;

public class Example10 {

    public static boolean FLAG = true;

    public static void main(String[] args) {

        System.out.println("before method with checked exception");
        try {
            methodThrowsCheckedException();
        } catch (ExampleCheckedException e) {
            e.printStackTrace();
        }
        System.out.println("after method with checked exception");


        System.out.println("before method with unchecked exception");
        if (!FLAG) {
            methodThrowsUncheckedException();
        }
        System.out.println("after method with unchecked exception");

    }

    public static void methodThrowsCheckedException() throws ExampleCheckedException {
        System.out.println("checked method is running");
        throw new ExampleCheckedException(UUID.randomUUID().toString());
    }

    public static void methodThrowsUncheckedException() {
        System.out.println("unchecked method is running");
        if (FLAG) {
            throw new ExampleUncheckedException();
        }
    }

}
