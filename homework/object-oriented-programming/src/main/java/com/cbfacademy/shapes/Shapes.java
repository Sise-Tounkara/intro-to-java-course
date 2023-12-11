package com.cbfacademy.shapes;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    private List<Enclosure> enclosuresList = new ArrayList<>();
    public static double computeArea(List<Enclosure> enclosuresList) {
        double sumOfArea = 0;
        for (int i = 0; i < enclosuresList.size(); i++) {
            sumOfArea += enclosuresList.get(i).area();
        }
        return sumOfArea;
    }

    public static double computePerimeter(List<Enclosure> enclosuresList) {
        double sumOfPerimeter = 0;
        for (int i = 0; i < enclosuresList.size(); i++) {
            sumOfPerimeter += enclosuresList.get(i).perimeter();
        }
        return sumOfPerimeter;
    }

    public static void main(String[] args) {
        List<Enclosure> squares = new ArrayList<>();
        squares.add(new Square(5));
        squares.add(new Square(10));
        squares.add(new Square(7));
        squares.add(new Square(8));

        System.out.println(computeArea(squares));
        System.out.println(computePerimeter(squares));
    }


}
