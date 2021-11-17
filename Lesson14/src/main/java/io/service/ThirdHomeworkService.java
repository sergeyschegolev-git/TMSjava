package io.service;

import io.utils.TextUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThirdHomeworkService implements Runable {
    @Override
    public void run() throws IOException {
        String PATH = "Lesson14/src/main/resources/homework3";
        try (FileReader textReader = new FileReader(PATH + "/text.txt");
             FileReader blackListReader = new FileReader(PATH + "/black_list.txt");
             BufferedReader bufferedTextReader = new BufferedReader((textReader));
             BufferedReader bufferedBlackListReader = new BufferedReader((blackListReader))
        ) {

            String line;
            StringBuilder text = new StringBuilder();
            StringBuilder blackList = new StringBuilder();
            while ((line = bufferedTextReader.readLine()) != null) {
                text.append(line);
            }

            while ((line = bufferedBlackListReader.readLine()) != null) {
                blackList.append(line);
                blackList.append(" ");
            }

            if (TextUtils.isTextContainWords(text.toString(), blackList.toString().split(" "))) {
                System.out.println("Text contains forbidden words");
            } else {
                System.out.println("Text does not contain forbidden words");
            }
        }
    }
}
