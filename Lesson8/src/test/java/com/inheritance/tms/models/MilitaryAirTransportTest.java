package com.inheritance.tms.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilitaryAirTransportTest {

    @Test
    void shot_successful() {
        MilitaryAirTransport plane = MilitaryAirTransport.builder()
                .hasEscapeSystem(true)
                .mark("Boing")
                .maxSpeed(600)
                .rocketsQuantity(300)
                .minLandingStrip(150)
                .weight(10000)
                .wingSpan(50)
                .CV(100)
                .build();

        String expected = "Ракета пошла...";
        String actual = plane.shot();

        assertEquals(expected, actual);
    }

    @Test
    void shot_not_successful() {
        MilitaryAirTransport plane = MilitaryAirTransport.builder()
                .hasEscapeSystem(true)
                .mark("Boing")
                .maxSpeed(600)
                .rocketsQuantity(300)
                .minLandingStrip(150)
                .weight(10000)
                .wingSpan(50)
                .CV(100)
                .build();

        plane.setRocketsQuantity(0);
        String expected = "Боеприпасы отсутствуют";
        String actual = plane.shot();

        assertEquals(expected, actual);
    }

    @Test
    void catapult_successful() {
        MilitaryAirTransport plane = MilitaryAirTransport.builder()
                .hasEscapeSystem(true)
                .mark("Boing")
                .maxSpeed(600)
                .rocketsQuantity(300)
                .minLandingStrip(150)
                .weight(10000)
                .wingSpan(50)
                .CV(100)
                .build();

        String expected = "Катапультирование прошло успешно";
        String actual = plane.catapult();

        assertEquals(expected, actual);
    }

    @Test
    void catapult_not_successful() {
        MilitaryAirTransport plane = MilitaryAirTransport.builder()
                .hasEscapeSystem(false)
                .mark("Boing")
                .maxSpeed(600)
                .rocketsQuantity(300)
                .minLandingStrip(150)
                .weight(10000)
                .wingSpan(50)
                .CV(100)
                .build();

        String expected = "У вас нет такой системы";
        String actual = plane.catapult();

        assertEquals(expected, actual);
    }
}