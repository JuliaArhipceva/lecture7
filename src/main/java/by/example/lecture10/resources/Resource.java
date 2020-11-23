package by.example.lecture10.resources;

import java.io.IOException;

public class Resource implements AutoCloseable {

    public Resource() {
    }

    public void use() {
        System.out.println("Resource is used.");
    }

    public void dangerousUse() throws IllegalAccessException, IOException {

        System.out.println("Dangerous resource is used.");

        int random = (int) (Math.random() * 10);
        if (random % 2 == 0) {
            throw new IllegalAccessException("reason");
        } else {
            throw new IOException();
        }

    }

    @Override
    public void close() {
        System.out.println("Resource is closed.");
    }

}
