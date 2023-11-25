package com.cbfacademy.shapes;

public class Sphere extends Shape {
    private String name = "Sphere";
    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = 4 * Math.PI *(radius * radius);
        return area;
    }
    @Override
    public String getName() {
        return name;
    }
}
