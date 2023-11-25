package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    private String name = "Rectangle";
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public String getName() {
        return name;
    }
}
