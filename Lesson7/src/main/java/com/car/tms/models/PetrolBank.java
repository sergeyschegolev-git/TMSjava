package com.car.tms.models;

import lombok.Getter;

@Getter
public class PetrolBank {
    private final int fullBank;
    private int currentPetrolQuantity = 0;

    public PetrolBank(int fullBank) {
        this.fullBank = fullBank;
    }

    public String fillUp(int quantity) {
        if (currentPetrolQuantity + quantity > fullBank) {
            return "You petrol bank will be overflowed";
        }

        currentPetrolQuantity += quantity;
        return "Fill up was successful";
    }
}
