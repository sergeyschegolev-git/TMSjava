package io.service;

import io.utils.FileUtils;
import io.utils.TextUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class ThirdHomeworkService implements Runable {
    private final String PATH = "Lesson14/src/main/resources/homework3";

    @Override
    public void run() throws IOException {
        try (BufferedReader bufferedTextReader = FileUtils.getBufferedReaderForCustomPath(PATH + "/text.txt");
             BufferedReader bufferedBlackListReader = FileUtils.getBufferedReaderForCustomPath(PATH + "/black_list.txt")
        ) {
            String text = TextUtils.convertListToString(FileUtils.getLines(bufferedTextReader), "");
            List<String> blackList = FileUtils.getLines(bufferedBlackListReader);

            if (TextUtils.isTextContainWords(text, blackList.toArray(String[]::new))) {
                System.out.println("Text contains forbidden words");
            } else {
                System.out.println("Text does not contain forbidden words");
            }
        }
    }
}
