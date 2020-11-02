package by.example.lecture8.generics;

public class TwoGenericsClass<T, S> {

    private T field;
    private S anotherField;

    public TwoGenericsClass() {
    }

    public TwoGenericsClass(T field, S anotherField) {
        this.field = field;
        this.anotherField = anotherField;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public S getAnotherField() {
        return anotherField;
    }

    public void setAnotherField(S anotherField) {
        this.anotherField = anotherField;
    }

    @Override
    public String toString() {
        return "TwoGenericsClass{" +
                "field=" + field +
                ", anotherField=" + anotherField +
                '}';
    }

}
