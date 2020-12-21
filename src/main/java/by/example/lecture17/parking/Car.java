package by.example.lecture17.parking;

import static by.example.lecture17.parking.App.PARKING;

public class Car extends Thread {

    private static final String CAR_IS_PARKED = "Car %s is parked for %d milliseconds.";

    private final int maxWaitTime;
    private final int stayTime;

    public Car(String name, int maxWaitTime, int stayTime) {
        super(name);
        this.maxWaitTime = maxWaitTime;
        this.stayTime = stayTime;
    }

    public int getMaxWaitTime() {
        return maxWaitTime;
    }

    public int getStayTime() {
        return stayTime;
    }

    @Override
    public void run() {
        PARKING.tryPark(this);
    }

    public void park() {
        try {
            System.out.println(String.format(CAR_IS_PARKED, getName(), stayTime));
            sleep(stayTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxWaitTime=" + maxWaitTime +
                ", stayTime=" + stayTime +
                '}';
    }

}
