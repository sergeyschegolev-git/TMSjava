package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Transport {
    private double power;
    private int maxSpeed;
    private int weight;
    private String mark;

    private double getCapacity() {
        return power * 0.74;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "capacity=" + getCapacity() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                '}';
    }
}
