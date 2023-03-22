package org.example;

public class Main {
    public static void main(String[] args){

        System.out.println("Круг");
        Circle circle = new Circle(10);
        System.out.println("Площадь");
        System.out.println(circle.getSquare());
        System.out.println("Периметр");
        System.out.println(circle.getPerimetr());
        System.out.println("Прямоугольник");
        Rectangle rectangle = new Rectangle(5,7);
        System.out.println("Площадь");
        System.out.println(rectangle.getSquare());
        System.out.println("Периметр");
        System.out.println(rectangle.getPerimetr());
        System.out.println("Треугольник");
        Triangle triangle = new Triangle(5);
        System.out.println("Площадь");
        System.out.println(triangle.getSquare());
        System.out.println("Периметр");
        System.out.println(triangle.getPerimetr());
        System.out.println("Эллипс");        Ellipse ellipse = new Ellipse(5,7);
        System.out.println("Площадь");
        System.out.println(ellipse.getSquare());
        System.out.println("Периметр");
        System.out.println(ellipse.getPerimetr());

    }

}