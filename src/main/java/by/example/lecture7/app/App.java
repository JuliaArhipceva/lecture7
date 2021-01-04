package by.example.lecture7.app;

import by.example.lecture7.domain.impl.Kettle;
import by.example.lecture7.domain.impl.TV;
import by.example.lecture7.domain.impl.VacuumCleaner;

public class App {
    public static void main(String[] args) {

        // create objects
        TV tv = new TV("LG", 300, 55);
        VacuumCleaner vacuumCleaner = new VacuumCleaner("Philips",
                1500,
                5);
        Kettle kettle = new Kettle("bork", 1000, 2000);

        // show objects
        System.out.println(tv);
        System.out.println(kettle);
        System.out.println(vacuumCleaner);

        // power consumption
        int allPower = 0;

        // plugging of appliances
        int tvPower = tv.plug();
        allPower += tvPower;
        tvPower = tv.plug();
        allPower += tvPower;
        int kettlePower = kettle.plug();
        allPower += kettlePower;

        // unplugging of appliances
        allPower -= kettle.unplug();
        allPower -= kettle.unplug();

        System.out.println("power: " + allPower);

    }
}
