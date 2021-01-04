package by.example.lecture11.lambdas;

public class Example11Lambdas {

    public static void main(String[] args) {

//        AnotherInterface anotherInterfaceObject = new AnotherInterface() {
//            @Override
//            public void method(String strParam, Integer intParam) {
//                System.out.println("params: " + strParam + ", " + intParam);
//            }
//        };

//        AnotherInterface anotherInterfaceObject = (name, age) ->
//                System.out.println("params: " + name + ", " + age);

        AnotherInterface anotherInterfaceObject = (name, age) -> {
            System.out.println("name: " + name);
            System.out.println("age: " + age);
        };

        anotherInterfaceObject.method("Fluffy", 3);
//        anotherInterfaceObject.method("Fluffy", "str");

    }

    private static void showOneParameter() {
        //        Interface interfaceObject = new Interface() {
//            @Override
//            public void method(String parameter) {
//                System.out.println("parameter: " + parameter);
//            }
//        };
//        interfaceObject.method("str");

//        Interface interfaceObject = (String parameter) -> {
//            System.out.println("parameter: " + parameter);
//        };
//        interfaceObject.method("str");

//        Interface interfaceObject = (parameter) -> {
//            System.out.println("parameter: " + parameter);
//        };
//        interfaceObject.method("str");

//        Interface interfaceObject = parameter -> {
//            System.out.println("parameter: " + parameter);
//        };
//        interfaceObject.method("str");

//        Interface interfaceObject = parameter -> System.out.println("parameter: " + parameter);
//        interfaceObject.method("str");
//
//        Interface interfaceObject = parameter -> System.out.println("parameter: " + parameter);
//        interfaceObject.method("str");

//        Interface interfaceObject = parameter -> System.out.println(parameter);
//        interfaceObject.method("str");

//        Interface interfaceObject = System.out::println;
//        interfaceObject.method("str");
    }


}
