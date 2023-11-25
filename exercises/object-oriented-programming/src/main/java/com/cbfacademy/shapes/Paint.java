package com.cbfacademy.shapes;

public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double getAmount(Shape shape) {
        double paintAmount = shape.getArea() * coverage * 0.01;
        return paintAmount;
    }
}
