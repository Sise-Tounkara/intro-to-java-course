package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    private String name = "Cylinder";
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = radius * Math.PI * Math.pow(height, 2);
        return area;
    }
    @Override
    public String getName() {
        return name;
    }
}
