package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Truck extends LandTransport {
    private int payload;

    public String description() {
        return String.format("payload: %d" +
                        "wheelsQuantity: %d" +
                        "fuelConsumptionRate: %d" +
                        "capacity: %f" +
                        "maxSpeed: %d" +
                        "weight: %d" +
                        "mark: %s",
                payload,
                super.getWheelsQuantity(),
                super.getFuelConsumptionRate(),
                super.getCapacity(),
                super.getMaxSpeed(),
                super.getWeight(),
                super.getMark());
    }

    public String canLoad(int payload) {
        if (this.payload <= payload) {
            return "Грузовик загружен";
        } else {
            return "Вам нужен грузовик побольше";
        }
    }
}
