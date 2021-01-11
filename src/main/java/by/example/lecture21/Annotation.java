package by.example.lecture21;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD})
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
public @interface Annotation {

    String value();

    int age() default 1;

}
