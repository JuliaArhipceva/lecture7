package by.example.lecture7.domain.impl;

import by.example.lecture7.domain.ElectricalAppliance;

public class Kettle extends ElectricalAppliance {

    private int volume;

    public Kettle(String name, int power, int volume) {
        super(name, power);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", volume=" + volume;
    }

}
