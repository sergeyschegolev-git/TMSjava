package com.car.tms.models;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Engine {
    private final String type;
    private boolean isCharged;

    public Engine(String type) {
        this.type = type;
    }
}
