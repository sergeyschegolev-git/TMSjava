package com.inheritance.tms.models;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    @org.junit.jupiter.api.Test
    void calculateDestination() {
        Auto auto = Auto.builder()
                .fuelConsumptionRate(7)
                .CV(20)
                .bodyType("hatchback")
                .mark("Toyota")
                .passengersQuantity(5)
                .wheelsQuantity(4)
                .weight(3000)
                .maxSpeed(210)
                .build();

        String expected = "Результат работы метода должен вывести такую строчку:\n" +
                "За время 4 ч, автомобиль Toyota\n" +
                "двигаясь с максимальной скоростью 210 км/ч\n" +
                "проедет 840 км и израсходует 56 литров топлива.";
        String actual = auto.calculateDestination(4);

        assertEquals(expected, actual);
    }
}