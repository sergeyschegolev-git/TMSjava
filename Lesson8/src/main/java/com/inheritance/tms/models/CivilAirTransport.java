package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@ToString(callSuper = true)
public class CivilAirTransport extends AirTransport {
    private int passengersQuantity;
    private boolean hasBusinessClass;

    public String canBoard(int passengersQuantity) {
        if (this.passengersQuantity >= passengersQuantity) {
            return "Самолет загружен";
        } else {
            return "Вам нужен самолет побольше";
        }
    }
}
