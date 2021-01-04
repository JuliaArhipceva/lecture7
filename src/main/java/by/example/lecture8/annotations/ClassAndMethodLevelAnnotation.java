package by.example.lecture8.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, METHOD})
public @interface ClassAndMethodLevelAnnotation {

    String value() default "value";

}
