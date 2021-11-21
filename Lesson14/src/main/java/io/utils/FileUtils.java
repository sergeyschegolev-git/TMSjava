package io.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class FileUtils {
    private FileUtils() {
    }

    public static BufferedReader getBufferedReaderForCustomPath(String path) throws IOException {
        return new BufferedReader(new FileReader(path));
    }

    public static void writeToFile(String path, String data) throws IOException {
        FileWriter writer = new FileWriter(path);

        writer.append(data);
    }

    public static List<String> getLines(BufferedReader reader) throws IOException {
        List<String> lines = new ArrayList();
        String line;

        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }
}
