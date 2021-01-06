package com.vehicle.baseclass.model.land;

import com.vehicle.baseclass.model.Transport;

public abstract class LandTransport extends Transport {
    protected int wheelsCount;
    protected int fuelConsumption;

    public LandTransport(double capacity, int maxSpeed, int weight, String mark, int wheelsCount, int fuelConsumption) {
        super(capacity, maxSpeed, weight, mark);
        this.wheelsCount = wheelsCount;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public LandTransport(double capacity, int maxSpeed, int weight, String mark) {
        super(capacity, maxSpeed, weight, mark);
    }
}
