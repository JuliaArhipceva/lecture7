package by.example.lecture8.innerclasses;

public class OuterClassWithStaticInnerClass {

    public static class InnerClass {

        public static void staticMethod() {
            System.out.println("static inner class static method");
        }

        public void nonStaticMethod() {
            System.out.println("static inner class non-static method");
        }

    }

}
