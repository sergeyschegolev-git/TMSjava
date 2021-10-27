package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class MilitaryAirTransport extends AirTransport {
    private boolean hasEscapeSystem;
    private int rocketsQuantity;

    public String description() {
        return String.format("rocketsQuantity: %d" +
                        "hasEscapeSystem: %b" +
                        "wingSpan: %d" +
                        "minLandingStrip: %d" +
                        "capacity: %f" +
                        "maxSpeed: %d" +
                        "weight: %d" +
                        "mark: %s",
                rocketsQuantity,
                hasEscapeSystem,
                super.getWingSpan(),
                super.getMinLandingStrip(),
                super.getCapacity(),
                super.getMaxSpeed(),
                super.getWeight(),
                super.getMark());
    }

    public String shot() {
        if (rocketsQuantity > 0) {
            return "Ракета пошла...";
        } else {
            return "Боеприпасы отсутствуют";
        }
    }

    public String catapult() {
        if (hasEscapeSystem) {
            return "Катапультирование прошло успешно";
        } else {
            return "У вас нет такой системы";
        }
    }
}
