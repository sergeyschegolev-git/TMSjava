package io.service;

import io.model.Car;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FourthHomeworkService implements Runable {
    private final String PATH = "Lesson14/src/main/resources/homework4";

    @Override
    public void run() throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATH + "/car.dat"))) {
            Car car = Car.builder()
                    .engine("V8")
                    .mark("Toyota")
                    .price(10000)
                    .speed(230)
                    .build();

            outputStream.writeObject(car);
        }
    }
}
