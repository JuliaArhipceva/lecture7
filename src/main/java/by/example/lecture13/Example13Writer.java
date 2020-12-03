package by.example.lecture13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example13Writer {

    public static final String FILENAME = "src/main/resources/fileForWriter.txt";

    public static void main(String[] args) throws IOException {

    }

    private static void showAppend() throws IOException {
        Writer writer = new FileWriter(FILENAME);
        for (int i = 0; i < 10; i++) {
            writer.append(i + " ");
        }
        writer.flush();
        writer.close();

        writer = new FileWriter(FILENAME);
        for (int i = 0; i < 10; i++) {
            writer.write(i + " ");
        }
        writer.flush();
    }

    private static void showWriteString() throws IOException {
        Writer writer = new FileWriter(FILENAME);

        writer.write("str");

        writer.close();
//        writer.write("another str"); // not allowed after close
//        writer.flush();

        writer = new FileWriter(FILENAME);
        writer.write("another str");
        writer.flush();
    }

}
