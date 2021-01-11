package by.example.lecture21;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws InstantiationException {

        Cat cat = new Cat("Fluffy", 3);
        System.out.println(cat.toString());
        cat.move();

        Class<Cat> catClass = Cat.class;
//
//        System.out.println(catClass.getName()); // with package
//        System.out.println(catClass.getSimpleName()); // without package
//        System.out.println(catClass.getModifiers());
//        System.out.println(catClass.getComponentType());
//        System.out.println(catClass.getSuperclass());
//
//        System.out.println("getDeclaredFields");
//        Arrays.stream(catClass.getDeclaredFields()).forEach(System.out::println);
//        System.out.println("getClasses");
//        Arrays.stream(catClass.getClasses()).forEach(System.out::println);
//        System.out.println("getConstructors");
//        Arrays.stream(catClass.getConstructors()).forEach(System.out::println);
//        System.out.println("getDeclaredMethods");
//        Arrays.stream(catClass.getDeclaredMethods()).forEach(System.out::println);
//        System.out.println("getMethods");
//        Arrays.stream(catClass.getMethods()).forEach(System.out::println);
//        System.out.println("getInterfaces");
//        Arrays.stream(catClass.getInterfaces()).forEach(System.out::println);
//
//        Class<? extends Cat> aClass = cat.getClass();
//
//        try {
//            Class<?> aClass1 = Class.forName("by.example.lecture21.Cat");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Cat cat1 = catClass.newInstance();
//            System.out.println(cat1);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

        try {
            Field fieldName = catClass.getDeclaredField("name");
            fieldName.setAccessible(true);
            Object o = fieldName.get(cat);
            System.out.println(o);

            Method generateStepsCountMethod = catClass.getDeclaredMethod("generateStepsCount");
            generateStepsCountMethod.setAccessible(true);
            Object invoke = generateStepsCountMethod.invoke(cat);
            System.out.println(invoke);

        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }

}
