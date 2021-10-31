package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Auto extends LandTransport {
    private String bodyType;
    private int passengersQuantity;

    public String calculateDestination(int time) {
        int destination = getDestination(time);
        int fuelConsumption = getFuelConsumption(destination);
        return String.format("За время %d ч, автомобиль %s\n" +
                        "двигаясь с максимальной скоростью %d км/ч\n" +
                        "проедет %d км и израсходует %d литров топлива.",
                time, super.getMark(), super.getMaxSpeed(), destination, fuelConsumption);
    }

    private int getDestination(int time) {
        return super.getMaxSpeed() * time;
    }

    private int getFuelConsumption(int destination) {
        return destination / 100 * super.getFuelConsumptionRate();
    }
}
