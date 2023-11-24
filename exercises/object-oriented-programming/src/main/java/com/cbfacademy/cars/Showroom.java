package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
    private List<Car> cars = new ArrayList<>();

    public Showroom() {
        this.cars = cars;
        cars.add(new Car("Volvo", "V40", "Blue", 2012));
        cars.add(new Car("Porsche", "Panamera", "Red", 2009));
        cars.add(new Car("Audi", "A3", "Grey", 2018));
    }
    public List<Car> getCars() {
        return cars;
    }
}
