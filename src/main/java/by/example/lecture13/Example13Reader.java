package by.example.lecture13;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example13Reader {

    public static final String FILENAME = "src/main/resources/fileForWriter.txt";
    public static final File FILE = new File(FILENAME);


    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader(FILENAME);

        char[] chars = new char[(int) FILE.length()];

        reader.read(chars);

        System.out.println(new String(chars));


    }

}
