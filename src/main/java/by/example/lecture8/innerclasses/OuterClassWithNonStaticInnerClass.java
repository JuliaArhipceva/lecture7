package by.example.lecture8.innerclasses;

public class OuterClassWithNonStaticInnerClass {

    public class InnerClass {

        public void nonStaticMethod() {
            System.out.println("non-static inner class non-static method");
        }

//        not allowed
//        public static void staticMethod() {
//            System.out.println("non-static inner class static method");
//        }

    }

    public void method() {
        InnerClass innerClassObject = new InnerClass();
        innerClassObject.nonStaticMethod();
    }

}
