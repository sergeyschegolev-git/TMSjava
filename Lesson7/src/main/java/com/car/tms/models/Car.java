package com.car.tms.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String mark;
    private int manufactureYear;
    private int kilometrage = 0;
    private PetrolBank petrolBank;

    @Setter(value = AccessLevel.NONE)
    private Engine engine;

    public Car(Engine engine, PetrolBank petrolBank) {
        this.engine = engine;
        this.petrolBank = petrolBank;
    }

    public int getPetrolQuantity() {
        return petrolBank.getCurrentPetrolQuantity();
    }

    public void fillUp(int quantity) {
        petrolBank.fillUp(quantity);
    }

    public void turnOver() {
        if (petrolBank.getCurrentPetrolQuantity() == 0) {
            System.out.println("You cannot turn over the car without petrol");
        } else {
            engine.setCharged(true);
        }
    }

    public void run() {
        if (!engine.isCharged()) {
            System.out.println("You cannot run uncharged car");
        } else {
            System.out.println("Your car is running");
        }
    }

    public void stop(int destination) {
        System.out.println("Your car was stopped");
        engine.setCharged(false);
        kilometrage += destination;
    }
}
