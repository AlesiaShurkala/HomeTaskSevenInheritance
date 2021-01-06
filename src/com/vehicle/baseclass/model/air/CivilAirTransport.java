package com.vehicle.baseclass.model.air;

import com.vehicle.baseclass.model.air.AirTransport;

public class CivilAirTransport extends AirTransport {
    protected int passengersCount;
    protected boolean businessClass;

    public CivilAirTransport(double capacity, int maxSpeed, int weight, String mark, int wingspan, int minLengthRunway, int passengersCount, boolean businessClass) {
        super(capacity, maxSpeed, weight, mark, wingspan, minLengthRunway);
        this.passengersCount = passengersCount;
        this.businessClass = businessClass;
    }

    public void passengersCapacityCalculation (int currentPassengersCount){
        if (currentPassengersCount<=passengersCount) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }

    public String description () {
        return "Максимальная скорость: " + getMaxSpeed() + "масса: " + getWeight() + "марка: "
                + getMark() + "мощность в лошадиных силах: " + getCapacity() + "мощность в киловаттах: "
                + getCapacity()*0.74 + "размах крыльев: " + getWingspan()
                + "Минимальная длина взлётно-посадочной полосы для взлёта"
                + getMinLengthRunway() + "количество пассажиров" + getPassengersCount() + "наличие бизнес класса"
                + isBusinessClass();
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
}
