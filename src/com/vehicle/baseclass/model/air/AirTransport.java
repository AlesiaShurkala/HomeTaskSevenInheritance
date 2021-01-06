package com.vehicle.baseclass.model.air;

import com.vehicle.baseclass.model.Transport;

public abstract class AirTransport extends Transport {
    protected int wingspan;
    protected int minLengthRunway;

    public AirTransport(double capacity, int maxSpeed, int weight, String mark, int wingspan, int minLengthRunway) {
        super(capacity, maxSpeed, weight, mark);
        this.wingspan = wingspan;
        this.minLengthRunway = minLengthRunway;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinLengthRunway() {
        return minLengthRunway;
    }

    public void setMinLengthRunway(int minLengthRunway) {
        this.minLengthRunway = minLengthRunway;
    }
}
