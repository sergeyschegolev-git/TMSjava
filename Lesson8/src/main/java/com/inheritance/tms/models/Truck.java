package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Truck extends LandTransport {
    private int payload;

    public String canLoad(int payload) {
        if (this.payload <= payload) {
            return "Грузовик загружен";
        } else {
            return "Вам нужен грузовик побольше";
        }
    }
}
