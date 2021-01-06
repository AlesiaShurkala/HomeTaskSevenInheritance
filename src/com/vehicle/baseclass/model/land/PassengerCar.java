package com.vehicle.baseclass.model.land;

import com.vehicle.baseclass.model.land.LandTransport;

public class PassengerCar extends LandTransport {
    protected String bodyworkType;
    protected int passengersCount;

    public PassengerCar(double capacity, int maxSpeed, int weight, String mark, int wheelsCount, int fuelConsumption, String bodyworkType, int passengersCount) {
        super(capacity, maxSpeed, weight, mark, wheelsCount, fuelConsumption);
        this.bodyworkType = bodyworkType;
        this.passengersCount = passengersCount;
    }

    @Override
    public String description () {
        return "Максимальная скорость: " + getMaxSpeed() + "масса: " + getWeight() + "марка: " + getMark()
                + "количество колёс: " + getWheelsCount() + "расход топлива: " + getFuelConsumption() +
                "тип кузова" + getBodyworkType() + "количество пассажиров: " + getPassengersCount()
                + "мощность в лошадиных силах: " + getCapacity() + "мощность в киловаттах: "
                + getCapacity()*0.74;
    }

    public void distance (int time) {
    int distance=time*maxSpeed;
    System.out.println("За время" + time + "ч автомобиль" + getMark() + "двигаясь с максимальной скоростью"
            + getMaxSpeed() + "км/ час проедет " + distance + "км и израсходует"
            + fuelConsumptionCalculation (distance) + "литров топлива.");
    }

    private double fuelConsumptionCalculation (int distance) {
    double fuelConsumptionCalculation= distance*1.0/fuelConsumption;
    return fuelConsumptionCalculation;
    }

    public String getBodyworkType() {
        return bodyworkType;
    }

    public void setBodyworkType(String bodyworkType) {
        this.bodyworkType = bodyworkType;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }
}
