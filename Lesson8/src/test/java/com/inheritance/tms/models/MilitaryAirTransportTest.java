package com.inheritance.tms.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MilitaryAirTransportTest {
    private MilitaryAirTransport plane;

    @BeforeEach
    void setUp() {
        plane = MilitaryAirTransport.builder()
                .hasEscapeSystem(true)
                .mark("Boing")
                .maxSpeed(600)
                .rocketsQuantity(300)
                .minLandingStrip(150)
                .weight(10000)
                .wingSpan(50)
                .power(100)
                .build();
    }

    @Test
    void shot_successful() {
        String expected = "Ракета пошла...";
        String actual = plane.shot();

        assertEquals(expected, actual);
    }

    @Test
    void shot_not_successful() {
        plane.setRocketsQuantity(0);
        String expected = "Боеприпасы отсутствуют";
        String actual = plane.shot();

        assertEquals(expected, actual);
    }

    @Test
    void catapult_successful() {
        String expected = "Катапультирование прошло успешно";
        String actual = plane.catapult();

        assertEquals(expected, actual);
    }

    @Test
    void catapult_not_successful() {
        plane.setHasEscapeSystem(false);

        String expected = "У вас нет такой системы";
        String actual = plane.catapult();

        assertEquals(expected, actual);
    }
}