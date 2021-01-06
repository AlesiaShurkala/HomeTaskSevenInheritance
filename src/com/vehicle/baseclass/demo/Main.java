package com.vehicle.baseclass.demo;

import com.vehicle.baseclass.model.air.CivilAirTransport;
import com.vehicle.baseclass.model.air.MilitaryAirTransport;
import com.vehicle.baseclass.model.land.PassengerCar;
import com.vehicle.baseclass.model.land.Truck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите тип транспорта: легковой, грузовой, военный, гражданский");
        String typeTransport=scanner.next();
        switch (typeTransport){
            case "легковой": createPassengerCars(scanner);
            break;
            case "грузовой": createTruck(scanner);
            break;
            case "военный": createMilitaryAirTransport(scanner);
            break;
            case "гражданский": createCivilAirTransport(scanner);
            break;
            default:
                System.out.println("Транспорт введён неверно, попробуйте ещё раз!");
        }
    }
    private static void createPassengerCars(Scanner scanner){
        System.out.println("Введите мощность (в лошадиных силах): ");
        double capacity=scanner.nextInt();
        System.out.println("Введите макс скорость (км/ч): ");
        int maxSpeed=scanner.nextInt();
        System.out.println("Введите массу (кг): ");
        int weight=scanner.nextInt();
        System.out.println("Введите марку машины: ");
        String mark=scanner.next();
        System.out.println("Введите количество колёс: ");
        int wheelsCount=scanner.nextInt();
        System.out.println("Введите расход топлива (л/100км): ");
        int fuelConsumption=scanner.nextInt();
        System.out.println("Введите тип кузова: ");
        String bodyworkType=scanner.next();
        System.out.println("Введите количество пассажиров: ");
        int passengersCount=scanner.nextInt();
        System.out.println("Введите время движения машины (в часах): ");
        int time=scanner.nextInt();
        PassengerCar passengerCarOne=new PassengerCar(capacity,maxSpeed,weight,mark,wheelsCount,fuelConsumption,bodyworkType,passengersCount);
        passengerCarOne.description();
        passengerCarOne.distance(time);
    }
    private static void createTruck(Scanner scanner){
        System.out.println("Введите мощность (в лошадиных силах): ");
        double capacity=scanner.nextInt();
        System.out.println("Введите макс скорость (км/ч): ");
        int maxSpeed=scanner.nextInt();
        System.out.println("Введите массу (кг): ");
        int weight=scanner.nextInt();
        System.out.println("Введите марку машины: ");
        String mark=scanner.next();
        System.out.println("Введите количество колёс: ");
        int wheelsCount=scanner.nextInt();
        System.out.println("Введите расход топлива (л/100км): ");
        int fuelConsumption=scanner.nextInt();
        System.out.println("Введите грузоподъёмность (тонн): ");
        int loadingCapacity=scanner.nextInt();
        System.out.println("Введите количество тонн груза, которые нужно загрузить в грузовой автомобиль: ");
        int loadingCurrent=scanner.nextInt();
        Truck truckOne=new Truck(capacity,maxSpeed,weight,mark,wheelsCount,fuelConsumption,loadingCapacity);
        truckOne.description();
        truckOne.loadingCapacityCalculation(loadingCurrent);
    }
    private static void createMilitaryAirTransport(Scanner scanner){
        System.out.println("Введите мощность (в лошадиных силах): ");
        double capacity=scanner.nextInt();
        System.out.println("Введите макс скорость (км/ч): ");
        int maxSpeed=scanner.nextInt();
        System.out.println("Введите массу (кг): ");
        int weight=scanner.nextInt();
        System.out.println("Введите марку машины: ");
        String mark=scanner.next();
        System.out.println("Введите размах крыльев (м): ");
        int wingspan=scanner.nextInt();
        System.out.println("Введите минимальную длину взлётно-посадочной полосы для взлёта (м): ");
        int minLengthRunway=scanner.nextInt();
        System.out.println("Есть ли система катапультирования (true/false): ");
        boolean ejectionSystem=scanner.nextBoolean();
        System.out.println("Введите количество ракет на борту: ");
        int rocketCount=scanner.nextInt();
        MilitaryAirTransport militaryAirTransportOne=new MilitaryAirTransport(capacity,maxSpeed,weight,mark,wingspan,minLengthRunway,ejectionSystem,rocketCount);
        militaryAirTransportOne.description();
        militaryAirTransportOne.ejectionSystem();
        militaryAirTransportOne.shot();
    }
    private static void createCivilAirTransport(Scanner scanner){
        System.out.println("Введите мощность (в лошадиных силах): ");
        double capacity=scanner.nextInt();
        System.out.println("Введите макс скорость (км/ч): ");
        int maxSpeed=scanner.nextInt();
        System.out.println("Введите массу (кг): ");
        int weight=scanner.nextInt();
        System.out.println("Введите марку машины: ");
        String mark=scanner.next();
        System.out.println("Введите размах крыльев (м): ");
        int wingspan=scanner.nextInt();
        System.out.println("Введите минимальную длину взлётно-посадочной полосы для взлёта (м): ");
        int minLengthRunway=scanner.nextInt();
        System.out.println("Введите количество пассажиров: ");
        int passengersCount=scanner.nextInt();
        System.out.println("Есть ли бизнес класс в самолёте (true/false): ");
        boolean businessClass=scanner.nextBoolean();
        System.out.println("Введите количество пассажиров, которые планируются на этот рейс: ");
        int currentPassengersCount=scanner.nextInt();
        CivilAirTransport civilAirTransportOne=new CivilAirTransport(capacity,maxSpeed,weight,mark,wingspan,minLengthRunway,passengersCount,businessClass);
        civilAirTransportOne.description();
        civilAirTransportOne.passengersCapacityCalculation(currentPassengersCount);
    }
}
