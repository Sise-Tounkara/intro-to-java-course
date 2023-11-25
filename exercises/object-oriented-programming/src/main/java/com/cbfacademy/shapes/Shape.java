package com.cbfacademy.shapes;

public abstract class Shape {
    private String name;

    public Shape() {
    }
    public abstract double getArea();

    public String getName() {
        return name;
    }

}
