package com.inheritance.tms.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CivilAirTransportTest {
    private CivilAirTransport plane;

    @BeforeEach
    void setUp() {
        plane = CivilAirTransport.builder()
                .hasBusinessClass(true)
                .mark("Boing")
                .maxSpeed(600)
                .passengersQuantity(300)
                .minLandingStrip(150)
                .weight(10000)
                .wingSpan(50)
                .power(100)
                .build();
    }

    @Test
    void canBoard_successful() {
        String expected = "Самолет загружен";
        String actual = plane.canBoard(200);

        assertEquals(expected, actual);
    }

    @Test
    void canBoard_not_successful() {
        plane.setPassengersQuantity(300);

        String expected = "Вам нужен самолет побольше";
        String actual = plane.canBoard(400);

        assertEquals(expected, actual);
    }
}