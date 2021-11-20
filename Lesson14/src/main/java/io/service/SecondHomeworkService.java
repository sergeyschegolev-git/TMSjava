package io.service;

import io.utils.TextUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.BreakIterator;

public class SecondHomeworkService implements Runable {
    @Override
    public void run() throws IOException {
        String PATH = "Lesson14/src/main/resources/homework2";
        try (FileReader reader = new FileReader(PATH + "/input.txt");
             BufferedReader bufferedReader = new BufferedReader((reader));
             FileWriter writer = new FileWriter(PATH + "/output.txt")) {
            StringBuilder stringBuilder = convertTextFromFileIntoString(bufferedReader);
            writeSentencesIntoFile(writer, stringBuilder);
        }
    }

    private StringBuilder convertTextFromFileIntoString(BufferedReader bufferedReader) throws IOException {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            if (TextUtils.isAnySymbolsInLine(line)) {
                stringBuilder.append(line);
            }
        }

        return stringBuilder;
    }

    private void writeSentencesIntoFile(FileWriter writer, StringBuilder stringBuilder) throws IOException {
        BreakIterator bi = BreakIterator.getSentenceInstance();
        bi.setText(stringBuilder.toString());
        int index = 0;
        while (bi.next() != BreakIterator.DONE) {
            String sentence = stringBuilder.substring(index, bi.current());

            boolean isPossibleToAppend = TextUtils.hasPalindromeInString(sentence)
                    || TextUtils.isSentenceConsistWordsQuantity(3, 5, sentence);

            if (isPossibleToAppend) {
                writer.append(sentence);
                writer.append('\n');
            }
            index = bi.current();
        }
    }
}
