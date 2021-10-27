package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class CivilAirTransport extends AirTransport {
    private int passengersQuantity;
    private boolean hasBusinessClass;

    public String description() {
        return String.format("passengersQuantity: %d; " +
                        "hasBusinessClass: %b; " +
                        "wingSpan: %d; " +
                        "minLandingStrip: %d; " +
                        "capacity: %f; " +
                        "maxSpeed: %d; " +
                        "weight: %d; " +
                        "mark: %s; ",
                passengersQuantity,
                hasBusinessClass,
                super.getWingSpan(),
                super.getMinLandingStrip(),
                super.getCapacity(),
                super.getMaxSpeed(),
                super.getWeight(),
                super.getMark());
    }

    public String canBoard(int passengersQuantity) {
        if (this.passengersQuantity >= passengersQuantity) {
            return "Самолет загружен";
        } else {
            return "Вам нужен самолет побольше";
        }
    }
}
