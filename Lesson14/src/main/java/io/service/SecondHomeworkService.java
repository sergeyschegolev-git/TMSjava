package io.service;

import io.utils.FileUtils;
import io.utils.TextUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHomeworkService implements Runable {
    private final String PATH = "Lesson14/src/main/resources/homework2";

    @Override
    public void run() throws IOException {
        try (BufferedReader bufferedReader = FileUtils.getBufferedReaderForCustomPath(PATH + "/input.txt")) {
            List<String> lines = FileUtils.getLines(bufferedReader);
            lines = removeEmptyLines(lines);
            writeSentencesIntoFile(TextUtils.convertListToString(lines, ""));
        }
    }

    private List<String> removeEmptyLines(List<String> lines) {
        return lines.stream().filter(TextUtils::isAnySymbolsInLine).collect(Collectors.toList());
    }

    private void writeSentencesIntoFile(String string) throws IOException {
        BreakIterator bi = BreakIterator.getSentenceInstance();
        bi.setText(string);
        int index = 0;
        while (bi.next() != BreakIterator.DONE) {
            String sentence = string.substring(index, bi.current());

            boolean isPossibleToAppend = TextUtils.isSentenceConsistWordsQuantity(3, 5, sentence)
                    || TextUtils.hasPalindromeInString(sentence);

            if (isPossibleToAppend) {
                FileUtils.writeToFile(PATH + "/output.txt", sentence + '\n');
            }
            index = bi.current();
        }
    }
}
