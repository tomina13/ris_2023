package org.example;

import java.io.*;

abstract class Electrical implements Serializable {
    String name;
    double power;

    public Electrical(String name, double power) {
        this.name=name;
        this.power=power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Electrical{" + "name='" + name + '\'' + ", power=" + power + '}';
    }

    public abstract String tostring();
}