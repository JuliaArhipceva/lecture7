package by.example.lecture8.innerclasses;

public class App {

    public static void main(String[] args) {

    }

    private static void showBuilder() {
        Model.Builder builder = new Model.Builder();
//        builder.withId("id").withName("name");
        builder.withId("id");
        Model builtModel = builder.build();
    }

    private static void showOuterClassWithAnonymousClass() {
        OuterClassWithAnonymousClass.method();
    }

    private static void showOuterClassWithMethodLocalClass() {
        OuterClassWithMethodLocalClass.method();
    }

    private static void showOuterClassWithStaticInnerClass() {
        OuterClassWithStaticInnerClass.InnerClass.staticMethod();

        OuterClassWithStaticInnerClass.InnerClass innerClassObject =
                new OuterClassWithStaticInnerClass.InnerClass();
        innerClassObject.nonStaticMethod();
    }

    private static void showOuterClassWithNonStaticInnerClass() {
        //        not allowed
//        OuterClassWithNonStaticInnerClass.InnerClass innerClass =
//                new OuterClassWithNonStaticInnerClass.InnerClass();

        OuterClassWithNonStaticInnerClass outerClassObject =
                new OuterClassWithNonStaticInnerClass();
        outerClassObject.method();

//        not allowed
//        outerClassObject.InnerClass innerClassObject =
//                new OuterClassWithNonStaticInnerClass.InnerClass();
    }

}
