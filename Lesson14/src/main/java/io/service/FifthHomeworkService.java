package io.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.model.AnotherCar;

import java.io.File;
import java.io.IOException;

public class FifthHomeworkService implements Runable {
    private final String PATH = "Lesson14/src/main/resources/homework5";

    @Override
    public void run() throws IOException {
        AnotherCar car = toCar(PATH + "/car.json");
        System.out.println(car);
    }

    private AnotherCar toCar(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(new File(path), AnotherCar.class);
    }
}
