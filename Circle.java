package org.example;

public class Circle implements Figure { // дочерний класс Круг
    private double radius = 0;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getSquare(){
        return Math.PI * Math.pow(radius, 2);
    } // рассчет площади курга

    public double getPerimetr(){
        return Math.PI * 2 * radius;
    } // рассчет перимерта курга

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
