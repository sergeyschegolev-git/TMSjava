package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String processor;
    private int memory;
    private int hardDisk;
    private int resource;

    public Computer(String processor, int memory, int hardDisk, int resource) {
        this.processor = processor;
        this.memory = memory;
        this.hardDisk = hardDisk;
        this.resource = resource;
    }

    public void describeComputer() {
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Hard disk: " + hardDisk);
        System.out.println("Resources: " + resource);
    }

    public void on() {
        if (resource == 0) {
            System.out.println("Computer was crushed");
        } else {
            boolean wasOperationSuccessful =
                    getRandomOperationResult("Please, enter 0 or 1 to turn on the computer: ");

            if (wasOperationSuccessful) {
                System.out.println("Computer is on");
                off();
            } else {
                System.out.println("Computer was crushed");
            }
        }
    }

    public void off() {
        if (resource == 0) {
            System.out.println("Computer was crushed");
        } else {
            resource--;
            boolean wasOperationSuccessful =
                    this.getRandomOperationResult("Please, enter 0 or 1 to turn off the computer: ");

            if (wasOperationSuccessful) {
                System.out.println("Computer is off");
                on();
            } else {
                System.out.println("Computer was crushed");
            }
        }
    }

    private boolean getRandomOperationResult(String operationQuestion) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println(operationQuestion + " ");

        int randomInt = random.nextInt(2);
        int enteredNumber = scanner.nextInt();

        return randomInt == enteredNumber;
    }
}
