package by.example.lecture8.innerclasses;

public class OuterClassWithMethodLocalClass {

    private static final String field = "field";

    public static void method() {

        class InnerClass {

            public void nonStaticMethod() {
                System.out.println(field);
            }

//            not allowed
//            public static void staticMethod() {
//                System.out.println(field);
//            }

        }

        InnerClass innerClassObject = new InnerClass();
        innerClassObject.nonStaticMethod();

    }

}
