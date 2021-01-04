package by.example.lecture7.domain.impl;

import by.example.lecture7.domain.ElectricalAppliance;

public class TV extends ElectricalAppliance {

    private int diagonal;

    public TV(String name, int power, int diagonal) {
        super(name, power);
        this.diagonal = diagonal;
    }

    @Override
    public int plug() {
        System.out.println("Hooray! TV is on!");
        return super.plug();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", diagonal=" + diagonal;
    }

}
