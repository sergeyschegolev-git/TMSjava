package com.car.tms.service;

import com.car.tms.models.Car;
import com.car.tms.models.Engine;
import com.car.tms.models.PetrolBank;

public class Homework {
    public static void main(String[] args) {
        Engine engine = new Engine("v8");
        PetrolBank petrolBank = new PetrolBank(60);
        Car car = new Car(engine, petrolBank);

        car.fillUp(10);
        car.turnOver();
        car.run();
        car.stop(100);
        System.out.println(car.getKilometrage());
    }
}