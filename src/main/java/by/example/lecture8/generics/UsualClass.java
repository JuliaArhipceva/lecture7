package by.example.lecture8.generics;

public class UsualClass {

    private int number;

    public <T> UsualClass(T number) {
        this.number = Integer.parseInt(number.toString());
    }

    public <T> void method(T parameter) {
        if (parameter instanceof Integer) {
            System.out.println("integer parameter");
            return;
        }
        if (parameter instanceof String) {
            System.out.println("string parameter");
            return;
        }
        System.out.println("unknown type parameter");
    }

    @Override
    public String toString() {
        return "UsualClass{" +
                "number=" + number +
                '}';
    }

}
