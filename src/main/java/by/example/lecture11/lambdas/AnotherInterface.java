package by.example.lecture11.lambdas;

@FunctionalInterface
public interface AnotherInterface {

    void method(String strParam, Integer intParam);

    default void anotherMethod(String strParam, Integer intParam) {

    }

}
