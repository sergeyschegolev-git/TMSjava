package io.service;

import io.utils.FileUtils;
import io.utils.TextUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class FirstHomeworkService implements Runable {
    private final String PATH = "Lesson14/src/main/resources/homework1";

    @Override
    public void run() throws IOException {
        try (BufferedReader bufferedReader = FileUtils.getBufferedReaderForCustomPath(PATH + "/input.txt")) {

            List<String> words = FileUtils.getLines(bufferedReader);
            writePalindromes(words);
        }
    }

    private void writePalindromes(List<String> words) throws IOException {
        for (String word: words) {
            if (TextUtils.isPalindrome(word)) {
                FileUtils.writeToFile(PATH + "/output.txt", word + '\n');
            }
        }
    }
}
