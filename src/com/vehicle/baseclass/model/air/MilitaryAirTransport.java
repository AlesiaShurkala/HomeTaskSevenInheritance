package com.vehicle.baseclass.model.air;

import com.vehicle.baseclass.model.air.AirTransport;

public class MilitaryAirTransport extends AirTransport {
    protected boolean ejectionSystem;
    protected int rocketCount;

    public MilitaryAirTransport(double capacity, int maxSpeed, int weight, String mark, int wingspan, int minLengthRunway, boolean ejectionSystem, int rocketCount) {
        super(capacity, maxSpeed, weight, mark, wingspan, minLengthRunway);
        this.ejectionSystem = ejectionSystem;
        this.rocketCount = rocketCount;
    }

    public String description () {
        return "Максимальная скорость: " + getMaxSpeed() + "масса: " + getWeight() + "марка: "
                + getMark() + "мощность в лошадиных силах: " + getCapacity() + "мощность в киловаттах: "
                + getCapacity()*0.74 + "размах крыльев: " + getWingspan()
                + "Минимальная длина взлётно-посадочной полосы для взлёта" + getMinLengthRunway()
                + "наличие системы катапультирования" + isEjectionSystem() + "количество ракет на борту"
                + getRocketCount();
    }

    public void shot(){
        if (rocketCount!=0){
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void ejectionSystem (){
        if (ejectionSystem){
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }
}
