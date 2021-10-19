package com.car.tms.models;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Engine {
    private String type;
    private boolean isCharged = false;

    public Engine(String type) {
        this.type = type;
    }
}
