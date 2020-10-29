package by.example.lecture7.domain;

public abstract class ElectricalAppliance implements Pluggable {

    private String name;
    private int power;
    private boolean isOn;

    public ElectricalAppliance(String name, int power) {
        this.name = name;
        this.power = power;
    }

    //    public int plug() {
//        System.out.println("name: " + name + " is plugged");
//        int resultPower = isOn ? 0 : power;
//        isOn = true;
//        return resultPower;
//    }

    public int plug() {
        System.out.println("name: " + name + " is plugged");
        if (isOn) {
            return 0;
        }
        isOn = true;
        return power;
    }

    public int unplug() {
        System.out.println("name: " + name + " is unplugged");
        if (isOn) {
            isOn = false;
            return power;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", power=" + power;
    }

}
