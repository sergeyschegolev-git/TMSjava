package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Auto extends LandTransport {
    private String bodyType;
    private int passengersQuantity;

    public String description() {
        return String.format("bodyType: %s" +
                        "passengersQuantity: %d" +
                        "wheelsQuantity: %d" +
                        "fuelConsumptionRate: %d" +
                        "capacity: %f" +
                        "maxSpeed: %d" +
                        "weight: %d" +
                        "mark: %s",
                bodyType,
                passengersQuantity,
                super.getWheelsQuantity(),
                super.getFuelConsumptionRate(),
                super.getCapacity(),
                super.getMaxSpeed(),
                super.getWeight(),
                super.getMark());
    }

    public String calculateDestination(int time) {
        int destination = getDestination(time);
        int fuelConsumption = getFuelConsumption(destination);
        return String.format("Результат работы метода должен вывести такую строчку:\n" +
                        "За время %d ч, автомобиль %s\n" +
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
