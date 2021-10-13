package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    String processor;
    int memory;
    int hardDisk;
    int resource;

    public Computer(String proc, int memory, int hardDisk, int resource) {
        this.processor = proc;
        this.memory = memory;
        this.hardDisk = hardDisk;
        this.resource = resource;
    }

    public void describeComputer() {
        System.out.println("Processor: " + this.processor);
        System.out.println("Memory: " + this.memory);
        System.out.println("Hard disk: " + this.hardDisk);
        System.out.println("Resources: " + this.resource);
    }

    private boolean getRandomOperationResult(String operationQuestion) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println(operationQuestion + " ");

        int randomInt = random.nextInt(2);
        int enteredNumber = scanner.nextInt();

        return randomInt == enteredNumber;
    }

    public void on() {
        if (this.resource == 0) {
            System.out.println("Computer was crushed");
            return;
        }

        boolean wasOperationSuccessful =
                this.getRandomOperationResult("Please, enter 0 or 1 to turn on the computer: ");

        if (wasOperationSuccessful) {
            System.out.println("Computer is on");
            this.off();
        } else {
            System.out.println("Computer was crushed");
        }
    }

    public void off() {
        if (this.resource == 0) {
            System.out.println("Computer was crushed");
            return;
        }

        this.resource--;
        boolean wasOperationSuccessful =
                this.getRandomOperationResult("Please, enter 0 or 1 to turn off the computer: ");

        if (wasOperationSuccessful) {
            System.out.println("Computer is off");
        } else {
            System.out.println("Computer was crushed");
        }
    }
}
