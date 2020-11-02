package by.example.lecture8.innerclasses;

public class OuterClassWithAnonymousClass {

    private interface Interface {
        void interfaceMethod();
    }

    public static void method() {

        Interface interfaceObject = new Interface() {
            @Override
            public void interfaceMethod() {
                System.out.println("interface method of anonymous class");
            }
        };

//        lambda example
//        Interface interfaceObject = () ->
//                System.out.println("interface method of anonymous class");

        interfaceObject.interfaceMethod();

    }

}
