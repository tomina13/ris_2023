package org.example;

public class Ellipse implements Figure { // дочерний класс Эллипс
    private double side1 = 0; // 1 полуось эллипса
    private double side2 = 0; // 2 полуось эллипса

    public Ellipse(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getSquare() {
        return Math.PI* side1 * side2; //площадь эллипса
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * Math.sqrt((Math.pow(side1, 2) + Math.pow(side2, 2))/2 ); //периметр эллипса
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
}

