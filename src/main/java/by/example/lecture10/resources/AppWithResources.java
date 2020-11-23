package by.example.lecture10.resources;

import java.io.IOException;

public class AppWithResources {

    public static void main(String[] args) {

        Resource resource = null;

        try {
            resource = new Resource();
            resource.use();
        } finally {
            resource.close();
        }

        System.out.println();

        try (Resource anotherResource = new Resource()) {
            anotherResource.use();
        }

        System.out.println();

        try (Resource anotherResource = new Resource()) {
            anotherResource.use();
            anotherResource.dangerousUse();
        } catch (IllegalAccessException | IOException e) {
            e.printStackTrace();
        }

    }

}
