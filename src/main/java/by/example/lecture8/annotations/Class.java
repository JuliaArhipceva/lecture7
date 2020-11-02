package by.example.lecture8.annotations;

@ClassLevelAnnotation(name = "annotation name", count = 17)
@ClassAndMethodLevelAnnotation
public class Class {

    //    not allowed
//    @ClassLevelAnnotation(name = "name")
    @ClassAndMethodLevelAnnotation
    public void method() {
        System.out.println("method");
    }

}
