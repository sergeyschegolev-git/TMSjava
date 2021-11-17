package io.service;

import io.utils.TextUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FirstHomeworkService implements Runable {

    @Override
    public void run() throws IOException {
        String PATH = "Lesson14/src/main/resources/homework1";
        try (FileReader reader = new FileReader(PATH + "/input.txt");
             BufferedReader bufferedReader = new BufferedReader((reader));
             FileWriter writer = new FileWriter(PATH + "/output.txt")) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (TextUtils.isPalindrome(line)) {
                    writer.append(line);
                    writer.append('\n');
                }
            }
        }
    }
}
