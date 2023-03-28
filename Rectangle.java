package org.example;

public class Rectangle implements Figure {//дочерний класс Прямоугольник
    private double side1 = 0; // 1 сторона прямоугольника
    private double side2 = 0; // 2 сторона прямоугольника

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getSquare() {
        return side1 * side2;
    } // рассчет площади курга

    @Override
    public double getPerimetr() {
        return (side1 + side2) * 2;
    } // рассчет периметра курга

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
