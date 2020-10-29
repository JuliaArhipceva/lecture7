package by.example.lecture7.domain.impl;

import by.example.lecture7.domain.ElectricalAppliance;

public class VacuumCleaner extends ElectricalAppliance {

    private int numberOfModes;

    public VacuumCleaner(String name, int power, int numberOfModes) {
        super(name, power);
        this.numberOfModes = numberOfModes;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numberOfModes=" + numberOfModes;
    }

}
