package com.cbfacademy.cars;

public class App {
    public static void main(String[] args) {
        Showroom showroomOne = new Showroom();
        //List carsInShowroomOne = showroomOne.getCars();
        for (Car car : showroomOne.getCars()){
            System.out.println(car.getDetails());
        }
    }


}
