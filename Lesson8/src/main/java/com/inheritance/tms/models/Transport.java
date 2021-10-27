package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Transport {
    private int CV;
    private int maxSpeed;
    private int weight;
    private String mark;

    protected double getCapacity() {
        return CV * 0.74;
    }
}
