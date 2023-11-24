package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Showroom showroomOne = new Showroom();
        //List carsInShowroomOne = showroomOne.getCars();
        for (Car car : showroomOne.getCars()){
            System.out.println(car.getDetails());
        }
    }


}
