package by.example.lecture10.exceptions;

public class ExampleCheckedException extends Exception {

    public static final String EXAMPLE_EXCEPTION_IS_THROWN = "Example Exception is thrown";

    public ExampleCheckedException() {
        super(EXAMPLE_EXCEPTION_IS_THROWN);
    }

    public ExampleCheckedException(String id) {
        super(EXAMPLE_EXCEPTION_IS_THROWN + String.format(" for object with id = '%s'", id));
    }

}
