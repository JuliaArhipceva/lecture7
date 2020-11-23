package by.example.lecture10.errors;

/*
-Xss4m
 */
public class StackOverflowErrorExample {

    public static int counter = 0;

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        System.out.println(counter++);
        method();
    }

}
