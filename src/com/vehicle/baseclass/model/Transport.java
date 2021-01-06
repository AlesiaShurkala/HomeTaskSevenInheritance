package com.vehicle.baseclass.model;

public abstract class Transport {
    protected double capacity;
    protected int maxSpeed;
    protected int weight;
    protected String mark;

    public Transport(double capacity, int maxSpeed, int weight, String mark) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;
    }

    public abstract String description ();

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
