package by.example.lecture8.generics;

public class GenericClass<T> {

    private T field;

    public GenericClass() {
    }

    public GenericClass(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "field=" + field +
                '}';
    }

}
