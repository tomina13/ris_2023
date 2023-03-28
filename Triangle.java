package org.example;

public class Triangle implements Figure { //дочерний класс Треугольник
    private double side1 = 0; // одна сторона равностороннего треугольника

    public Triangle(double side1) {
        this.side1 = side1;
    }

    @Override
    public double getSquare() {
        return (Math.sqrt(3) * Math.pow(side1, 2)) / 4;
    } // пощадь треугольника

    @Override
    public double getPerimetr() {
        return side1 * 3;
    }//периметр треугольника

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }
}

