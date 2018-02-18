package sample.engine.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
    public static byte[] readAllBytes(String fileName) {
        Path path = Paths.get(fileName);
        try {
            byte[] data = Files.readAllBytes(path);
            return data;
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }

    }

    public void writeText(String fileName, String text) {
        try (PrintStream out = new PrintStream(new FileOutputStream(fileName))) {
            out.print(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

