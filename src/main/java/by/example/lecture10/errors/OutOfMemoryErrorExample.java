package by.example.lecture10.errors;

/*
-Xmx4096m
 */
public class OutOfMemoryErrorExample {

    public static void main(String[] args) {
        method("str");
    }

    public static void method(String str) {
        System.out.println("str: " + str);
        System.out.println("str length: " + str.length());
        str += str;
        method(str);
    }

    /*
    1. 2048: 201326592
    2. 1024: 100663296
    3. 4096: 402653184
     */

}
