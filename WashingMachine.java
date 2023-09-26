package org.example;

public class WashingMachine extends Electrical {
    private double size;

    public WashingMachine(String name, double power, double size) {
        super(name, power);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String tostring() {
        return "WashingMachine{" + "name='" + getName() + '\'' + ", power=" + getPower() + ", size=" + size + '}';
    }
}
