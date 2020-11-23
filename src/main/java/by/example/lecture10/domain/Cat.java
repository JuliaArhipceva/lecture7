package by.example.lecture10.domain;

public class Cat {

    private String name;
    private Integer age;
    private Integer ownerAge;

    public Cat(String name, Integer age, Integer ownerAge) {
        this.name = name;
        this.age = age;
        this.ownerAge = ownerAge;
    }

    public void showNextYearAge() {
        int nextYearAge = 1;
        if (age != null) {
            nextYearAge += age;
        }
        System.out.println("Next Year Age: " + nextYearAge);
    }

    public void showCatLifecyclesCount() {
        int lifecyclesCount = 0;
        if (age != null && age != 0) {
            lifecyclesCount = ownerAge / age;
        }
        System.out.println("Cat Lifecycles Count: " + lifecyclesCount);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ownerAge=" + ownerAge +
                '}';
    }

}
