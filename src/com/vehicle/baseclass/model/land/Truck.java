package com.vehicle.baseclass.model.land;

import com.vehicle.baseclass.model.land.LandTransport;

public class Truck extends LandTransport {
    protected int loadingCapacity;

    public Truck(double capacity, int maxSpeed, int weight, String mark, int wheelsCount, int fuelConsumption, int loadingCapacity) {
        super(capacity, maxSpeed, weight, mark, wheelsCount, fuelConsumption);
        this.loadingCapacity = loadingCapacity;
    }

    public void loadingCapacityCalculation (int loadingCurrent){
        if (loadingCurrent<=loadingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public String description () {
        return "Максимальная скорость: " + getMaxSpeed() + "масса: " + getWeight() + "марка: "
                + getMark() + "количество колёс: " + getWheelsCount() + "расход топлива: "
                + getFuelConsumption() + "мощность в лошадиных силах: " + getCapacity()
                + "мощность в киловаттах: " + getCapacity()*0.74 + "грузоподъёмность: "
                + getLoadingCapacity();
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
}
