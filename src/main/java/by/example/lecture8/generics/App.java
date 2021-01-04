package by.example.lecture8.generics;

import java.util.UUID;

public class App {

    public static void main(String[] args) {


    }

    private static void showConstructorAndMethodGenerics() {
        UsualClass usualClass = new UsualClass("12");
        System.out.println(usualClass);

//        exception
//        usualClass = new UsualClass("gfdgh");
//        System.out.println(usualClass);

        usualClass.method("string");
        usualClass.method(17);
        usualClass.method(true);
    }

    private static void showGenericInterface() {
        GenericInterface<String> genericInterface = new GenericInterface<String>() {

            @Override
            public String method() {
                return UUID.randomUUID().toString();
            }

            @Override
            public void method(String parameter) {
                System.out.println(parameter);
            }

        };

        String uuid = genericInterface.method();
        genericInterface.method(uuid);
    }

    private static void showTwoGenerics() {
        TwoGenericsClass<String, Integer> twoGenericsClass =
                new TwoGenericsClass<>("str", 12);

        TwoGenericsClassImpl<Boolean> twoGenericsClass1 =
                new TwoGenericsClassImpl<>();
    }

    private static void showOneGeneric() {
        GenericClassString genericClassString = new GenericClassString("field");
        System.out.println(genericClassString);

        GenericClass<String> stringGeneric = new GenericClass<>("str");
        System.out.println(stringGeneric);

        Model model = new Model();
        GenericClass<Model> modelGeneric = new GenericClass<>(model);
        System.out.println(modelGeneric);
    }

}
