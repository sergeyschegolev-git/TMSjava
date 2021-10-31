package com.inheritance.tms.models;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    private Auto auto;

    @BeforeEach
    void setUp() {
        auto = Auto.builder()
                .fuelConsumptionRate(7)
                .power(20)
                .bodyType("hatchback")
                .mark("Toyota")
                .passengersQuantity(5)
                .wheelsQuantity(4)
                .weight(3000)
                .maxSpeed(210)
                .build();
    }

    @org.junit.jupiter.api.Test
    void calculateDestination() {
        String expected = "За время 4 ч, автомобиль Toyota\n" +
                "двигаясь с максимальной скоростью 210 км/ч\n" +
                "проедет 840 км и израсходует 56 литров топлива.";
        String actual = auto.calculateDestination(4);

        assertEquals(expected, actual);
    }
}