package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("m1", 32, 1000, 10);

        computer.describeComputer();
        computer.on();
        computer.off();
    }
}
